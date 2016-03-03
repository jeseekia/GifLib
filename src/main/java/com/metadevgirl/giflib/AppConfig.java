package com.metadevgirl.giflib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Jeseekia on 3/2/16.
 */

@EnableAutoConfiguration
@ComponentScan
public class AppConfig {

    public static void main (String[] args) {
        SpringApplication.run(AppConfig.class,args);
    }
}
