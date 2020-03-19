package socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author zq.huang
 * @date 2020/2/25
 */
public class Client {

    /**
     * 设置接收数据的超时时间
     */
    private static final int TIME_OUT = 5000;

    /**
     * 设置重发数据的最多次数
     */
    private static final int MAX_NUM = 5;

    public static void main(String[] args) throws IOException {
        // 发送内容
        String stringSend = "Hello UDPServer";
        // 缓冲
        byte[] buffer = new byte[1024];

        // 设置客户端在9000端口监听接收到到数据
        DatagramSocket datagramSocket = new DatagramSocket(9000);

        // 本地地址
        InetAddress inetAddress = InetAddress.getLocalHost();

        // 定义用来发送数据到 DatagramPacket
        DatagramPacket datagramPacketSend = new DatagramPacket(stringSend.getBytes(), stringSend.length(), inetAddress, 3000);

        // 定义用来接收数据的 DatagramPacket
        DatagramPacket datagramPacketReceive = new DatagramPacket(buffer, 1024);

        // 设置超时时间
        datagramSocket.setSoTimeout(TIME_OUT);

        // 重试次数
        int retryNum = 0;

        // 接收数据标示
        boolean receiveFlag = false;

        while (!receiveFlag && retryNum <MAX_NUM){
            // 发送数据
            datagramSocket.send(datagramPacketSend);

            datagramSocket.receive(datagramPacketReceive);

            if (!datagramPacketSend.getAddress().equals(inetAddress)){
                throw new IOException("Received packet from an unknown source.");
            }

            receiveFlag = true;

        }

        if (receiveFlag){
            System.out.println("client received data from server.");
            String receiveString = new String(datagramPacketReceive.getData(),0,datagramPacketReceive.getLength())
                    +" from " + datagramPacketReceive.getAddress().getHostAddress()+":"+datagramPacketReceive.getPort();
            System.out.println(receiveString);

            datagramPacketReceive.setLength(1024);
        } else {
            System.out.println("No response -- give up.");
        }

        datagramSocket.close();

    }
}
