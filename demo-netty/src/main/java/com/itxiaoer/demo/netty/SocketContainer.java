package com.itxiaoer.demo.netty;

import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 所有链接容器
 *
 * @author : liuyk
 */
public final class SocketContainer {
    private static final Map<String, Socket> SOCKET_CONTAINER = new ConcurrentHashMap<>();


    public static void put(String id, Socket socket) {
        SOCKET_CONTAINER.put(id, socket);
    }

    public static Socket get(String id) {
        return SOCKET_CONTAINER.get(id);
    }

}
