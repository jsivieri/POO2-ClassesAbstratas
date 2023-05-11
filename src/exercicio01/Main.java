package exercicio01;


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Pessoa p1 = aluno;
	
		
		Professor professor = new Professor();
		Pessoa p2 = professor;
		
		Funcionario funcionario = new Funcionario();
		Pessoa p3 = funcionario;
		
		p1.apresentar();
		p2.apresentar();
		p3.apresentar();


		
		

	}

}
