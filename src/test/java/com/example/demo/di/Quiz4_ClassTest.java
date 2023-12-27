package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz4_ClassTest {

	@Autowired
	Quiz4_Class class_ ;
	@Autowired
	Quiz4_Teacher teacher;
	
	@Test
	void test () {
		System.out.println("반 주소 : " + class_);
		
		System.out.println("담임선생 주소 : " + class_.classTeacher);
		System.out.println("선생 주소 : " + teacher);
	}
	
}
