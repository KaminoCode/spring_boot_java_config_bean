package com.kaminocode.springcoredemo.config;

import com.kaminocode.springcoredemo.common.Coach;
import com.kaminocode.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
