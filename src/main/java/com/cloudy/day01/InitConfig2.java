package com.cloudy.day01;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by Administrator on 2018/6/7.
 */
public class InitConfig2 implements InitializingBean, ApplicationContextAware {


    public void afterPropertiesSet() throws Exception {
        System.out.println("Init:" + this.getClass().getSimpleName());
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext.toString());
    }

}
