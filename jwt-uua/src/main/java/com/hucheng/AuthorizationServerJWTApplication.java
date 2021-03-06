package com.hucheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @author HuChan
 */
@SpringBootApplication
@EnableAuthorizationServer
public class AuthorizationServerJWTApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthorizationServerJWTApplication.class, args);
    }
}
