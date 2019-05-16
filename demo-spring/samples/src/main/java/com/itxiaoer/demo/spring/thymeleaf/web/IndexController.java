package com.itxiaoer.demo.spring.thymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : liuyk
 */
@Controller
public class IndexController {

    @GetMapping({"/", ""})
    public String index(Model model) {
        model.addAttribute("message", "hello thyme leaf.");
        return "index";
    }

}

