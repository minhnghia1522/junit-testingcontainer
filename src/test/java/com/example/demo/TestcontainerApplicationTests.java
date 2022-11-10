package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
class TestcontainerApplicationTests {
	
	@Test
	void contextLoads() {
		System.out.println("Context loads!");
	}

}
