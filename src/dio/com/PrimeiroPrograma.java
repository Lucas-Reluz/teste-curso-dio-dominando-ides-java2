package dio.com;

import dio.com.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gato gato = new Gato();
		Livros livros = new Livros();
	
	System.out.println(gato);
	System.out.println(livros);
	}

}

class Livros {
	private String nome;
	private String npag;
}