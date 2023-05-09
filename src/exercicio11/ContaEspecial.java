package exercicio11;

public class ContaEspecial extends Conta{

	private double limite;
		
	public ContaEspecial(double saldo, double limite) {
		this.setSaldo(saldo);
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}



	public void setLimite(double limite) {
		this.limite = limite;
	}



	@Override
	public double sacar(double saque) {
		if (saque < (this.getSaldo()+limite)) {
			this.setSaldo(this.getSaldo()-saque);
			return this.getSaldo(); 
		} else {
			System.out.println("Saldo insuficiente");
			return this.getSaldo();
		}
		
	}
}
