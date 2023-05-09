package exercicio07;

public class Circulo extends Figura{
	
	public Circulo(double r) {
		super();
		this.r = r;
	}



	private double r;
	
	public double calcularArea() {
		return Math.PI*r*r;
	}

}
