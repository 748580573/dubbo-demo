package com.heng.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider {
    private static Logger logger = LoggerFactory.getLogger(Provider.class);

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-provider.xml"});
        logger.info("*********provider start{}*********", 11);
        System.in.read();
    }
}
