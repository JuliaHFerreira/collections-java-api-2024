package main.set.Ordenacoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	
	private Set<Aluno> alunosSet;

	public GerenciadorAlunos() {
		this.alunosSet = new HashSet<>();
	}
	
	public void adicionarAluno(String nome, Long matricula, double media) {
		alunosSet.add(new Aluno(nome, matricula, media));
	}
	
	public void removerAluno(long matricula) {
		if(!alunosSet.isEmpty()) {
			for(Aluno a : alunosSet) {
				if(a.getMatricula().equals(matricula)) {
					alunosSet.remove(a);
					break;
				}
			}
		}
		else {
		      throw new RuntimeException("O conjunto está vazio!");
	
		}
	}
	
	public void exibirAlunosPorNome() {
		Set<Aluno> ordenarPorNome = new TreeSet<>(alunosSet);
		if(!alunosSet.isEmpty()) {
			System.out.println(ordenarPorNome);
		}
		else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}
	
	public void exibirAlunosPorNota() {
		Set<Aluno> ordenarPorNota = new TreeSet<>(new ComparatorNota());
		if(!alunosSet.isEmpty()) {
			ordenarPorNota.addAll(alunosSet);
			System.out.println(ordenarPorNota);
		}
		else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}
	
	public void exibirAlunos() {
		System.out.println(alunosSet);
	}
	
	public static void main(String[] args) {
		
		GerenciadorAlunos g = new GerenciadorAlunos();
		
		g.adicionarAluno("Larissa antonia", 15805L, 9.8);
		g.adicionarAluno("Maria luiza", 151015L, 5.7);
		g.adicionarAluno("luiza maria", 151515L, 10);
		g.adicionarAluno("Carlos maria", 156515L, 8.9);
		g.adicionarAluno("Ana souza", 180515L, 8.5);
		
		g.exibirAlunosPorNome();
		
		System.out.println();
		
		g.exibirAlunosPorNota();
		
		System.out.println();
		
		g.removerAluno(156515L);
		
		g.exibirAlunos();
		
	}
}
