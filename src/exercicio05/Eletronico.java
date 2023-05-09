package exercicio05;

public class Eletronico extends Produto {

	public Eletronico() {
		// TODO Auto-generated constructor stub
	}
	
	private double desconto;
	
	
	
	public Eletronico(double desconto) {
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
		System.out.println("Eletrônicos têm um desconto de "+this.getDesconto()+" %");
	}

}
