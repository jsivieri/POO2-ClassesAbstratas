package exercicio07;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		
		Circulo c = new Circulo(10);
		Figura circulo = c;
		
		Retangulo r = new Retangulo(20,10);
		Figura retangulo = r;
		
		Triangulo t = new Triangulo(20,15);
		Figura triangulo = t;
		
		
		System.out.println("Area circulo: "+circulo.calcularArea());
		System.out.println("Area retangulo: "+retangulo.calcularArea());
		System.out.println("Area triangulo: "+triangulo.calcularArea());
			
		
		

	}

}
