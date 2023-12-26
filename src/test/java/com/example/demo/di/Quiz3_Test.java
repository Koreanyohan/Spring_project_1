package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz3_Test {
	@Autowired
	Quiz3_Cafe cafe ;
	
	@Autowired
	Quiz3_Manager manager ; 
	
	
	@Test
	void test() {
		System.out.println(cafe.manager); 
		// @Component으로 작성된클래스라서 Autowired로만 받을 수 있는 건가? null 나오네.
		
		System.out.println(manager);
	}
}
