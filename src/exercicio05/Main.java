package exercicio05;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		Eletronico eletronico = new Eletronico(5);
		Produto e1 = eletronico;
		
		Vestuario vestuario = new Vestuario(7);
		Produto v1 = vestuario;
		
		Alimento alimento = new Alimento(20);
		Produto a1 = alimento;
		
		e1.calcularDesconto();
		v1.calcularDesconto();
		a1.calcularDesconto();
		

	}

}
