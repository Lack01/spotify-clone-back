package com.codelack.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.codelack.springboot.app")
public class SpotifyCloneBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpotifyCloneBackApplication.class, args);
	}

}
