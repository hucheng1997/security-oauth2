package com.hucheng.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * @author HuChan
 */
@Configuration
public class TokenConfig {

    private static final String SIGN_KEY = "hello123";

    @Bean
    public JwtAccessTokenConverter tokenConverter() {
        JwtAccessTokenConverter tokenConverter = new JwtAccessTokenConverter();
        //采用对称加密算法
        tokenConverter.setSigningKey(SIGN_KEY);
        return tokenConverter;
    }


    @Bean
    public TokenStore tokenStore() {
        //将用户信息存储在token中，性能更快
        return new JwtTokenStore(tokenConverter());
    }
}
