package br.com.dio.desafio.dominio;

public class Curso extends Conteudos{
	
	
	private int cargaHoraria;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
		
		/* No final do curso, esse método
		irá multiplcar o XP padrão (valor Chumbado na Constante XP) e
		 multiplicar  pela carga horaria
		*/
	}
	
	public Curso() {
		
	}
		
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso = descriçao = " + getDescriçao() + " | titulo = " + getTitulo() + " | cargaHoraria = " + cargaHoraria + "]";
	}



}
