package com.cloudy.day01;

/**
 * Created by Administrator on 2018/6/6.
 */
public class UserEntity {

    private String message = "Hi, Spring";

    public UserEntity() {
        System.out.println(">>>>>>> UserEntity 默认的构造函数执行了");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
