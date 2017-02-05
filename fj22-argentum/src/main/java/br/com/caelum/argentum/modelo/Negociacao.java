/**
 * 
 */
package br.com.caelum.argentum.modelo;

import java.util.Calendar;

/**
 * @author maiconfz
 *
 */
public final class Negociacao {
	private final double preco;
	private final int quantidade;
	private final Calendar data;

	/**
	 * @param preco
	 * @param quantidade
	 * @param data
	 */
	public Negociacao(double preco, int quantidade, Calendar data) {
		
		if(data == null) {
			throw new IllegalArgumentException("Data não pode ser nula");
		}
		
		this.preco = preco;
		this.quantidade = quantidade;
		this.data = data;
	}

	/**
	 * @return the preco
	 */
	public double getPreco() {
		return preco;
	}

	/**
	 * @return the quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * @return the data
	 */
	public Calendar getData() {
		return (Calendar) data.clone();
	}

	/**
	 * @return volume da negociacao
	 */
	public double getVolume() {
		return preco * quantidade;
	}
	
}
