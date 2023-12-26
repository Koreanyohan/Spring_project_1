package com.example.demo.lombok;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Quiz2_CarTest {

	@Test
	void Test () {
		
		Quiz2_Car carA = new Quiz2_Car ();
		carA.setModelName("제네시스");
		carA.setMaker("현대");		
		carA.setColor("red");
		System.out.println("차 A의 색 : " + carA.getColor());
		System.out.println(carA); 
		
		Quiz2_Car carB = Quiz2_Car.builder()
					.modelName("봉고").maker("쌍용").color("black")
					.build();
		System.out.println(carB);
		Quiz2_Car carC = Quiz2_Car.builder()
					.modelName("몰라").maker("테슬라").color("white")
					.build();
		System.out.println(carC);
	}
	
}
