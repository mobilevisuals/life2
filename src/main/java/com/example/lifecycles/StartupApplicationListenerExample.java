package com.example.lifecycles;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class StartupApplicationListenerExample implements
        ApplicationListener<ContextRefreshedEvent> {

    static final Logger log2= LoggerFactory.getLogger(StartupApplicationListenerExample.class);

    @Override public void onApplicationEvent(ContextRefreshedEvent event) {
        log2.info("on ContextRefreshedEvent");
    }

  
}
