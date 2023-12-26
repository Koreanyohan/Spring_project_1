package com.example.demo.lombok;
/* Quiz01.
 * 1) 다음과 같이 도서(Book)클래스를 만드세요
 * 
 * 속성 : 제목, 가격, 출판사, 페이지수
 * 기능 : 모든 멤버변수의 getter/setter, 디폴트 생성자, 
 * 		모든 멤버변수를 초기화하는 생성자, 도서정보를 반환하는 기능
 * 
 * 2)도서의 인스턴스를 3개 생성하세요
 * 3)도서의 모든 정보를 출력하세요
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Quiz1_Book {

	String title ;
	int price ;
	String publisher;
	int pageNum;
	public Quiz1_Book(String title) {
		this.title = title;
	}	
	
}
