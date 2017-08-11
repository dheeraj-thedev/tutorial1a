package com.springtutorials.tutorial1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author amit@springtutorials.com
 *
 * Simplest way to initialize Spring in your application
 */
@Configuration
@ComponentScan(basePackages = {"com.springtutorials.tutorial1"})
public class Tutorial1Config {

    //nothing
}
