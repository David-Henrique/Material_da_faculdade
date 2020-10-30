package Conceitos_basicos;

public class Array {

	public static void main(String[] args) {
		
		Carro carros[] = new Carro[4];
		carros[0] = new Carro("VW", "Fox", "Azul", 15560, 50, 12, 28500.0);
		carros[1] = new Carro("Chrevrolet", "Onix", "Preto", 9350, 45, 10, 30000.0);
		carros[2] = new Carro("Fiat", "Palio", "Prata", 0, 47, 14, 33650.0);		
		carros[3] = new Carro("Ford", "Fiesta", "Verde", 7500, 40, 15, 23380.0);
		
		for(int i=0;i<carros.length;i++) {
		System.out.println("Marca: " + carros[i].getMarca());
		System.out.println("Modelo: " + carros[i].getmodelo());
		System.out.println("cor: " + carros[i].getcor());
		System.out.println("Kilometragem: " + carros[i].getkm());
		System.out.println("Capacidade do Tanque: " + carros[i].getcapacidadeTanque());
		System.out.println("Kilometragem por Litro: " + carros[i].getkmPorLitro());
		System.out.println("Rodagem do Veiculo: " + carros[i].calcularkm());
		System.out.println("Pre�o: " + carros[i].getpreco());
		System.out.println("Desconto: " + carros[i].calcularDesconto(2.5,2));
		System.out.println("Valor do Carro: " + carros[i].getvalorComDesconto());
		System.out.println();		
		}
		
		System.out.println("Quantidade de Carros: " + Carro.getTotalCarros());
		System.out.println("Pre�o Total (Valor Bruto): " + Carro.getPrecoTotal());
	}		
}
