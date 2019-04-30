package com.itxiaoer.demo.netty;

import lombok.extern.slf4j.Slf4j;

import java.net.Socket;

/**
 * 私聊处理
 *
 * @author : liuyk
 */
@Slf4j
public class PrivateChatHandler implements ChatHandler {

    @Override
    public void handle(Socket socket, Transmission transmission) {
        log.info(UserContainer.user(transmission.getId()).getName() + "发送给" + UserContainer.user(transmission.getReceiver()).getName() + "的消息：" + transmission.getMessage());
        Socket receiveSocket = SocketContainer.get(transmission.getReceiver());
        if (receiveSocket == null) {
            transmission.setMessage("你私聊的用户不在线。");
            transmission.setReceiver(transmission.getId());
            transmission.setType(Constants.SYSTEM_CHAT);
            transmission.setId("9");
            SocketWriter.write(socket, transmission);
        } else {
            SocketWriter.write(receiveSocket, transmission);
        }
    }
}
