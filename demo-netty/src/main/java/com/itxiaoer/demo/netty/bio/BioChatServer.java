package com.itxiaoer.demo.netty.bio;

import com.itxiaoer.demo.netty.SocketDispatcher;
import com.itxiaoer.demo.netty.SocketReader;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * bio 聊天服务端
 * 支持群聊、私聊、用户内置
 *
 * @author : liuyk
 */
@Slf4j
public class BioChatServer {

    private static ExecutorService executorService = new ThreadPoolExecutor(10, 10, 0L, TimeUnit.SECONDS, new LinkedBlockingDeque<>(), (r) -> new Thread(r, "chat"));

    private static ServerSocket serverSocket;

    private static SocketDispatcher dispatcher;

    private static void init() {
        try {
            serverSocket = new ServerSocket(9000);
            dispatcher = new SocketDispatcher();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void start() {
        init();
        while (true) {
            try {
                final Socket accept = serverSocket.accept();
                executorService.execute(() -> SocketReader.reader(accept, dispatcher));
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }

    public static void main(String[] args) {
        start();
    }
}
