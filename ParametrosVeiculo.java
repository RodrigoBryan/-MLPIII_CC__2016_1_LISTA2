package br.unipe.questao3;

public class ParametrosVeiculo {
	private String placa, marca, modelo, chassi;
	private int ano, kmInicial, kmFinal;
	private double valorKm;
	private Pessoa proprietario;
	public ParametrosVeiculo(String placa, String marca, String modelo, String chassi, int ano, int kmInicial, int kmFinal, double valorKm, Pessoa proprietario){
		this.placa=placa;
		this.marca=marca;
		this.modelo=modelo;
		this.chassi=chassi;
		this.ano=ano;
		this.kmInicial=kmInicial;
		this.kmFinal=kmFinal;
		this.valorKm=valorKm;
		this.proprietario = proprietario;
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
