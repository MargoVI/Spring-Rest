package ru.itmentor.spring.boot_security.demo.util;

public class UserNotEditException extends RuntimeException{
    public UserNotEditException(String msg1){
        super(msg1);
    }
}
