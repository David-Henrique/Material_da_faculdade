package Conceitos_adicionais;

public class AnalisandoMetodoMain {

	// Testando argumentos do run configuration (botao verde na seta)
	public static void main(String[] args) {
		
		for(int i=0; i<args.length;i++) {
			System.out.println("Nome: " + args[i]);
		}
	}

}
