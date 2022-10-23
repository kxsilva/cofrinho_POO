package Entities;

import java.util.Objects;

abstract public class Moeda {
//Classe mãe para as moedas do cofrinho.
	
	private double valor;
	
	public Moeda() {
		// Construtor vazio da classe.
	}

	public Moeda(double valor) {
		this.valor = valor;
		//Construtor com argumentos
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	abstract public void info(); //Classe de informação da instancia
	
	abstract public double converter(); // Classe de converter para Real

}
