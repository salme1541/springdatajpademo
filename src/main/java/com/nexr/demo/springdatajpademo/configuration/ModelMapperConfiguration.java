package com.nexr.demo.springdatajpademo.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ModelMapperConfiguration {

    @Bean
    public ModelMapper ModelMapperConfiguration() {
        return new ModelMapper();
    }
}
