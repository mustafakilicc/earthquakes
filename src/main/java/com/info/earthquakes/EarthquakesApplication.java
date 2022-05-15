package com.info.earthquakes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EarthquakesApplication {

	public static void main(String[] args)  {
		SpringApplication.run(EarthquakesApplication.class, args);
		System.out.println("\033[1;32m" + "Run Successful");
	}

}
