package com.itxiaoer.demo.java8.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : liuyk
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apple {
    private String name;
    private String color;
    private String weight;
}
