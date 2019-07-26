package demo26;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @program: java_example
 * @description: 客户端1
 * @author: yangchenglong
 * @create: 2019-07-26 11:43
 */
public class Client2 {

    public static void main(String[] args) {
        try {
            //创建客户端
            Socket client = new Socket("127.0.0.1", 9000);
            new Thread(new SendThread(client)).start();
            new Thread(new ReceiveThread(client)).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
