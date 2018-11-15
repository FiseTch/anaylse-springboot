package com.tch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/11/15 17:40
 */

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Autowired
    private DataSource dataSource;
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().authenticated()
                .and().formLogin().and()
                .httpBasic();
        
        //对每个请求进行细粒度安全性控制
        http.authorizeRequests()
                .antMatchers("/tch").authenticated()//默认所有从/tch来的路径进行校验
                // .antMatchers("/").authenticated()
                .anyRequest().permitAll();
    }
    
    //使用基于内存的用户存储
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()//启动内存进行用户存储
                .withUser("user").password("123456").roles("USER").and()
                .withUser("admin").password("123456").authorities("ROLE_USER,ROLE_ADMIN");
        
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery("select username ,password,true from Spitter where username = ?")
                .authoritiesByUsernameQuery("select username 'ROLE_USER' from Spitter where username =?");
    }
    //基于数据库表进行认证
    
}
