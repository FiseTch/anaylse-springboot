package com.tch;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 设置默认的 webMvc 跳转页面
 *
 * @author Tongch
 * @version 1.0
 * @time 2018/9/7 14:28
 */

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    
    /**
     * 首页页面自动跳转转发
     *
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/")//浏览器访问路径
                .setViewName("forward:/index");//映射的后端资源路径
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }
    
    /**
     * 对跳转路径的配置，静态资源获取
     *
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")//浏览器前端访问路径
                .addResourceLocations("classpath://META-INF/resources/");//对应的后端访问资源
        super.addResourceHandlers(registry);
    }
    
    /**
     * 对访问url的后缀路径进行配置
     *
     * @param configurer
     */
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        super.configurePathMatch(configurer);
        
        // 匹配结尾 / :会识别 url 的最后一个字符是否为 /
        //eg： localhost:8080/test 与 localhost:8080/test/ 等价
        configurer.setUseTrailingSlashMatch(true);
        // 匹配后缀名：会识别 xx.* 后缀的内容
        //eg： localhost:8080/test 与 localhost:8080/test.jsp 等价
        configurer.setUseSuffixPatternMatch(true);
        
    }
}
