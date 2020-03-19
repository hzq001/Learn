package socket.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * @author zq.huang
 * @date 2020/2/25
 */
public class Client {
    public static void main(String[] args) throws IOException {
        // 客户端与本机 20006 端口建立 TCP 连接
        Socket socket = new Socket("127.0.0.1",20006);
        socket.setSoTimeout(10000);

        // 获取键盘输入
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        // 获取 Socket 的输出流，用来发送数据到服务端
        PrintStream out = new PrintStream(socket.getOutputStream());

        // 获取 Socket 的输入流，用来接收从服务端发送的数据
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        boolean flag = true;

        while (flag){
            System.out.println("输入信息:");
            String str = input.readLine();
            // 发送数据到服务端
            out.println(str);

            if ("bye".equals(str)){
                flag = false;
            } else {

               try {
                   String echo = bufferedReader.readLine();
                   System.out.println(echo);
               } catch (SocketTimeoutException e) {
                   System.out.println("Time out, no response.");
               }
            }
        }

        input.close();

        // 关闭 Socket ，只关闭 socket，其关联的输入输出流也会被关闭
        socket.close();

    }
}
