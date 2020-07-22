package com.deep.app.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Prod")
public class ProdProfileBean implements EnvBaseConfig {

	@Override
	public void setup() {
		System.out.println("Prod config is setup...");

	}

}
