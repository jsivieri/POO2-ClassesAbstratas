package exercicio09;

public class Quadrado extends Forma{

	
	public Quadrado(double l) {
		super();
		this.l = l;
		
	}

	private double l;
	
	public double calcularArea() {
		return Math.pow(l, l);
	}

}