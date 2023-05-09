package exercicio11;

public class ContaCorrente extends ContaEspecial{

	
	
	public ContaCorrente(double saldo, double limite) {
		super(saldo, limite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double sacar(double saque) {
		if (saque < (getSaldo()+getLimite())) {
			setSaldo(getSaldo()-saque);
			return getSaldo(); 
		} else {
			System.out.println("Saldo insuficiente");
			return getSaldo();
		}
		
	}

}
