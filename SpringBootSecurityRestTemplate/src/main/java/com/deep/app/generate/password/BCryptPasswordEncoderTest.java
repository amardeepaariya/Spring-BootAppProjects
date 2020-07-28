package com.deep.app.generate.password;
/**
 * @author Amardeep Kumar
 */
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderTest {

	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		System.out.println(bCryptPasswordEncoder.encode("ak@123"));
		System.out.println(bCryptPasswordEncoder.encode("rk@123"));
	}
}
