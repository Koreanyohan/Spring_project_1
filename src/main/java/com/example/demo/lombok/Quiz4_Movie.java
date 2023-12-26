package com.example.demo.lombok;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*Quiz4.
 * 다음과 같이 영화(Movie) 클래스를 설계하세요
 * 속성 : 제목, 감독, 개봉일
 * 기능 : 동일 * 
 * */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Quiz4_Movie {
	String title ;
	String director;
	LocalDate date;
	//ㄴ 별도의 타임존 입력 안하면 내컴터에 타임존기준이됨.
}