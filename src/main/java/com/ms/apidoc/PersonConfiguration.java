package com.ms.apidoc;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EntityScan
@Configuration
public class PersonConfiguration {
}