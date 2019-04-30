package com.itxiaoer.demo.netty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * chat 传输对象
 *
 * @author : liuyk
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transmission implements Serializable {

    private static final long serialVersionUID = -6296858684353427162L;

    private String id;

    private String type;

    private String message;

    private String receiver;


}
