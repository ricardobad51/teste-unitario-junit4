package br.com.belemburitiricardo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {
	
	/*
	 * @Test(expected = IndexOutOfBoundsException.class) public void empty() {
	 * List<String> lista = new ArrayList<String>(); lista.add("Rodrigo");
	 * 
	 * lista.get(0); }
	 */

	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	
	@Test
	public void shouldTestExceptionMessage() throws IndexOutOfBoundsException{
		List<Object> list = new ArrayList<Object>();
		
		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("Array vazio");
		list.get(0);
	}
}
