package com.cloudy.day01;

/**
 * Created by Administrator on 2018/6/11.
 */
public class StudentEntity {

    private String message;

    private UserEntity userEntity;

    public StudentEntity() {
    }

    public StudentEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
}
