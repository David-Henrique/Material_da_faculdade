package Conceitos_adicionais;

import java.util.ArrayList;

public class AnalisandoArrayList {

	public static void main(String[] args) {
		
		//ArrayList
		
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Maria");
		nomes.add("Joao");
		nomes.add("Francisca");
		
		for(int i = 0; i < nomes.size(); i++) {
		
			System.out.println("Nomes; " + nomes.get(i));
		}
		
		System.out.println();
		
		// Adicionando novas posicoes na lista
		
		nomes.add("Katia");
		nomes.add("Lauro");
		
		for( int i = 0; i < nomes.size(); i++) {
			System.out.println("Nomes: " + nomes.get(i));
		}
		
		System.out.println();
		
		// Removendo posicoes na lista
		
		nomes.remove(1);
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println("Nomes: " + nomes.get(i));
		}
		
	}

}
