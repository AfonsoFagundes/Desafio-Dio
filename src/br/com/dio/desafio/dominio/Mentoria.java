package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudos {
	

	private int cargaHoraria;
	private LocalDate data;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO + 20;	
	}
	
	public Mentoria () {
		
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Mentoria = mentoria  "  + " | descriçao = " + getDescriçao() + " | titulo = " + getTitulo() + " | cargaHoraria = " + cargaHoraria
				+ " | data=" + data + "]";

		
	}
	

}
