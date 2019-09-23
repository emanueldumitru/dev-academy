package com.orange.devacademy.moviesservice.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ApiProperties.class)
public class ApiConfiguration {
}
