package socket.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zq.huang
 * @date 2020/2/25
 */
public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(20006);

        Socket socket = null;

        boolean flag = true;
        // 死循环一直监听新的连接
        while (flag){
            socket = serverSocket.accept();

            System.out.println("与客户端连接成功！");
            new Thread(new ServerThread(socket)).start();
        }
        serverSocket.close();

    }
}
