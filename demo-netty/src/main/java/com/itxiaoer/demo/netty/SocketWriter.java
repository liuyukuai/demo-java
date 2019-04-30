package com.itxiaoer.demo.netty;

import com.itxiaoer.commons.core.json.JsonUtil;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * socket内容读取器
 *
 * @author : liuyk
 */
@SuppressWarnings("WeakerAccess")
public class SocketWriter {

    public static void write(Socket socket, Transmission transmission) {
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.write(JsonUtil.toJson(transmission));
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
