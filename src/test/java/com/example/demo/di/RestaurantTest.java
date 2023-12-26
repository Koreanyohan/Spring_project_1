package com.example.demo.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RestaurantTest {
	
	@Autowired
	Restaurant restaurant ;
	
	@Autowired //@Component인 Chef클래스의 클래스 인스턴스 저장
	Chef chef; 
	
	@Test
	void test () {		
		
		//레스토랑 인스턴스의 주소
		System.out.println("restaurant : " + restaurant);
		  // restaurant 참-변은 Restaurant클래스에서 @Component에 의해 스프링컨테이너에 저장된 인스턴스 꺼냄
		
		//쉐프 인스턴스의 주소
		System.out.println("chef : " + chef);
			// chef참-변은 Chef클래스에서 @Component에 의해 스프링컨테이너에 저장된 인스턴스 꺼냄  
		
		System.out.println("레스토랑의 쉐프" + restaurant.chef2);
		// chef객체는 Chef클래스에서 @Component에 의해 스프링컨테이너에 저장된 인스턴스 꺼냄
		// => chef참-변 restaurant.chef2는 주소값 공유함. 같은걸 꺼내므로		
		
	}
}