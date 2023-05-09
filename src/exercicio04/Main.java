package exercicio04;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Assistente assistente = new Assistente();
		Funcionario a1 = assistente;
		
		Gerente gerente = new Gerente();
		Funcionario g1 = gerente;
		
		Diretor diretor = new Diretor();
		Funcionario d1 = diretor;
		
		
		a1.calcularSalario();
		g1.calcularSalario();
		d1.calcularSalario();
		

	}

}
