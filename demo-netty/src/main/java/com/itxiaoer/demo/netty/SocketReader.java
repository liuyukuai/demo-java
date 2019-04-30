package com.itxiaoer.demo.netty;

import com.itxiaoer.commons.core.json.JsonUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * socket内容读取器
 *
 * @author : liuyk
 */
@Slf4j
@SuppressWarnings("WeakerAccess")
public class SocketReader {

    public static void reader(Socket socket, ChatHandler handler) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuilder sb = new StringBuilder();
            char[] chars = new char[8192];
            int len = 0;
            while ((len = reader.read(chars)) != -1) {
                sb.append(String.valueOf(chars, 0, len));
                Transmission transmission = JsonUtil.toBean(sb.toString(), Transmission.class).orElseThrow(RuntimeException::new);
                SocketContainer.put(transmission.getId(), socket);
                handler.handle(socket, transmission);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
