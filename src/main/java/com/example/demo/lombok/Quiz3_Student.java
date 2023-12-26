package com.example.demo.lombok;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*Quiz3
 * 1) 다음과 같이 학생(Student) 클래스를 설계하세요
 * 속성 : 학번, 이름, 나이
 * 기능 : 모든멤버변수의 getter/setter,
 * 디폴트생성자, 모든 멤버변수를 초기화하는 생성자, 학생 정보를 반환하는 기능
 * 
 * 2) 학생의 인스턴스를 3개 생성하세요
 * 3) 학생의 모든 정보를 출력하세요. * 
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Quiz3_Student {
	int id ;
	String name;
	int age;
}
