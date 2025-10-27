package com.db.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

//		BeanController1 beanController1 = new BeanController1()
		BeanController1 beanController1 = ctx.getBean(BeanController1.class);

		beanController1.display();

	}
}
