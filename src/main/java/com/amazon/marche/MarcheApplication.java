package com.amazon.marche;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.amazon.marche.repository")
public class MarcheApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarcheApplication.class, args);
    }

}
