package exercicio04;

public class Diretor extends Funcionario{

	public Diretor() {
		// TODO Auto-generated constructor stub
	}
	
	public void calcularSalario() {
		System.out.println("Salario do diretor é: R$ "+super.getSalario()*5);
	}

}
