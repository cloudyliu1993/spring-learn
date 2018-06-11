package com.cloudy.day01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Administrator on 2018/6/6.
 */
public class Main {

    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("/day01/spring-beans.xml"));
        UserEntity userEntity = (UserEntity) beanFactory.getBean("userEntity");
        System.out.println(userEntity.getMessage());

        ApplicationContext beanFactory1 = new ClassPathXmlApplicationContext("/day01/spring-beans.xml");
        UserEntity userEntity1 = (UserEntity) beanFactory1.getBean("userEntity");

        System.out.println("contains user bean: " + beanFactory1.containsBean("userEntity"));
        System.out.println(userEntity1.getMessage());
        System.out.println("*******************************************************************");

        StudentEntity studentEntity = (StudentEntity) beanFactory1.getBean("studentEntity");
        System.out.println(studentEntity.getMessage());




    }

}
