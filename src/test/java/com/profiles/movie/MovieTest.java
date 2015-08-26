package com.profiles.movie;

import com.profiles.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DelegatingSmartContextLoader;

/**
 * Created by agijare on 8/25/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader=DelegatingSmartContextLoader.class, classes = { AppConfig.class, MovieTest.MyConfig.class })
@ActiveProfiles({"abhi", "dev", "live"})
public class MovieTest {

    @Configuration
    static class MyConfig {

        @Bean
        //@Primary
        public String cBean() {
            return "abhi";
        }
    }

    @Autowired
    private MovieDao movieDao;

    @Test
    public void testValue() {
        System.out.println(movieDao.getValue());
    }
}
