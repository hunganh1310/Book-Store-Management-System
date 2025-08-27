package com.topcit.aims.aims;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class AimsApplicationTests {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		String rawPassword = "mypassword123";
		String encodedPassword = encoder.encode(rawPassword);
		System.out.println("Raw password: " + rawPassword);
		System.out.println("Encoded password: " + encodedPassword);
	}

}
