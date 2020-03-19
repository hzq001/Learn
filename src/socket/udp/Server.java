package socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author zq.huang
 * @date 2020/2/26
 */
public class Server {

    public static void main(String[] args) throws IOException {
        String sendString = "Hello UDPClient.";
        byte[] buffer = new byte[1024];

        DatagramSocket datagramSocket = new DatagramSocket(3000);

        DatagramPacket datagramPacketReceive = new DatagramPacket(buffer, 1024);

        System.out.println("Server is on, waiting for client to send data");

        boolean flag = true;

        while (flag) {
            datagramSocket.receive(datagramPacketReceive);
            System.out.println("Server data from client.");
            String receiveString = new String(datagramPacketReceive.getData(), 0, datagramPacketReceive.getLength())
                    + " from " + datagramPacketReceive.getAddress().getHostAddress() + ":" + datagramPacketReceive.getPort();
            System.out.println(receiveString);
            DatagramPacket datagramPacketSend = new DatagramPacket(sendString.getBytes(), sendString.length(), datagramPacketReceive.getAddress(), 9000);

        }


    }
}
