package com.sprinboot_crud.sprinboot_crud;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SprinBootCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprinBootCrudApplication.class, args);
    }

    @Bean
    public ModelMapper ModelMapper() {
        return new ModelMapper();
    }
}
