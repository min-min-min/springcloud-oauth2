package com.chenjing.authserver.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by Chenjing on 2017/10/16.
 *
 * @author Chenjing
 */
@RestController
public class UserController {

    @RequestMapping("/user")
    public Principal user(Principal user) {
        System.out.println(user);
        return user;
    }

    @RequestMapping("/")
    public String bb() {
        return "服务验证中心的主页面";
    }

}
