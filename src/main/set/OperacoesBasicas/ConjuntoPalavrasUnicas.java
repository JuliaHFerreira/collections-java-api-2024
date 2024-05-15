package main.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

	private Set<String> palavrasUnicasSet;

	public ConjuntoPalavrasUnicas() {
		this.palavrasUnicasSet = new HashSet<>();
	}

	public void adicionarPalavra(String palavra) {
		palavrasUnicasSet.add(palavra);
	}

	public void removerPalavra(String palavra) {
		if (!palavrasUnicasSet.isEmpty()) {
			if (palavrasUnicasSet.contains(palavra)) {
				palavrasUnicasSet.remove(palavra);
			} 
			else {
				System.out.println("Palavra não encontrada no conjunto!");
			}
		} 
		else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}

	public void verificarPalavra(String palavra) {
		if (!palavrasUnicasSet.isEmpty()) {
			if (palavrasUnicasSet.contains(palavra)) {
				System.out.println("Palavra " + palavra +" Encontrada");
			} 
			else {
				System.out.println("Palavra não encontrada no conjunto!");
			}
		} 
		else {
			throw new RuntimeException("O conjunto está vazio!");
		}
	}

	public void exibirPalavrasUnicas(){
		System.out.println(palavrasUnicasSet);
	}

	@Override
	public String toString() {
		return "ConjuntoPalavrasUnicas: "
				+ palavrasUnicasSet + "\n";
	}

	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

		conjuntoLinguagens.adicionarPalavra("Java");
		conjuntoLinguagens.adicionarPalavra("Python");
		conjuntoLinguagens.adicionarPalavra("JavaScript");
		conjuntoLinguagens.adicionarPalavra("Python");
		conjuntoLinguagens.adicionarPalavra("C++");
		conjuntoLinguagens.adicionarPalavra("Ruby");

		conjuntoLinguagens.exibirPalavrasUnicas();

		conjuntoLinguagens.removerPalavra("Python");
		conjuntoLinguagens.exibirPalavrasUnicas();


		conjuntoLinguagens.removerPalavra("Swift");
		
		System.out.println("A linguagem Java está no conjunto?");
		conjuntoLinguagens.verificarPalavra("Java");
		
		System.out.println("A linguagem Python está no conjunto?");
		conjuntoLinguagens.verificarPalavra("Python");
	
		conjuntoLinguagens.exibirPalavrasUnicas();
	}
}
