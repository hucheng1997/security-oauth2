package com.hucheng.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HuChan
 */
@RestController
public class TestController {
    //测试接口
    @RequestMapping("/r1")
    @PreAuthorize("hasAnyAuthority('admin')")
    public String admin() {
        return "访问资源成功";
    }
}
