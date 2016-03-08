package br.unipe.questao2;


public class FitaLancamento extends Fita{
	public FitaLancamento(double preco, String titulo, Genero genero, Autor autor){
		super(preco*1.2, titulo, genero, autor);
	}
}
