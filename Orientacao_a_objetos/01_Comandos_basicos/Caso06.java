package Comandos_basicos;

public class Caso06 {

	public static void main(String[] args) {
		
		int x = 70;
		
		if (x== 15) {
			x = x + 10;
		}
		
		else if (x==60) {
			x = x + 20;
		}
		
		else {
			x = x * 2;
		}
		
		System.out.println("Valor Atual de x: " + x);
		
	}
}
