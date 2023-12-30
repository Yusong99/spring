package com.example.springdemo.service.impl;

import com.example.springdemo.pojo.EmailProperties;
import com.example.springdemo.service.EmailService;
import com.example.springdemo.utils.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl  implements EmailService {
    //注入email配置信息实体类
    @Autowired
    private EmailProperties emailProperties;

    /**
     * @param to 收件人邮箱
     * @param title 邮件标题
     * @param content 邮件正文
     * @return
     */
    @Override
    public boolean send(String to, String title, String content) {
        //打印email配置信息
        System.out.println(emailProperties);
        //发送邮件
        return MailUtil.sendMail(emailProperties,to, title, content);
    }
}
