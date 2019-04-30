package com.itxiaoer.demo.netty;

import lombok.extern.slf4j.Slf4j;

import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : liuyk
 */
@Slf4j
public class SocketDispatcher implements ChatHandler {
    private static final Map<String, ChatHandler> HANDLER_MAP = new HashMap<>();

    static {
        HANDLER_MAP.put(Constants.PRIVATE_CHAT, new PrivateChatHandler());
        HANDLER_MAP.put(Constants.GROUP_CHAT, new PrivateChatHandler());
        HANDLER_MAP.put(Constants.PUBLIC_CHAT, new PrivateChatHandler());
        HANDLER_MAP.put(Constants.SYSTEM_CHAT, new SystemChatHandler());
    }


    @Override
    public void handle(Socket socket, Transmission transmission) {
        SocketContainer.put(transmission.getId(), socket);
        HANDLER_MAP.get(transmission.getType()).handle(socket, transmission);
    }
}
