/**
 * 
 */
package br.com.caelum.argentum.modelo;

import org.junit.Test;

/**
 * @author Maicon Fonseca Zanco
 *
 */
public class CandleBuilderTest {

	@Test(expected=IllegalStateException.class)
	public void geracaoDoCandleDeveTerTodosOsDadosNecessarios() {
		new CandleBuilder().geraCandle();
	}

}
