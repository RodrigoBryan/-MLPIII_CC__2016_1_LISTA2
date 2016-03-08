package br.unipe.questao2;


public class FitaInfantil extends Fita{
	public FitaInfantil(double preco, String titulo, Genero genero, Autor autor){
		super(preco*0.6, titulo, genero, autor);
	}
}
