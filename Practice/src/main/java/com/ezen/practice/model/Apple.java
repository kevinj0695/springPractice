package com.ezen.practice.model;

import com.ezen.practice.model.Apple;

import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
@EqualsAndHashCode
public class Apple {
	
	@NonNull
	int size;
	@NonNull
	int price;
	private boolean red;
	private boolean fresh;
	
	public static void main(String[] args) {
		System.out.println(new Apple(15, 900));
	}
}
