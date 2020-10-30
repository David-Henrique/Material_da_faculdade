package Comandos_basicos;

public class Caso02 {

	public static void main(String[] args) {
			
		int quantidadeAcertos = 3;
		double quantidadePontuacao = 2.5;
		double notaFinal = (double) quantidadeAcertos * quantidadePontuacao;
		
		System.out.println("Nota do Aluno: " + notaFinal);
	}
}
