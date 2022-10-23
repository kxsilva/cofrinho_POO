package Entities;

public class Real extends Moeda{


	public Real(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Real - " + getValor());

	}

	@Override
	public double converter() {
		return getValor();
	}

}
