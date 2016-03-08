package br.unipe.questao3;

public class VeiculoPasseio extends Veiculo{
	private int qtdPortas;
	private boolean arCondicionado;
	public VeiculoPasseio(ParametrosVeiculo parametros, int qtdPortas, boolean arCondicionado){
		super(parametros);
		this.qtdPortas = qtdPortas;
		this.arCondicionado = arCondicionado;
	}
	
	public int getQtdPortas(){
		return this.qtdPortas;
	}
	
	public boolean getArCondicionado(){
		return this.arCondicionado;
	}
}
