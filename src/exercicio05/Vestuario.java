package exercicio05;

public class Vestuario extends Produto {

	public Vestuario() {
		// TODO Auto-generated constructor stub
	}
	
	private double desconto;

	public Vestuario(double desconto) {
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
		System.out.println("Vestuário tem um desconto de "+this.getDesconto()+" %");
	}

}
