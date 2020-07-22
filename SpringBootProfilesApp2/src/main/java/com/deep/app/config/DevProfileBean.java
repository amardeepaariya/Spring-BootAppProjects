package com.deep.app.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevProfileBean implements EnvBaseConfig {

	@Override
	public void setup() {
		System.out.println("Dev config is setup...");

	}

}
