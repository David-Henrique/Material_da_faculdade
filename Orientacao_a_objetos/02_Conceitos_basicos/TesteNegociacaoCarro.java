package Conceitos_basicos;

public class TesteNegociacaoCarro {

	public static void main(String[] args) {
		
		Carro novoCarro = new Carro("VW","Fox", "Azul", 15560, 50, 12, 28500.0);
		Carro novoCarro2 = new Carro("Chrevrolet", "Onix", "Preto", 9350, 45, 10, 30000.0);
		Carro novoCarro3 = new Carro("Fiat", "Palio", "Prata", 0, 47, 14, 33650.0);		
		
		System.out.println("Marca: " + novoCarro.getMarca());
		System.out.println("Modelo: " + novoCarro.getmodelo());
		System.out.println("cor: " + novoCarro.getcor());
		System.out.println("Kilometragem: " + novoCarro.getkm());
		System.out.println("Capacidade do Tanque: " + novoCarro.getcapacidadeTanque());
		System.out.println("Kilometragem por Litro: " + novoCarro.getkmPorLitro());
		System.out.println("Rodagem do Veiculo: " + novoCarro.calcularkm());
		System.out.println("Preço: " + novoCarro.getpreco());
		System.out.println("Desconto: " + novoCarro.calcularDesconto(2.5,2));
		System.out.println("Valor do Carro: " + novoCarro.getvalorComDesconto());
		System.out.println();

		System.out.println("Marca: " + novoCarro2.getMarca());
		System.out.println("Modelo: " + novoCarro2.getmodelo());
		System.out.println("cor: " + novoCarro2.getcor());
		System.out.println("Kilometragem: " + novoCarro2.getkm());
		System.out.println("Capacidade do Tanque: " + novoCarro2.getcapacidadeTanque());
		System.out.println("Kilometragem por Litro: " + novoCarro2.getkmPorLitro());
		System.out.println("Rodagem do Veiculo: " + novoCarro2.calcularkm());
		System.out.println("Preço: " + novoCarro2.getpreco());
		System.out.println("Desconto: " + novoCarro2.calcularDesconto(2.5,2));
		System.out.println("Valor do Carro: " + novoCarro2.getvalorComDesconto());
		System.out.println();
		
		System.out.println("Marca: " + novoCarro3.getMarca());
		System.out.println("Modelo: " + novoCarro3.getmodelo());
		System.out.println("cor: " + novoCarro3.getcor());
		System.out.println("Kilometragem: " + novoCarro3.getkm());
		System.out.println("Capacidade do Tanque: " + novoCarro3.getcapacidadeTanque());
		System.out.println("Kilometragem por Litro: " + novoCarro3.getkmPorLitro());
		System.out.println("Rodagem do Veiculo: " + novoCarro3.calcularkm());
		System.out.println("Preço: " + novoCarro3.getpreco());
		System.out.println("Desconto: " + novoCarro3.calcularDesconto(2.5,2));
		System.out.println("Valor do Carro: " + novoCarro3.getvalorComDesconto());
		System.out.println();
		
		System.out.println("Quantidade de Carros: " + Carro.getTotalCarros());
		System.out.println("Preço Total (Valor Bruto): " + Carro.getPrecoTotal());
	}
}
