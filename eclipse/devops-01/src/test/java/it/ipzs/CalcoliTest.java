package it.ipzs;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcoliTest {

	@Test
	public void testSomma() {
		Calcoli c = new Calcoli();
		
		int a = 5;
		int b = 15;
		int expected = 20;
		
		var actual = c.somma(a, b);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testProdotto() {
		fail("da implementare!!!");
	}
	
	@Test
	public void testQuoziente() {
		fail("da implementare!!!");
	}

}
