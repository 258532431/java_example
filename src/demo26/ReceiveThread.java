package demo26;

import java.io.*;
import java.net.Socket;

/**
 * @program: java_example
 * @description: 接收消息线程类
 * @author: yangchenglong
 * @create: 2019-07-26 15:02
 */
public class ReceiveThread implements Runnable {

    private Socket socket;

    public ReceiveThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            while (true){
                DataInputStream in = new DataInputStream(socket.getInputStream());
                System.out.println("对方说："+in.readUTF());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
