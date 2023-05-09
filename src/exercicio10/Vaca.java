package exercicio10;

public class Vaca extends Mamifero{

	public Vaca() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void comer() {
		System.out.println("Vaca comendo");
	}

	@Override
	public void dormir() {
		System.out.println("Vaca dormindo");
	}
	
	public void amamentar() {
		System.out.println("Vaca amamentando");
	}
}
