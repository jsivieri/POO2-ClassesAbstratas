package exercicio09;

public class Circulo extends Forma{

		
	public Circulo(double r) {
		super();
		this.r = r;
	}

	private double r;

	
	public double calcularArea() {
		return Math.PI*r*r;
	}

}


