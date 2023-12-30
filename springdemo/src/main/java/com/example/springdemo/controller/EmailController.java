package com.example.springdemo.controller;

import com.example.springdemo.pojo.EmailProperties;
import com.example.springdemo.service.EmailService;
import com.example.springdemo.utils.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    //注入email配置信息实体类
    @Autowired
    private EmailService emailService;

    //测试方法
    @RequestMapping("/send")
    public Boolean send(){
        //收件人信箱
        String to = "1335590684@qq.com";
        //邮件标题
        String title = "来自宝贝老公";
        //邮件正文
        String content  = "爱你老婆（づ￣3￣）づ╭❤～，快快好起来！";
        //发送邮件
        return emailService.send(to,title,content);
    }

}
