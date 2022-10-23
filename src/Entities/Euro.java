package Entities;

public class Euro extends Moeda{

	
	
	public Euro(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Euro - " + getValor());

	}

	@Override
	public double converter() {
		return getValor()*5.08;
	}

	
	
}
