package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest 
// 이거 없애면 Spring container생성 안됨.
// ㄴ DI관련 아니면 이거 안 써도 밑에 @Test로 단위 테스트 가능.
public class Quiz3_Test {
	
	@Autowired
	Quiz3_Cafe cafe ;
	
	@Autowired
	Quiz3_Manager manager ; 
	
	
	@Test
	void test() {
		System.out.println(cafe.manager);
 		System.out.println("manager : " + manager);
 		//cafe.manager과 같은 주소값 공유. 즉, 같은 인스턴스 공유. 
				
		System.out.println("cafe : " + cafe);
		
	}
}
