package com.example.springdemo.service;

public interface EmailService {

    boolean send(String to,String title,String content);

}
