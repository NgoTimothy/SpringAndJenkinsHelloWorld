package com.example.accessingdatamysql.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.accessingdatamysql.repository")
public class UserDatabaseConfig {
}
