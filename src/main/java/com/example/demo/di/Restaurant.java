package com.example.demo.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
// Chef 인스턴스 생성
	// 1. 직접 선언 & 생성 
	Chef chef1 = new Chef();
	
	// 2. 의존성 주입 - 선언부만 입력, 저장될 인스턴스는 불러옴  - MVC개념에 이용 
	@Autowired  // @Component인 Chef클래스의 클래스 인스턴스 저장
	Chef chef2;
	
}
