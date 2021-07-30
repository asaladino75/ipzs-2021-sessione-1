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

		int actual = c.somma(a, b);

		assertEquals(expected, actual);
	}

	@Test
	public void testProdotto() {
		Calcoli c = new Calcoli();

		int a = 5;
		int b = 15;
		int expected = 75;

		int actual = c.prodotto(a, b);

		assertEquals(expected, actual);
	}

	@Test
	public void testQuoziente() {
		Calcoli c = new Calcoli();

		int a = 15;
		int b = 6;
		int expected = 2;

		int actual = c.quoziente(a, b);

		assertEquals(expected, actual);
	}

}
