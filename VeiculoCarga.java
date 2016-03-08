package br.unipe.questao3;

public class VeiculoCarga extends Veiculo{
	private int capacidadeCarga;
	public VeiculoCarga(ParametrosVeiculo parametros, int capacidadeCarga){
		super(parametros);
		this.capacidadeCarga = capacidadeCarga;
	}
	
	public int getCapacidadeCarga(){
		return this.capacidadeCarga;
	}
}
