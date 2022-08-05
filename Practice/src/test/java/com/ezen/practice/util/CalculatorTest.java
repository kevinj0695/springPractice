package com.ezen.practice.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator calc = new Calculator();
	
	int a = 10, b = 20;
	
	@Test
	public void addTest() {
		int result = calc.add(a, b);
		
		// assertEquals(기대값, 실제값)
		assertEquals(30, result);
	}
	
	@Test
	public void randomTest1() {
		for (int i = 10; i < 15; ++i) {
			assertTrue(calc.randomInt(i) < i - 1);
		}
	}
	
	@Test
	public void randomTest2() {
		for (int i = 10; i < a; ++i) {
			assertTrue(calc.randomInt(i) < i - 1);
		}
	}
	
	@Test
	public void randomTest3() {
		for (int i = 10; i < b; ++i) {
			assertTrue(calc.randomInt(i) < i - 1);
		}
	}
	
}
