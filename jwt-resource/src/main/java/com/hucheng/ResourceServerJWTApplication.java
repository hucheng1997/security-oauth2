package com.hucheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author HuChan
 */
@SpringBootApplication
@EnableResourceServer
public class ResourceServerJWTApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResourceServerJWTApplication.class, args);
    }
}
