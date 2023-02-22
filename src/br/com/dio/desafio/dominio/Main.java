package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();

		curso1.setTitulo(" Banco PAN Java Developer ");
		curso1.setDescriçao("Descrição Curso Java");
		curso1.setCargaHoraria(8);
		System.out.println();

		Curso curso2 = new Curso();

		curso2.setTitulo("Curso JavaScript");
		curso2.setDescriçao("Descrição Curso JavaScript");
		curso2.setCargaHoraria(4);
		System.out.println();

		Mentoria mentoria1 = new Mentoria();

		mentoria1.setTitulo(" Mentoria Java ");
		mentoria1.setDescriçao(" Descrição mentoria Java ");
		mentoria1.setCargaHoraria(2);
		mentoria1.setData(LocalDate.now());
		System.out.println();

		Mentoria mentoria2 = new Mentoria();

		mentoria2.setTitulo(" Mentoria JavaScript ");
		mentoria2.setDescriçao(" Descrição mentoria JavaScript ");
		mentoria2.setCargaHoraria(1);
		mentoria2.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		System.out.println(mentoria2);
		System.out.println();
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescriçao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);
        
        Dev devAfonso = new Dev();
        devAfonso.setNome("Afonso");
        devAfonso.inscreverBootcamp(bootcamp);
        devAfonso.progredir();
        System.out.println("-");
        System.out.println("Conteudos Incritos - Afonso " + devAfonso.getConteudosInscritos());
        System.out.println("Conteudos Concludios" + devAfonso.getConteudosConcluidos());
        System.out.println("XP" + devAfonso.calcularTotalXp());
        System.out.println();
        
        Dev devBianca = new Dev();
        devBianca.setNome("Bianca");
        devBianca.inscreverBootcamp(bootcamp);
        devBianca.progredir();
        System.out.println("-");
        System.out.println("Conteudos Incritos - Bianca " + devBianca.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devBianca.getConteudosConcluidos());
        System.out.println("XP" + devBianca.calcularTotalXp());
	}

}
