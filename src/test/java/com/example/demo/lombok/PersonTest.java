package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// 스프링 환경 만들기
@SpringBootTest
public class PersonTest {// 안에 @Test애너테이션 있는 경우, 외부 클래스의 이름 Test로 하면 안된다.
	
	@Test // 단위테스트
	void test() {
		
		Person person1 = new Person(); // 디폴트 생성자  - 기능 패키지에서 Person클래스의 객체생성
		
		person1.setName("둘리"); 	// setter
		person1.setAge(12);		// setter
		
		System.out.println(person1.getName()); // getter
		System.out.println(person1.getAge());  // getter
		
		Person person2 = new Person("또치", 15); 
		System.out.println(person2.toString());
	}
	
}
// Person.java 클래스에서 에너테이션 하나씩 지우고 저장하면서 컴파일 에러 확인해봐!



