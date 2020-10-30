package Comandos_basicos;

public class Caso11 {

	public static void main(String[] args) {
			
		int valor =25;
		int minimoValor = 10;
		
		while (valor>=minimoValor) {
			--valor;
			System.out.println("valor = " + valor + " minimoValor = " + minimoValor);
		}		
	}
}
