package com.example.demo.di;
/*
 * 1. 다음과 같이 강아지(Dog) 클래스를 만드세요
 * -sound 메서드 : "왕왕 짖는다" 라는 메세지 출력
 * 2. 스프링컨테이너에 강아지 객체를 저장하세요
 * 3. 단위테스트 클래스를 만드세요
 * 4. Dog타입의 변수를 선언하고 컨테이너에서 객체를 주입받으세요.
 * 5. 변수를 사용하여 sound()함수를 호출하세요.
 *  * 
 * */

import org.springframework.stereotype.Component;

@Component
public class Quiz1_Dog implements Quiz1_Animal{
	public void sound() {
		System.out.println("왕왕 짖는다");
	}
	
}
