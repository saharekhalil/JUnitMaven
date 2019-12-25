package com.example.demo.testService;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.demo.CalculatriceService;

public class CalculServiceTest {

	@Test
	public void additionTest() {

		CalculatriceService calcService = new CalculatriceService();
		int a = 5;
		int b = 6;
		int result = calcService.addition(a, b);
		assertEquals( 11, result);
	}

}
