package Application;

import java.util.ArrayList;
import java.util.List;

import Entities.Moeda;

public class Cofrinho {

	private List<Moeda> moedas = new ArrayList<>();
	// Lista para guardar os diferentes tipos de moedas - Polimorfismo.
	
	public Cofrinho() {
		
	}

	public List<Moeda> getMoedas() {
		return moedas;
	}

	public void adicionar(Moeda moeda) {
		moedas.add(moeda);
		// Metodo para adicionar moedas na lista.
	}
	
	public void remover(Moeda moeda) {
		moedas.remove(moeda);
		//Metodo pare remover moedas da lista.
	}
	
	public void listagemMoedas() {
		for(Moeda m : moedas) {
			m.info();
		}
		// Metodo para percorrer a lista e printar as moedas.
	}
	
	public double totalConvertido() {
		double soma = 0;
		for(Moeda m : moedas) {
			soma += m.converter();
		}
		return soma;
		// Metodo para conversao de todas as moedas para Real
	}
	
	
}
