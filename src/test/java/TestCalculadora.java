package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Calculadora;

public class TestCalculadora {

	@Test
	public void testSomar() {
		assertEquals(45, Calculadora.somar(39,  6));
		assertEquals(14, Calculadora.somar(1,  13));
		assertEquals(28, Calculadora.somar(20,  8));
	}

	@Test
	public void testSubtrair() {
		assertEquals(0, Calculadora.subtrair(8,  8));
		assertEquals(33, Calculadora.subtrair(39,  6));
		
	}
}
