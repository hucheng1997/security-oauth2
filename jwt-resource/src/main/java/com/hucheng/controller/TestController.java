package com.hucheng.controller;

import com.hucheng.bean.UserDTO;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
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
        UserDTO userDTO = (UserDTO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userDTO.getFullname() + "访问资源成功";
    }
}
