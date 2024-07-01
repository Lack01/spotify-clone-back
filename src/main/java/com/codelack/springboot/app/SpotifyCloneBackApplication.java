package com.codelack.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication(scanBasePackages = "com.codelack.springboot.app.usercontext")
public class SpotifyCloneBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpotifyCloneBackApplication.class, args);
	}

}
