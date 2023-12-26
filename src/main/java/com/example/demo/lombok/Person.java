package com.example.demo.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter // 우클릭 source - generate getter and setter 기능
@ToString // 우클릭  source - generate toString 기능
@NoArgsConstructor // 기본(디폴트) 생성자 Person (){}; 생성
@AllArgsConstructor 
// 클래스의 모든 멤버변수 초기화 시키는 생성자 Person (String name, int age) { this.name = name; this.age = age;} 같은거
@Builder //메서드 체인을 이용해서 객체를 생성
public class Person {
	
	String name;
	
	int age;
	
}


