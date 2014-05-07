package com.jonasflesch.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan(basePackages = "com.jonasflesch")
@EnableScheduling
public class DefaultConfiguration {

}
