package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz1_DogTest {
	
	// 인-페 Animal 자손 테스트
	
		@Autowired
		Quiz1_Animal animal ;
		
		@Test
		void 동물의기능테스트() {
			animal.sound();
		}
	
//	
//	@Autowired
//	Quiz1_Dog dog;
//	
//	
//	@Test
//	void 강아지객체가만들어졌는지test () {
//		System.out.println(dog);
//	}
//	
//	@Test
//	void 강아지의기능test() {		
//		
//		dog.sound();
//		
//	}

	
	
	
}
