package com.example.demo.lombok;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz4_MovieTest {

	@Test
	void test() {
		Quiz4_Movie movie1 = Quiz4_Movie.builder()
				.title("살인의 추억").director("봉준호").date(LocalDate.of(2023, 11, 22))
				.build();	// new String("살인의 추억") 오토박싱		// LocalDate.of -> LocalDate인스턴스 반환
		Quiz4_Movie movie2 = Quiz4_Movie.builder()
				.title("설국열차").director("봉준호").date(LocalDate.of(2022, 10, 17))
				.build();
		
		Quiz4_Movie movie3 = new Quiz4_Movie();
		movie3.setTitle("노량");
		movie3.setDirector("홍길동");
		movie3.setDate(null);
//		// 위의 것과 같다. 
//		Quiz4_Movie movie3 = Quiz4_Movie.builder()
//				.title("노량").director("홍길동")
//				.build();
				
		Quiz4_Movie movie4 = new Quiz4_Movie("야인시대", "몰라", null);
		
		System.out.println(movie1);
		System.out.println(movie2);		
		System.out.println(movie3);
		System.out.println(movie4);
		
		movie3.setDirector("아무개");
		movie3.setDate(LocalDate.of(1999, 9, 11));
		System.out.println("3번 영화의 감독 이름은 : " + movie3.getDirector());
	}
	
}
