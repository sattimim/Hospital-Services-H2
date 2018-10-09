package com.sms.springboot.hospitalservicesh2;

import org.springframework.boot.SpringApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2
public class HospitalServicesH2Application {
    public static void main(String[] args) {
		SpringApplication.run(HospitalServicesH2Application.class, args);
	}
}
