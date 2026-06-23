package com.itb.inf2gm.tcc.farmais;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FarmaisApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmaisApplication.class, args);
		System.out.println("Api start port 8080");
	}

}
