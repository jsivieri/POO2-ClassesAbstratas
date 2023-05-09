package exercicio02;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Animal c1 = cachorro;
		
		Gato gato = new Gato();
		Animal g1 = gato;
	
		Vaca vaca = new Vaca();
		Animal v1 = vaca;
		
		
		c1.emitirSom();
		g1.emitirSom();
		v1.emitirSom();

	}

}
