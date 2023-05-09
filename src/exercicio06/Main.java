package exercicio06;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		ContaCorrente contaCorrente = new ContaCorrente();
		Conta cc = contaCorrente;
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		Conta cp = contaPoupanca;
		
		ContaCorrente contaCorrente2 = new ContaCorrente();
		Conta cc2 = contaCorrente2;
		
		cc.verificarConta();
		cp.verificarConta();
		cc2.verificarConta();
		
	}

}
