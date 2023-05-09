package exercicio07;

public class Retangulo extends Figura{
	
	public Retangulo(double b, double h) {
		super();
		this.b = b;
		this.h = h;
	}



	private double b,h;




	public double calcularArea() {
		return b*h;
	}

}
