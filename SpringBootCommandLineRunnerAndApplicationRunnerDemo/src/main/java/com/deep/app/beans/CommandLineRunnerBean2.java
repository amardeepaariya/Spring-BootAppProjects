package com.deep.app.beans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Amardeep Kumar
 */

@Component
@Order(4)
public class CommandLineRunnerBean2 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommandLineRunnerBean2...");

	}

}
