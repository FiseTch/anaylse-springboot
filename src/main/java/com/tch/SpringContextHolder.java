package com.tch;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/9/6 14:30
 */

@Component
public class SpringContextHolder implements ApplicationContextAware {
    
    private static ApplicationContext applicationContext;
    
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
    
    public static Object getBean(String beanName) {
        return applicationContext.getBean(beanName);
    }
    
    public static <T> T getBean(Class<T> T) {
        return applicationContext.getBean(T);
    }
    
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    
    
}
