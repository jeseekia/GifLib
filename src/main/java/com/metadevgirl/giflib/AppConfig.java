package com.metadevgirl.giflib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Created by Jeseekia on 3/2/16.
 */

@EnableAutoConfiguration
public class AppConfig {

    public static void main (String[] args) {
        SpringApplication.run(AppConfig.class,args);
    }
}
