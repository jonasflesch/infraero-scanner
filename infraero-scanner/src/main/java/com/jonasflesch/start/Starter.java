package com.jonasflesch.start;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Import;

import com.jonasflesch.configuration.DefaultConfiguration;
import com.jonasflesch.configuration.PersistenceConfiguration;

@Import({ DefaultConfiguration.class, PersistenceConfiguration.class })
public class Starter implements CommandLineRunner {

	public static void main(String... args) {
		SpringApplication.run(Starter.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
