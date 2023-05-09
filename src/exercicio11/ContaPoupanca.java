package exercicio11;

public class ContaPoupanca extends Conta{


	
	public ContaPoupanca(double saldo) {
		
	}

	@Override
	public double sacar(double saque) {
		if (saque < getSaldo()){
			setSaldo(getSaldo()-saque);
			return getSaldo(); 
		} else {
			System.out.println("Saldo insuficiente");
			return getSaldo();
		}
		
	}

}
