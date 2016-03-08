package br.unipe.questao3;

public class Veiculo {
	private String placa, marca, modelo, chassi;
	private int ano, kmInicial, kmFinal;
	private double valorKm;
	private Pessoa proprietario;
	public Veiculo(ParametrosVeiculo parametros){
		this.placa = parametros.getPlaca();
		this.marca = parametros.getMarca();
		this.modelo = parametros.getModelo();
		this.chassi = parametros.getChassi();
		this.ano = parametros.getAno();
		this.kmInicial = parametros.getKmInicial();
		this.kmFinal = parametros.getKmfinal();
		this.valorKm = parametros.getValorKm();
		this.proprietario = parametros.getProprietario();
	}
	
	public double ValorLocacao(){
		return (this.kmFinal-this.kmInicial)*this.valorKm;
	}
	
	public String getPlaca(){
		return this.placa;
	}
	public String getMarca(){
		return this.marca;
	}
	public String getModelo(){
		return this.modelo;
	}
	public String getChassi(){
		return this.chassi;
	}
	
	public int getAno(){
		return this.ano;
	}
	public int getKmInicial(){
		return this.kmInicial;
	}
	public int getKmfinal(){
		return this.kmFinal;
	}
	
	public Double getValorKm(){
		return this.valorKm;
	}
	
	public Pessoa getProprietario(){
		return this.proprietario;
	}
	
}




