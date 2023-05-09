package exercicio11;

import java.util.ArrayList;
import java.util.List;

public class Banco extends Conta{



	public Banco() {
		
	}

	List<Conta> lista = new ArrayList<>();
	
	public void pagarJuros(double valor) {
	for(Conta c : lista){
         if(c instanceof ContaPoupanca){
             this.setSaldo(getSaldo()*((valor/100)+1));
             System.out.println("Saldo: "+this.getSaldo());
         } else {
        	 System.out.println("Esta conta não é poupança");
              
         }
     }

	}
	
	@Override
	public double sacar(double saque) {
		if (saque < (getSaldo())) {
			setSaldo(getSaldo()-saque);
			return getSaldo(); 
		} else {
			System.out.println("Saldo insuficiente");
			return getSaldo();
		}
		
	}
}
