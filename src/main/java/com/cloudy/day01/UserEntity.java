package com.cloudy.day01;

/**
 * Created by Administrator on 2018/6/6.
 */
public class UserEntity {

    private String message = "Hi, Spring";

    private StudentEntity studentEntity;

    public UserEntity() {
        System.out.println(">>>>>3333>> UserEntity 默认的构造函数执行了");
    }

    public UserEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }
}
