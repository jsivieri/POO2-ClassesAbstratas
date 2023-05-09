package exercicio09;

public class Triangulo extends Forma {

	
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
