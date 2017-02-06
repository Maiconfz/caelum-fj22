/**
 * 
 */
package br.com.caelum.argentum.modelo;

import java.util.Calendar;

/**
 * @author maiconfz
 *
 */
public class CandleBuilder {
	private double abertura;
	private double fechamento;
	private double minimo;
	private double maximo;
	private double volume;
	private Calendar data;

	private boolean aberturaSetada;
	private boolean fechamentoSetado;
	private boolean minimoSetado;
	private boolean maximoSetado;
	private boolean volumeSetado;
	private boolean dataSetada;

	public CandleBuilder comAbertura(double abertura) {
		this.abertura = abertura;
		this.aberturaSetada = true;
		return this;
	}

	public CandleBuilder comFechamento(double fechamento) {
		this.fechamento = fechamento;
		this.fechamentoSetado = true;
		return this;
	}

	public CandleBuilder comMinimo(double minimo) {
		this.minimo = minimo;
		this.minimoSetado = true;
		return this;
	}

	public CandleBuilder comMaximo(double maximo) {
		this.maximo = maximo;
		this.maximoSetado = true;
		return this;
	}

	public CandleBuilder comVolume(double volume) {
		this.volume = volume;
		this.volumeSetado = true;
		return this;
	}

	public CandleBuilder comData(Calendar data) {
		this.data = data;
		this.dataSetada = true;
		return this;
	}

	public Candlestick geraCandle() {
		if (aberturaSetada && fechamentoSetado && minimoSetado && maximoSetado && volumeSetado && dataSetada) {
			return new Candlestick(this.abertura, this.fechamento, this.minimo, this.maximo, this.volume, this.data);
		} else {
			throw new IllegalStateException("Todos os valores dever ser setados para a construção do candle");
		}
	}
}
