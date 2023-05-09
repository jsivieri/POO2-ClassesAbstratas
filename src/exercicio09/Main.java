package exercicio09;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		
		Circulo c = new Circulo(14);
		Forma circulo = c;
		
		Quadrado q = new Quadrado(10);
		Forma quadrado = q;
		
		Triangulo t = new Triangulo(13,4);
		Forma triangulo = t;
		
		List<Forma> formas = new ArrayList<Forma>();
		formas.add(circulo);
		formas.add(quadrado);
		formas.add(triangulo);
		
			
		CalculadoraDeAreas calc = new CalculadoraDeAreas();
		System.out.println(calc.somarAreas(formas));

	}

}
