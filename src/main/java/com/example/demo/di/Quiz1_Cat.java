package com.example.demo.di;

import org.springframework.stereotype.Component;

@Component
public class Quiz1_Cat implements Quiz1_Animal {

	public void sound() {		
		System.out.println("야옹 짖는다");		
	}
}
