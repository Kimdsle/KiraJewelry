package com.jewelry.KiraJewelry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class EnvironmentCheck {
    private static final Logger logger = LoggerFactory.getLogger(EnvironmentCheck.class);

    @PostConstruct
    public void init() {
        String credentialsPath = System.getenv("GOOGLE_APPLICATION_CREDENTIALS");
        logger.info("GOOGLE_APPLICATION_CREDENTIALS: " + credentialsPath);
    }
}
