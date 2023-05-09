package exercicio03;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		Veiculo c1 = carro;
		
		Moto moto = new Moto();
		Veiculo m1 = moto;
		
		Caminhao caminhao = new Caminhao();
		Veiculo cm1 = caminhao;
		
		c1.acelerar();
		m1.acelerar();
		cm1.acelerar();
		

	}

}
