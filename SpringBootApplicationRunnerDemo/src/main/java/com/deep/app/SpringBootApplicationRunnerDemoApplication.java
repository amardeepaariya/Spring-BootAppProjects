package com.deep.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.deep.app.servre.MessageServiceProvider;

/**
 * @author Amardeep Kumar
 */

@SpringBootApplication
public class SpringBootApplicationRunnerDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootApplicationRunnerDemoApplication.class, args);
		MessageServiceProvider messageServiceProvider = ctx.getBean(MessageServiceProvider.class);
		
		String message = messageServiceProvider.message();
		System.out.println(message);
	}

}
