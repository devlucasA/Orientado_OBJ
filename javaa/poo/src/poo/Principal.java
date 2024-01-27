package poo;

public class Principal {

	public static void main(String[] args) {

		
	     Triangulo meuTriangulo = new Triangulo(3, 3, 3);

	        if (meuTriangulo.verificaTriangulo()) {
	            System.out.println("É possível construir um triângulo com esses lados.");
	        } else {
	            System.out.println("Não é possível construir um triângulo com esses lados.");
	        }

	        meuTriangulo.exibirInformacoes();

	}

}
