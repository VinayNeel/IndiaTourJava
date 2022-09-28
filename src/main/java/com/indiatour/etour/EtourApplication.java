package com.indiatour.etour;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.indiatour.etour.services.Emailservice;

@SpringBootApplication
public class EtourApplication {

//	@Autowired
//	Emailservice senderservice;
	
	public static void main(String[] args) {
		SpringApplication.run(EtourApplication.class, args);
	}
	
//	@EventListener(ApplicationReadyEvent.class)
//	public void triggerMail() throws MessagingException {
//
//	senderservice.sendSimpleEmail("raviwankhade786@gmail.com",
//			"This is email body",
//			"This is email subject");
//	senderservice.sendEmailWithAttachment("raviwankhade786@gmail.com",
//		"This is Arjun Codes",
//		"Resume",
//		"C:\\CDAC vita\\all.pdf");
//	}
	
}

