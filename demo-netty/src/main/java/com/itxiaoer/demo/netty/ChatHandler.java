package com.itxiaoer.demo.netty;

import java.net.Socket;

/**
 * 聊天处理类
 *
 * @author : liuyk
 */
@FunctionalInterface
public interface ChatHandler {
    /**
     * 处理socket
     *
     * @param transmission transmission
     * @param socket       socket
     */
    void handle(Socket socket, Transmission transmission);
}
