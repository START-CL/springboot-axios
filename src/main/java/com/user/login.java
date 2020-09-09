package com.user;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.Objects;

@Controller
public class login {

    @RequestMapping(value = "axios")
    public String hello() {
        return "user/axios-demo.html";
    }

    @RequestMapping(value = "message")
    @ResponseBody
    public String message(@RequestBody Map<String,Object> message) {
        System.out.println("数据是:" + message);
        return "成功";
    }




}
