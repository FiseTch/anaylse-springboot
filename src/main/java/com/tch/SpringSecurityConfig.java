package com.tch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 对springSecurity进行自行配置
 *
 * @author Tongch
 * @version 1.0
 * @time 2018/9/10 11:19
 */

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    
    
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin").password("123456").roles("ADMIN");
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()                    //  定义当需要用户登录时候，转到的登录页面。
                .loginPage("/login.html")           // 设置登录页面
                .loginProcessingUrl("/user/login")  // 自定义的登录接口
                .and()
                .authorizeRequests()        // 定义哪些URL需要被保护、哪些不需要被保护
                .antMatchers("/index.html").permitAll()     // 设置所有人都可以访问登录页面
                .anyRequest()               // 任何请求,登录后可以访问
                .authenticated()
                .and()
                .csrf().disable();          // 关闭csrf防护
        
        /*http.authorizeRequests()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/welcome")
                .permitAll()
                .and()
                .logout()
                .permitAll();*/
    }
    
    @Override
    public void configure(WebSecurity auth) throws Exception {
        //解决静态资源被拦截问题
        auth.ignoring().antMatchers("/css/**");
        super.configure(auth);
    }
}
