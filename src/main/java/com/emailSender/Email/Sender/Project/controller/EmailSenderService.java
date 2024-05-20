package com.emailSender.Email.Sender.Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("spring.mail.username")
    String fromEmail;


    public void sendEmail(String toEmail, String subject, String body){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        System.out.println("From email is " + fromEmail);
        simpleMailMessage.setFrom(fromEmail);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setTo(toEmail);
        simpleMailMessage.setText(body);


        javaMailSender.send(simpleMailMessage);
        System.out.println("The email is sent");
    }

}
