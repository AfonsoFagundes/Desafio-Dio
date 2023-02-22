package br.com.dio.desafio.dominio;

public abstract class Conteudos {
	
	protected  static final double XP_PADRAO = 10;
		
	private String titulo;
	private String descriçao;
	
	public abstract double calcularXp(); {
			
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescriçao() {
		return descriçao;
	}

	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}
	
	
}
