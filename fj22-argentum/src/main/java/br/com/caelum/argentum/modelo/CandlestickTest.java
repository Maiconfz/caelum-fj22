/**
 * 
 */
package br.com.caelum.argentum.modelo;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.Test;

/**
 * @author Maicon Fonseca Zanco
 *
 */
public class CandlestickTest {

	@Test(expected = IllegalArgumentException.class)
	public void precoMaximoNaoPodeSerMenorQueMinimo() {
		new Candlestick(10, 20, 20, 10, 10000, Calendar.getInstance());
	}

	@Test(expected = IllegalArgumentException.class)
	public void precoDeAberturaNaoPodeSerNegativo() {
		new Candlestick(-10, 20, 20, 30, 10000, Calendar.getInstance());
	}

	@Test(expected = IllegalArgumentException.class)
	public void precoDeFechamentoNaoPodeSerNegativo() {
		new Candlestick(10, -20, 20, 30, 10000, Calendar.getInstance());
	}

	@Test(expected = IllegalArgumentException.class)
	public void precoMinimoNaoPodeSerNegativo() {
		new Candlestick(10, 20, -20, 30, 10000, Calendar.getInstance());
	}

	@Test(expected = IllegalArgumentException.class)
	public void precoMaximoNaoPodeSerNegativo() {
		new Candlestick(10, 20, 20, -30, 10000, Calendar.getInstance());
	}

	@Test(expected = IllegalArgumentException.class)
	public void dataNaoPodeSerNula() {
		new Candlestick(10, 20, 20, 30, 10000, null);
	}

	@Test
	public void quandoAberturaIgualFechamentoEhAlta() {
		Candlestick candle = new Candlestick(10, 10, 10, 20, 10000, Calendar.getInstance());

		assertTrue(candle.isAlta());
	}

}
