package com.hucheng.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;

/**
 * @author HuChan
 */
@Configuration
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        //远程token校验
        RemoteTokenServices tokenServices = new RemoteTokenServices();
        //配置校验token地址
        tokenServices.setCheckTokenEndpointUrl("http://127.0.0.1:3001/oauth/check_token");
        tokenServices.setClientId("c1");
        tokenServices.setClientSecret("123");

        resources.resourceId("res1")
                .tokenServices(tokenServices)
                .stateless(true);//不将token记录在session中
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/**").access("#oauth2.hasScope('all')")//授权范围
                .and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);//不将token记录在session中
    }
}
