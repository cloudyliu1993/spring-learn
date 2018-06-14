package com.cloudy.day02.jdk;

import org.springframework.util.StringUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2018/6/11.
 */
public class ProxyFactory implements InvocationHandler {

    private Object target;

    public Object createTargetObject(Object targetObject) {
        this.target = targetObject;

        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        AopServiceImpl aopService = (AopServiceImpl) this.target;
        System.out.println("invoke xxxxxx");
        Object result = null;
        if (!StringUtils.isEmpty(aopService.getSingal())) {
            result = method.invoke(target, args);
        }
        System.out.println("invoke yyyyyy");
        return result;
    }
}
