package com.deep.app.generate.password;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Amardeep Kumar
 */

public class BCryptPasswordEncoderTest {

	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		System.out.println(bCryptPasswordEncoder.encode("ak@123"));
		System.out.println(bCryptPasswordEncoder.encode("rk@123"));
	}
}
