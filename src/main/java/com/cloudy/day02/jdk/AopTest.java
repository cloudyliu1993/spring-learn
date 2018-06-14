package com.cloudy.day02.jdk;

/**
 * Created by Administrator on 2018/6/11.
 */
public class AopTest {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        AopService aopService = (AopService)proxyFactory.createTargetObject(new AopServiceImpl());
        //AopService aopService1 = (AopService)proxyFactory.createTargetObject(new AopServiceImpl());

        aopService.doService();
    }

}
