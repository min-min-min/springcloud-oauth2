package com.chenjing.third.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by Chenjing on 2017/10/17.
 *
 * @author Chenjing
 */
@RestController
public class BaseController {
    @GetMapping("/test")
    public String a() {
        return "经过验证你登录成功";
    }

    @GetMapping("/")
    public String b() {
        return "?????????????????????????????????";
    }

    @RequestMapping("/client")
    public String home(Principal user) {
        return "Hello " + user.getName();
    }
}
