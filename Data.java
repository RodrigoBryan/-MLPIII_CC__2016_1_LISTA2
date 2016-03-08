package br.unipe.questao1;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	public Data() {
		this.mes=1;
		this.ano=4;
	}
	public Data(int dia, int mes, int ano) {
		this.dia= dia;
		this.mes= mes;
		this.ano= ano;
	}
	public Data(int dia, int mes) {this.dia= dia;
		this.mes= mes;
		this.ano= 2016;
	}
	public String toString() {
		return dia+ "/"+ mes+ "/"+ ano;
	}
	
	public void setDia(int dia){
		this.dia=dia;
		if(dia<1){
			this.dia = 1;
		}
		if(dia>28){
			if(this.mes==2){
				this.dia = 28;
				if(this.ano % 4 == 0){
					this.dia = 29;
				}
			}
			if(dia>=31){
				if(this.mes==1||this.mes==3||this.mes==5||this.mes==7||this.mes==8||this.mes==10||this.mes==12){
					this.dia=31;
				} else {
					if(this.mes!=2){
						this.dia=30;
					}
				}
			}
		}
	}
	
	public void setMes(int mes){
		this.mes = mes;
		if(mes<1){
			this.mes=1;
		}
		if(mes>12){
			this.mes=12;
		}
		setDia(this.dia);
	}
	
	public void setAno(int ano){
		this.ano = ano;
		if(ano < 0){
			this.ano=1;
		}
		setDia(this.dia);
	}
	
}
		







