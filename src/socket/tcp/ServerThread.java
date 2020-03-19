package socket.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @author zq.huang
 * @date 2020/2/25
 */
public class ServerThread implements Runnable {

    private Socket client = null;

    public ServerThread(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {

        try {
            PrintStream out = new PrintStream(client.getOutputStream());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));

            boolean flag = true;

            while (flag) {

                String str = bufferedReader.readLine();
                if (str == null || "".equals(str)) {
                    flag = false;
                } else {
                    if ("bye".equals(str)) {
                        flag = false;
                    } else {
                        out.println("echo:" + str);
                    }
                }

            }

            out.close();

            client.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
