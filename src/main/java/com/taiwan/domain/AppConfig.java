package com.taiwan.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${custom.isMaster}")
    private boolean isMaster;

    public boolean isMaster() {
        return isMaster;
    }
}
