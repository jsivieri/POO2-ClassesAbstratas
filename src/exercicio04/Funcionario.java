package exercicio04;

public abstract class Funcionario {

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	private double salario = 1302;
	
	
	
	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public abstract void calcularSalario();

}
