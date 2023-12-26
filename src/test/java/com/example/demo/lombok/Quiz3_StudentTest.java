package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz3_StudentTest {

	@Test
	void test () {
		Quiz3_Student st1 = Quiz3_Student.builder()
				.id(20141100).name("주요한").age(32).build();	
		Quiz3_Student st2 = Quiz3_Student.builder()
				.id(20141101).name("임한경").age(30).build();	
		Quiz3_Student st3 = Quiz3_Student.builder()
				.id(20141102).name("이찬우").age(29).build();
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		
		st2.setName("싱하형");
		System.out.println("st2의 이름은 : " + st2.getName());
	}
	
	
}
