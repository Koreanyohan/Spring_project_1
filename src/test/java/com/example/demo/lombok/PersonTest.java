package com.example.demo.lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// 스프링 환경 만들기
@SpringBootTest
public class PersonTest {// 안에 @Test애너테이션 있는 경우, 외부 클래스의 이름 Test로 하면 안된다.
	
	@Test // 단위테스트 - 이거 있어야 이 함수만 독립적으로 실행 가능(run - Junit)
	void test() {
		
		Person person1 = new Person(); // 디폴트 생성자  - 기능 패키지에서 Person클래스의 객체생성
		// ㄴ @NoArgsConstructor
		
		person1.setName("둘리"); 	// setter  @Setter
		person1.setAge(12);		// setter  @Setter
		
		System.out.println(person1.getName()); // getter  @Setter
		System.out.println(person1.getAge());  // getter  @Setter
		
		Person person2 = new Person("또치", 15); //  @AllArgsConstructor
//		System.out.println(person2.toString()); 대신 밑에꺼 가능. toString애너테이션 덕분
		System.out.println(person2); // @ToString
		
		Person person3 = Person.builder().name("도우너").build();
		System.out.println(person3);
	}
	
}
// Person.java 클래스에서 에너테이션 하나씩 지우고 저장하면서 컴파일 에러 확인해봐!



