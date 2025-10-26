package com.db.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

		BeanController beanController = ctx.getBean(BeanController.class);
		beanController.displayBean();

	}

	@Component
	class MyBean{
		public void display(){
			System.out.println("created a firts Bean");
		}
	}

	@Component
	class BeanController{
		private final MyBean myBean;

		 BeanController(MyBean myBean){
			this.myBean = myBean;
		}

		public void displayBean(){
			myBean.display();
		}
	}
}
