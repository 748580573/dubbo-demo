package com.heng.consumer.test;

import com.heng.api.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ConsumerTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"dubbo-demo-consumer.xml"});
        context.start();
        DemoService service = (DemoService) context.getBean("demoService");
        System.out.println(service.sayHello("hello"));
    }
}
