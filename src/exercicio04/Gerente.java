package exercicio04;

public class Gerente extends Funcionario{

	public Gerente() {
		// TODO Auto-generated constructor stub
	}

	public void calcularSalario() {
		System.out.println("Salario do gerente é: R$ "+super.getSalario()*3);
	}
}
