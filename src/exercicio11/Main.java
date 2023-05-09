package exercicio11;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		ContaCorrente cc1 = new ContaCorrente(3550,10000);
		Conta conta1 = cc1;
		ContaCorrente cc2 = new ContaCorrente(30,8000);
		Conta conta2 = cc2;
		ContaPoupanca cp1 = new ContaPoupanca(35000);
		Conta poupanca1 = cp1;
		ContaPoupanca cp2 = new ContaPoupanca(80000);
		Conta poupanca2 = cp2;
		ContaPoupanca cp3 = new ContaPoupanca(35000);
		Conta poupanca3 = cp3;
		ContaPoupanca cp4 = new ContaPoupanca(1000);
		Conta poupanca4 = cp4;
		

		List<Conta> lista = new ArrayList<>();
		lista.add(conta1);
		lista.add(conta2);
		lista.add(poupanca1);
		lista.add(poupanca2);
		lista.add(poupanca3);
		lista.add(poupanca4);
		
		
		

	}

}
