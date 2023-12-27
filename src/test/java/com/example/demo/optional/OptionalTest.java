package com.example.demo.optional;
// 2023.12.27 시작 
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OptionalTest {

		@Test
		void Optional사용하기 () {
			// optional은 객체를 감싸는 wrapper 클래스이다. 제네릭타입. (저장할 자료형<~>)
			// 객체에 값이 있는지 없는지를 확인하기 위한 용도이다.   of(~)라는 static메서드에 담고 싶은 값 적기 -> 객체생성
			Optional<String> opt = Optional.of("apple");
			
			System.out.println(opt.get()); // 값 꺼내기
			System.out.println(opt.isEmpty()); // 값이 없는지 확인 boolean (있으면 true, 없으면 false)
			System.out.println(opt.isPresent()); // 값이 있는지 확인 boolean (있으면 false, 없으면 true)
			System.out.println(opt.orElse("banana")); // 값 없으면 banana로 대체
		}
	
		@Test
		void of와_ofNullable의_차이 () {
			String str = null;
			
//			Optional<String> opt1 = Optional.of(str);  // null 못받음 -> NullPointerException
			Optional<String> opt2 = Optional.ofNullable(str); // null 받기 가능
	  //  = Optional<String> opt2 = Optional.ofNullable(null);
		}
				
		@Test
		void 빈_객체를_사용하는경우 () {
		Optional<String> opt = Optional.ofNullable(null);
//		System.out.println(opt.get()); // 에러남
		}
		
		
	// Optional클래스의 ifPresent 메서드
		@Test
		void optional을_사용하여_null값체크하기() {
			String str = "banana";
			Optional<String> opt = Optional.ofNullable(str);
			opt.ifPresent(name -> System.out.println(name +"값이 존재합니다")); // 값이 있는 경우에만 동작.
			
			Optional<String> opt9 = Optional.ofNullable(null);
			opt9.ifPresent(name -> System.out.println(name +"값이 존재합니다")); // 값이 없어서 동작안함.
		}		
//	ㄴ 위와 같음
		@Test
		void if를_사용하여_null_값_체크하기 () {
			
			String str = "banana";
			
			if(str !=null) {
				System.out.println("값이 존재합니다.");
			}
		}
}		



















