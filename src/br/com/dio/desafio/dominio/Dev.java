package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.DoubleStream;

public class Dev {

	private String nome;
	private Set<Conteudos> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudos> conteudosConcluidos = new LinkedHashSet<>();

	public void inscreverBootcamp(Bootcamp Bootcamp) {

		this.conteudosInscritos.addAll(Bootcamp.getConteudos());
		Bootcamp.getDevsInscritos().add(this);
	}

	public void progredir() {

		Optional<Conteudos> conteudo = this.conteudosInscritos.stream().findFirst();

		if (conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.getClass());
		} else {
			System.err.println("Você não está matriculado em nenhum conteúdo");
		}
	}

	public double calcularTotalXp() {
		return this.conteudosConcluidos.stream().mapToDouble(Conteudos -> Conteudos.calcularXp()).sum();

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudos> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudos> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudos> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudos> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}

}
