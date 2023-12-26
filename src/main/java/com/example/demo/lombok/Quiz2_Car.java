package com.example.demo.lombok;
/* Quiz2
 * 1. 다음과 같이 자동차(Car) 클래스를 설계하세요
 * 속성 : 모델명, 제조사, 색
 * 기능 : 모든멤버변수의 getter/setter, 디폴트 생성자
 * 		모든 멤버변수를 초기화하는 생성자, 도서정보를 반환하는기능
 * 2. 자동차의 인스턴스를 3개 생성하세요
 * 3. 자동차의 모든 정보를 출력하세요.
 * */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor // cf) 클래스에 참-변 없으면 에러남
@AllArgsConstructor// cf) 클래스에 참-변 없으면 에러남
@ToString
@Builder
public class Quiz2_Car {
	String modelName ;
	String maker ;
	String color;

}
