package br.com.belemburitiricardo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		
		int soma = calc.somar("1+1+3");
		
		assertEquals(5, soma);
	}
	
	@Test
	public void testeSomarComMock() {
		Calculadora calculadora = mock(Calculadora.class);
		
		when(calculadora.somar("1+2+2")).thenReturn(5);
		
		int resultado = calculadora.somar("1+2+2");
		
		assertEquals(5, resultado);
	}

}
