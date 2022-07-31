package com.qualco.nationassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class NationQualcoAssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(NationQualcoAssignmentApplication.class, args);
    }

}
