/**
 * 
 */
package br.com.caelum.argentum.modelo;

import java.util.Calendar;

/**
 * @author maiconfz
 *
 */
public final class Candlestick {
	private final double abertura;
	private final double fechamento;
	private final double minimo;
	private final double maximo;
	private final double volume;
	private final Calendar data;

	/**
	 * @param abertura
	 * @param fechamento
	 * @param minimo
	 * @param maximo
	 * @param volume
	 * @param data
	 */
	public Candlestick(double abertura, double fechamento, double minimo, double maximo, double volume, Calendar data) {
		if (minimo > maximo) {
			throw new IllegalArgumentException("Preço mínimo não pode ser maior que o preço máximo");
		}

		if (data == null) {
			throw new IllegalArgumentException("Data não pode ser nula");
		}
		
		if(abertura < 0 || fechamento < 0 || minimo < 0 || maximo < 0){
			throw new IllegalArgumentException("Abertura, fechameto, minimo e maximo não podem ter valores negativos");
		}

		this.abertura = abertura;
		this.fechamento = fechamento;
		this.minimo = minimo;
		this.maximo = maximo;
		this.volume = volume;
		this.data = data;
	}

	/**
	 * @return the abertura
	 */
	public double getAbertura() {
		return abertura;
	}

	/**
	 * @return the fechamento
	 */
	public double getFechamento() {
		return fechamento;
	}

	/**
	 * @return the minimo
	 */
	public double getMinimo() {
		return minimo;
	}

	/**
	 * @return the maximo
	 */
	public double getMaximo() {
		return maximo;
	}

	/**
	 * @return the volume
	 */
	public double getVolume() {
		return volume;
	}

	/**
	 * @return the data
	 */
	public Calendar getData() {
		return data;
	}

	public boolean isAlta() {
		return this.abertura <= this.fechamento;
	}

	public boolean isBaixa() {
		return this.fechamento > this.abertura;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Candlestick [abertura=" + abertura + ", fechamento=" + fechamento + ", minimo=" + minimo + ", maximo="
				+ maximo + ", volume=" + volume + ", data=" + data + "]";
	}
}
