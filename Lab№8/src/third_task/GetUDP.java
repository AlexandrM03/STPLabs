package third_task;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class GetUDP {
    private final DatagramSocket socket;
    private final byte[] messageUDP = new byte[7];

    public GetUDP(int port) throws SocketException {
        socket = new DatagramSocket(port);
    }

    public void getMessages() throws IOException {
        socket.receive(new DatagramPacket(messageUDP, 7));
        var message = new String(messageUDP);
        System.out.println(message);
    }

    public static void main(String[] args) throws IOException {
        GetUDP getUDP = new GetUDP(4321);
        while (true)
            getUDP.getMessages();
    }
}
