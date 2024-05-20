package com.emailSender.Email.Sender.Project;

import com.emailSender.Email.Sender.Project.controller.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailSenderProjectApplication {

	@Autowired
	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(EmailSenderProjectApplication.class, args);
	}


	@EventListener(ApplicationReadyEvent.class)
	public void sendEmail(){
		emailSenderService.sendEmail("email@gmail.com",
				"Mail sent",
				"Hi Yash, this email sent by project");
	}

}
