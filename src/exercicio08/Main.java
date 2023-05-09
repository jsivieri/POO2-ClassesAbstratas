package exercicio08;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {


		Notebook n = new Notebook();
		Computador notebook = n;
		
		Desktop d = new Desktop();
		Computador desktop = d;
		
		Servidor s = new Servidor();
		Computador servidor = s;
		
		
		notebook.iniciar();
		desktop.iniciar();
		servidor.iniciar();

	}

}
