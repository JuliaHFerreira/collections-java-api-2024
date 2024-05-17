package main.set.Ordenacoes;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
	
	private String nome;
	private Long matricula;
	private Double nota;
	
	public Aluno(String nome, Long matricula, Double nota) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}
	
	@Override
	public int compareTo(Aluno c) {
		return nome.compareToIgnoreCase(c.getNome());
	}
	
	public Long getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Double getNota() {
		return nota;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Aluno))
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "{Aluno: nome: " + 
				nome + 
				", matricula: " + 
				matricula + 
				", nota: " + 
				nota + "}\n";
	}
}
class ComparatorNota implements Comparator<Aluno> {
	  @Override
	  public int compare(Aluno a1, Aluno a2) {
	    return Double.compare(a1.getNota(), a2.getNota());   
	  
	  }
	}
