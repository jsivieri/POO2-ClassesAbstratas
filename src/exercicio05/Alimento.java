package exercicio05;

public class Alimento extends Produto {

	public Alimento() {
		// TODO Auto-generated constructor stub
	}
	
	private double desconto;

	public Alimento(double desconto) {
		super();
		this.desconto = desconto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public void calcularDesconto() {
		System.out.println("Alimentos têm um desconto de "+this.getDesconto()+" %");
	}

}
