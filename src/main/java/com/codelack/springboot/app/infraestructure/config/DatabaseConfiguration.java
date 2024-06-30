package com.codelack.springboot.app.infraestructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories({"com.codelack.springboot.app.userContext.repository",
                        "com.codelack.springboot.app.catalogContext.repository"})

@EnableTransactionManagement
@EnableJpaAuditing
public class DatabaseConfiguration {
}
