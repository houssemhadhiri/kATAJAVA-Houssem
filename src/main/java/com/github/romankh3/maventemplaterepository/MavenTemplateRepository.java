package com.github.romankh3.maventemplaterepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class for Java Repository Template.
 */
@SpringBootApplication
public class MavenTemplateRepository {

    public static final String JAVA_REPOSITORY_TEMPLATE = "maven-template-repository";

    public static void main(String[] args) {
        SpringApplication.run(MavenTemplateRepository.class, args);
    }
}