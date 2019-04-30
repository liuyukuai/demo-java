package com.itxiaoer.demo.netty;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 用户容器
 *
 * @author : liuyk
 */

public class UserContainer {

    private static final Map<String, User> USER_CONTAINER = new HashMap<>();

    private static final Map<String, List<String>> GROUP_CONTAINER = new HashMap<>();

    static {
        // 初始化用户
        USER_CONTAINER.put("1", new User("1", "user1"));
        USER_CONTAINER.put("2", new User("2", "user2"));
        USER_CONTAINER.put("3", new User("3", "user3"));
        USER_CONTAINER.put("4", new User("4", "user4"));
        USER_CONTAINER.put("5", new User("5", "user5"));
        USER_CONTAINER.put("6", new User("6", "user6"));
        USER_CONTAINER.put("7", new User("7", "user7"));
        USER_CONTAINER.put("8", new User("8", "user8"));
        USER_CONTAINER.put("9", new User("", "系统"));

        GROUP_CONTAINER.put("1", Arrays.asList("2", "3", "4"));
        GROUP_CONTAINER.put("2", Arrays.asList("1", "3", "4"));
    }

    public static User user(String id) {
        return USER_CONTAINER.get(id);
    }


    public static List<User> group(String id) {
        List<String> strings = GROUP_CONTAINER.get(id);
        return strings.stream().map(USER_CONTAINER::get).collect(Collectors.toList());
    }

}
