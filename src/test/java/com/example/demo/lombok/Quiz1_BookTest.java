package com.example.demo.lombok;
// Quiz 01. 이어받음
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz1_BookTest {
	
	@Test
	void test() { // Book 클래스의 생성자 생성
		// 방법 1. AllargsConstructor 애너테이션 이용
		Quiz1_Book book1 = new Quiz1_Book("나루토", 39800, "챔프", 130);
		Quiz1_Book book2 = new Quiz1_Book("원피스", 35800, "챔프", 120);
		Quiz1_Book book3 = new Quiz1_Book("블리치", 30800, "챔프", 110);
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);			
		
		// 방법 2. Builder 애너테이션 이용
		Quiz1_Book bookA = Quiz1_Book.builder()
				.title("나루토").price(39800).publisher("챔프").pageNum(100)
				.build();
		Quiz1_Book bookB = Quiz1_Book.builder()
				.title("원피스").price(35800).publisher("챔프").pageNum(120)
				.build();
		Quiz1_Book bookC = Quiz1_Book.builder()
				.title("블리치").price(30800).publisher("챔프").pageNum(130)
				.build();
		
		System.out.println(bookA);
		System.out.println(bookB);
		System.out.println(bookC);
		
		bookA.setTitle("진격의 거인");
		bookA.setPublisher("나도 몰라");
		bookA.setPrice(9999999);
		bookA.setPageNum(1);
		System.out.println(bookA.getTitle());
		System.out.println("bookA 인스턴스 수정 후 : " + bookA);		
	}
}


