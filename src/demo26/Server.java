package demo26;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: java_example
 * @description: 服务端
 * @author: yangchenglong
 * @create: 2019-07-26 11:35
 */
public class Server{

    public static void main(String[] args) {
        try {
            int port = 9000;
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("服务端上线");
            while (true) {
                Socket server = serverSocket.accept();
                new Thread(new SendThread(server)).start();
                new Thread(new ReceiveThread(server)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
