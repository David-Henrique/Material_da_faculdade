package Conceitos_basicos;

public class Carro {
	
	//Construtor
	public Carro(int km) {
		
		Carro.totalCarros ++;
		Carro.precoTotal = Carro.precoTotal + preco;
		if(km>=0 && km<=20000) {
			this.km = km;
		}else {
			System.exit(0); //Finaliza o Sistema
		}
		
	}
	
	public Carro() {
		Carro.totalCarros ++ ;
		Carro.precoTotal = Carro.precoTotal + preco;
	}
	
	public Carro(String marca, String modelo, String cor, int km, int capacidadeTanque, int kmPorLitro, double preco) {
		
		Carro.totalCarros ++;
		Carro.precoTotal = Carro.precoTotal + preco;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		
		if(km >=0 && km <= 20000) {
			this.km = km;
		}else {
			System.exit(0);
		}
		
		this.capacidadeTanque = capacidadeTanque;
		this.kmPorLitro = kmPorLitro;
		this.preco = preco;
		
	}
	
	// Propriedades e atributos
	private static int totalCarros;
	private static double precoTotal;
	private String marca;
	private String modelo;
	private String cor;
	private int km;
	private int capacidadeTanque;
	private int kmPorLitro;
	private double preco;
	private double valorComDesconto;

	// Métodos
	public static int getTotalCarros() {
		return Carro.totalCarros;
	}
	
	public static double getPrecoTotal() {
		return Carro.precoTotal;
	}
	
	public int calcularkm() {

		return this.capacidadeTanque* this.kmPorLitro;	
	}
	
	public double calcularDesconto(double percentualDescontoVendedor) {

		if(percentualDescontoVendedor>=0 && percentualDescontoVendedor<=4) {
			return this.preco * (percentualDescontoVendedor/100);
		}else if (percentualDescontoVendedor<0) {
			return 0.0;
		}else {
			return this.preco * 0.04;
		}
	}

	public double calcularDesconto (double percentualDescontoVendedor, double percentualDescontoGerente) {
		
		if(percentualDescontoVendedor < 0 ) {
			percentualDescontoVendedor= 0 ;
		}else if (percentualDescontoVendedor > 4) {
			percentualDescontoVendedor = 4;
		}
		
		if (percentualDescontoGerente < 0) {
			percentualDescontoGerente = 0;
		}else if (percentualDescontoGerente > 2) {
			percentualDescontoGerente = 2;
		}
		
		double desconto = this.preco * ((percentualDescontoVendedor/100) + (percentualDescontoGerente/100));
		this.valorComDesconto = this.preco - desconto;

		return desconto;
	}

	public void setMarca (String marcaQueDesejaInserir) {
		this.marca = marcaQueDesejaInserir;
	}	
	public String getMarca() {
		return this.marca;
	}
	
	public void setmodelo (String modeloQueDesejaInserir) {
		this.modelo = modeloQueDesejaInserir;
	}
	public String getmodelo() {
		return this.modelo;
	}
	
	public void setcor (String corQueDesejaInserir) {
		this.cor = corQueDesejaInserir;
	}	
	public String getcor() {
		return this.cor;
	}
	
	public void setkm (int kmQueDesejaInserir) {
		this.km = kmQueDesejaInserir;
	}
	public int getkm() {
		return this.km;
	}
	
	public void setcapacidadeTanque (int capacidadeTanqueQueDesejaInserir) {
		this.capacidadeTanque = capacidadeTanqueQueDesejaInserir;
	}
	public int getcapacidadeTanque() {
		return this.capacidadeTanque;
	}
	
	public void setkmPorLitro (int kmPorLitroQueDesejaInserir) {
		this.kmPorLitro = kmPorLitroQueDesejaInserir;
	}	
	public int getkmPorLitro() {
		return this.kmPorLitro;
	}
	
	public void setpreco (double precoQueDesejaInserir) {
		this.preco = precoQueDesejaInserir;
	}	
	public double getpreco() {
		return this.preco;
	}
	
	public void setvalorComDesconto (double valorComDescontoQueDesejaInserir) {
		this.valorComDesconto = valorComDescontoQueDesejaInserir;
	}	
	public double getvalorComDesconto() {
		return this.valorComDesconto;
	}
		
}