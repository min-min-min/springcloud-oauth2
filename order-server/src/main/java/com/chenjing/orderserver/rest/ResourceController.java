package com.chenjing.orderserver.rest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by Chenjing on 2017/10/17.
 *
 * @author Chenjing
 */
@RestController
public class ResourceController {

    @RequestMapping("/test")
    public String getResource(Principal principal) {
        return "SUCCESS，授权成功拿到资源啦.当前用户：" + principal.toString();
    }

    @RequestMapping("/test2")
    public String c() {
        return "hello test2";
    }

    @RequestMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String a() {
        return "admin";
    }

    @RequestMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public String b() {
        return "user";
    }
}
