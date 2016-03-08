package br.unipe.questao2;


public abstract class Fita {
	public enum Genero{
		Terror, Comedia, Romance, Aventura, Fantasia, Acao;
	}
	private double preco;
	private String titulo;
	private Genero genero;
	private Autor autor;
	
	public Fita(double preco, String titulo, Genero genero, Autor autor){
		this.preco = preco;
		this.titulo = titulo;
		this.genero = genero;
		this.autor = autor;
	}
	
	public double getPreco(){
		return this.preco;
	}
	public String getTitulo(){
		return this.titulo;
	}
	public Genero getGenero(){
		return this.genero;
	}
	public Autor getAutor(){
		return this.autor;
	}
}
