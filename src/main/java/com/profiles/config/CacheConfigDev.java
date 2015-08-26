package com.profiles.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class CacheConfigDev {

	private static final Logger log = LoggerFactory.getLogger(CacheConfigDev.class);
	
    @Bean
    //@Primary
    public String aBean() {
        return "dev";
    }

}