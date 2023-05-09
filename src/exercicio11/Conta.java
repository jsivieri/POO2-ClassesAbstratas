package exercicio11;

public abstract class Conta {

		
	public Conta() {
		
	}

	private double saldo;
	
	
	
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public abstract double sacar(double saque);
	

}
