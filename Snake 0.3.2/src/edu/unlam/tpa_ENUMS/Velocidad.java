package edu.unlam.tpa_ENUMS;

public enum Velocidad {
	MUY_LENTO(3), LENTO(5), NORMAL(10), RAPIDO(20);
	
	private int valor;
	
	Velocidad(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}
