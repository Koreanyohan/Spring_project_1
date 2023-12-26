package com.example.demo.di;
/* Quiz2.
 * 1. 다음과 같이 고양이(Cat2) 클래스를 만드세요.
 * - eat 메서드 : " 쥐를 먹는다 " 라는 메시지 출력
 * 
 * 2. 스프링컨테이너에 고양이 객체를 저장하세요
 * 
 * 3. 단위테스트 클래스를 만드세요
 * 
 * 4. Cat타입의 변수를 선언하고 컨테이너에서 객체를 주입받으세요.
 * 
 * 5. 변수를 사용하여 eat()함수를 호출하세요
 * */

import org.springframework.stereotype.Component;

@Component
public class Quiz2_Cat {
	public void eat () {
		System.out.println("쥐를 먹는다.");
	}
}
