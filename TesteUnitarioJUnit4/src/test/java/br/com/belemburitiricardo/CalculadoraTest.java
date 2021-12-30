package br.com.belemburitiricardo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		
		int soma = calc.somar("1+13");
		
		assertEquals(5, soma);
	}

}
