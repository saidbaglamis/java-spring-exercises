package com.said.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    @RequestMapping("/say-hello")
    @ResponseBody
    private String sayHello() {
        return "hello world";
    }

    @RequestMapping("/say-hello-htlm")
    @ResponseBody
    private void sayHelloHtml() {

    }

    @RequestMapping("/say-hello-jsp")
    private String sayHelloJsp() {
        return "sayHello";
    }
}
