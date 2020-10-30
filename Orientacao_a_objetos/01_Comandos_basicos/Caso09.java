package Comandos_basicos;

public class Caso09 {

	public static void main(String[] args) {
		
		char estadocivil = 's';
		
		switch (estadocivil) {
		case 'c':
			System.out.println("Estado civil: Casado");
			break;
		case 'd':
			System.out.println("Estado civil: Divorciado");
			break;
		case 's':
			System.out.println("Estado civil: Solteiro");
			break;
		case 'v':
			System.out.println("Estado civil: Viuvo");
			break;
		}
	}
}
