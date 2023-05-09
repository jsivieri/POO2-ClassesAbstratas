package exercicio07;

public class Triangulo extends Figura{
	
	public Triangulo(double b, double h) {
		super();
		this.b = b;
		this.h = h;
	}

	private double b,h;
	

	public double calcularArea() {
		return (b*h)/2;
	}
}
