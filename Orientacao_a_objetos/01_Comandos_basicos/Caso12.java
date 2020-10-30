package Comandos_basicos;

public class Caso12 {

	public static void main(String[] args) {
			
		int valor = 25;
		int minimoValor = 10;
		
		do {
			valor--;
			System.out.println("valor = " + valor + " minimoValor = " + minimoValor);
		}while (valor >=minimoValor);

	}
}