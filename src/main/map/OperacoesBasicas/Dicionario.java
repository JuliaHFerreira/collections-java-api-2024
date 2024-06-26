package main.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

	private Map<String, String> dicionarioMap;

	public Dicionario() {
		this.dicionarioMap = new HashMap<>();
	}

	public void adicionarPalavra(String palavra, String definicao) {
			dicionarioMap.put(palavra, definicao);
	}

	public void removerPalavra(String palavra) {
		if(!dicionarioMap.isEmpty()) {
			dicionarioMap.remove(palavra);
		}
		else {
			throw new RuntimeException("Palavra não encontrada");
		}
	}

	public void exibirPalavras() {
		System.out.println(dicionarioMap);
	}

	public String pesquisarPorPalavra(String palavra) {
		String pesquisaPalavra = null;
		if(!dicionarioMap.isEmpty()) {
			pesquisaPalavra = dicionarioMap.get(palavra);
		}
		else {
			throw new RuntimeException("Palavra não encontrada");
		}
		return pesquisaPalavra;
	}
	
	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario();

		dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
		dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
		dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

		dicionario.exibirPalavras();

		String definicaoJava = dicionario.pesquisarPorPalavra("java");
		System.out.println("Definição da linguagem 'java': " + definicaoJava);

		String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
		System.out.println(definicaoCSharp);

		dicionario.removerPalavra("typescript");
		dicionario.exibirPalavras();
	}
}
