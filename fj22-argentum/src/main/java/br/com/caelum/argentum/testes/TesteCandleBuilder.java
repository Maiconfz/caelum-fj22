/**
 * 
 */
package br.com.caelum.argentum.testes;

import java.util.GregorianCalendar;

import br.com.caelum.argentum.modelo.CandleBuilder;
import br.com.caelum.argentum.modelo.Candlestick;

/**
 * @author maiconfz
 *
 */
public class TesteCandleBuilder {

	public static void main(String[] args) {
		Candlestick candle = new CandleBuilder().comAbertura(40.5).comFechamento(45.0).comMinimo(39.8).comMaximo(45.0)
				.comVolume(145234.20).comData(new GregorianCalendar(2008, 8, 12, 0, 0, 0)).geraCandle();

		System.out.println(candle);
	}

}
