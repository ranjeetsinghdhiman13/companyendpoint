package com.ranjeet.company.companyendpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.ranjeet.company.companyendpoint.*"})
@EntityScan("com.ranjeet.company.companyendpoint.model")
@EnableJpaRepositories(basePackages = {"com.ranjeet.company.companyendpoint.repository"})
public class CompanyendpointApplication {

  public static void main(String[] args) {
    SpringApplication.run(CompanyendpointApplication.class, args);
  }
}
