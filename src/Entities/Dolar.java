package Entities;

public class Dolar extends Moeda{

	

	public Dolar(double valor) {
		super(valor);
		
	}

	@Override
	public void info() {
		
		System.out.println("Dolar - " + getValor());
		
	}

	@Override
	public double converter() {
		return getValor()* 5.17;
		
		
	}

}
