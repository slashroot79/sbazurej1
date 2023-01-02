package com.ragukar.cenlinsbj1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.ragukar.*,outpkg")
public class Cenlinsbj1Application {

	public static void main(String[] args) {
		SpringApplication.run(Cenlinsbj1Application.class, args);
	}

}
