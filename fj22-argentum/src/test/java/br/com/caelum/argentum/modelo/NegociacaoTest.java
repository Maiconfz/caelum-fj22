/**
 * 
 */
package br.com.caelum.argentum.modelo;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

/**
 * @author Maicon Fonseca Zanco
 *
 */
public class NegociacaoTest {

	@Test
	public void dataNegociacaoEhImutavel() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 15);
		
		Negociacao n = new Negociacao(10, 5, c);
		
		n.getData().set(Calendar.DAY_OF_MONTH, 20);
		
		assertEquals(15, n.getData().get(Calendar.DAY_OF_MONTH));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void naoCriaNegociacaoComDataNula(){
		new Negociacao(10, 5, null);
	}

}
