package br.com.belemburitiricardo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

public class ExceptionTest {
	
	/*
	 * @Test(expected = IndexOutOfBoundsException.class) public void empty() {
	 * List<String> lista = new ArrayList<String>(); lista.add("Rodrigo");
	 * 
	 * lista.get(0); }
	 */

	/*
	 * @Rule public ExpectedException thrown = ExpectedException.none();
	 * 
	 * 
	 * @Test public void shouldTestExceptionMessage() throws
	 * IndexOutOfBoundsException{ List<Object> list = new ArrayList<Object>();
	 * 
	 * thrown.expect(IndexOutOfBoundsException.class);
	 * thrown.expectMessage("Array vazio"); list.get(0); }
	 */
	
	@Test
	public void testExceptionMessage() {
		
		try {
			new ArrayList<Object>().get(0);
			fail("Esperado que IndexOutOfBoundsException seja lançada");
		}catch (IndexOutOfBoundsException e) {
			assertThat(e.getMessage(), is("Index: 0, Size: 0"));
		}
	}
}
