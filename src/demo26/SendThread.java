package demo26;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @program: java_example
 * @description: 发送消息线程类
 * @author: yangchenglong
 * @create: 2019-07-26 14:54
 */
public class SendThread implements Runnable {

    private Socket socket;

    public SendThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("你说：");
                //发给内容给客户端
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                String content = scanner.next();
                out.writeUTF(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
