package com.edu.lighthouse;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class LighthouseManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LighthouseManagerApplication.class, args);
    }

}
