package exercicio10;

public class Mamifero extends Animal{

	public Mamifero() {
		
	}
	
	@Override
	public void comer() {
		System.out.println("Animal comendo");
		
	}

	@Override
	public void dormir() {
		System.out.println("Animal dormindo");
	}
	
	public void amamentar() {
		System.out.println("Animal amamentando");
		
	}
}
