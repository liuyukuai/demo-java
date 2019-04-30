package com.itxiaoer.demo.netty;

import lombok.extern.slf4j.Slf4j;

import java.net.Socket;

/**
 * 私聊处理
 *
 * @author : liuyk
 */
@Slf4j
public class SystemChatHandler implements ChatHandler {

    @Override
    public void handle(Socket socket, Transmission transmission) {
        log.info("read message = {}", transmission);
    }
}
