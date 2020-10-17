package com.example.test;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration.
 */
@Configuration
@EnableConfigurationProperties({MyParameters.class, MyParameters.InnerParameters.class})
public class MyConfiguration {


}
