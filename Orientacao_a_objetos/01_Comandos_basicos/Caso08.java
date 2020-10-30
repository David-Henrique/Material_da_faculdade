package Comandos_basicos;

public class Caso08 {

	public static void main(String[] args) {
		
		int x = 70;
		char estado;
		
		if ((x == 60) || (x == 80)) {
			estado = 's';
		}
		
		else {
			estado = 'n';
		}
		
		System.out.println("O valor é 60 e 80? " + estado);
		
	}
}
