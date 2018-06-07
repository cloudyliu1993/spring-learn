package com.cloudy.day01;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Administrator on 2018/6/7.
 */
public class MyInterceptor {

    public void doAccessCheck() {
        System.out.println("前置通知-->>" + this.getClass().getSimpleName());
    }

    public void doAfterReturning() {
        System.out.println("后置通知-->>" + this.getClass().getSimpleName());
    }

    public void doAfter() {
        System.out.println("最终通知" + this.getClass().getSimpleName());
    }

    public void doAfterThrowing() {
        System.out.println("异常通知-->" + this.getClass().getSimpleName());
    }

    public Object doAround(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕通知" + this.getClass().getSimpleName());
        // 这里如果pJoinPoint.proceed()不执行，后面拦截到的方法都不会执行，非常适用于权限管理
        Object result = point.proceed();
        System.out.println("退出" + this.getClass().getSimpleName());
        return result;
    }

}
