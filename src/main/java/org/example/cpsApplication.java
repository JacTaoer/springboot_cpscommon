package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableAsync
public class cpsApplication
{
    public static  void main(String[] args) {
        SpringApplication.run(cpsApplication.class,args);
    }
}
