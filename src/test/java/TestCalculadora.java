package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Calculadora;

public class TestCalculadora {

	@Test
	public void testSomar() {
		assertEquals(45, Calculadora.somar(39,  6));
		assertEquals(14, Calculadora.somar(1,  13));
	}

}
