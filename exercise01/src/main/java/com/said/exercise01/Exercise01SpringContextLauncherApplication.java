package com.said.exercise01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Exercise01SpringContextLauncherApplication {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(Exercise01SpringContextLauncherApplication.class);

		System.out.println(context.getBean(BusinessCalculationService.class).findMax());
	}
}


