package Comandos_basicos;

public class Caso07 {

	public static void main(String[] args) {
	
		int x = 70;
		char estado;
		
		if ((x >= 60) && (x <= 80)) {
			estado = 's';
		}
		
		else {
			estado = 'n';
		}
		
		System.out.println("O valor esta entre 60 e 80? " + estado);
		
	}
}
