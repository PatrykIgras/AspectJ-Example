package com.example.aspectDemo;

import com.example.aspectDemo.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.time.LocalDate;

@SpringBootApplication
public class AspectDemoApplication implements CommandLineRunner{

	private UserService userService;

	public AspectDemoApplication(UserService userService) {
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(AspectDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userService.setUserName("Patryk");
		userService.getUserName();
		userService.helloUser();
		userService.setBirthDate(LocalDate.of(2020, 12, 13));
	}
}
