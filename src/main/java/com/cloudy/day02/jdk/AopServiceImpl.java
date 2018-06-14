package com.cloudy.day02.jdk;

/**
 * Created by Administrator on 2018/6/11.
 */
public class AopServiceImpl implements AopService {

    private String singal;

    public String getSingal() {
        return singal;
    }

    public void setSingal(String singal) {
        this.singal = singal;
    }

    public void doService() {
        System.out.println("do service method is being invoked now!!!");
    }
}
