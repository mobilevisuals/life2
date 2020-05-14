package com.example.lifecycles;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import static com.example.lifecycles.StartupApplicationListenerExample.log2;

@Component
public class InitializingBeanExampleBean implements InitializingBean,DisposableBean{


    @Override
    public void afterPropertiesSet() throws Exception {
        log2.info("afterPropertiesSet");

    }

    @Override
    public void destroy() throws Exception {
        log2.info("destroy");
    }
    @PostConstruct
    private void test1()
    {
        log2.info("PostConstruct");
    }

    @PreDestroy
    private void test2()
    {
        log2.info("PreDestroy");
    }



}
