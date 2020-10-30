package Conceitos_adicionais;

public class TratamentoDeExcecoes {

	//Exemplo de erro 1
	/*String[] nomes = new String[3];
	nomes[1] = "Maria";
	nomes[2] = "João";
	nomes[3] = "Francisco";
	
	for(int i = 0; i <= nomes.length; i++) {
		System.out.println("Nome: " + nomes[i]);
	}*/

	//Exemplo de erro 2
	public static void main(String[] args) {

		try {
			int valor1 = 10;
			int valor2 = 0;
			int resultado = valor1/valor2;
		
			System.out.println("Resultado: " + resultado);
		
		// Se quiser ignorar qualquer tipo de exceção digite apenas Exception
		}catch(ArithmeticException e) {
			System.err.println("Erro ao dividir por 0");
		}
	}
}
