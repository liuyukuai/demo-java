package com.itxiaoer.demo.netty.bio;

import com.itxiaoer.demo.netty.SocketClientReader;
import com.itxiaoer.demo.netty.SocketWriter;
import com.itxiaoer.demo.netty.Transmission;
import com.itxiaoer.demo.netty.UserContainer;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.Socket;

/**
 * @author : liuyk
 */
@Slf4j
public class BioClient {

    public static void doChat(String id, String receiver) {
        try {
            Socket socket = new Socket("127.0.0.1", 9000);
            SocketWriter.write(socket, new Transmission(id, "1", "hello " + UserContainer.user(receiver).getName(), receiver));
            SocketClientReader.reader(socket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
