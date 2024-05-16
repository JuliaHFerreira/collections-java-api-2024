package main.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ContagemPalavras {

	private Map<String, Integer> contagemPalavrasMap;

	public ContagemPalavras() {
		this.contagemPalavrasMap = new HashMap<>();
	}

	public void adicionarPalavra(String palavra, Integer contage) {
		contagemPalavrasMap.put(palavra, contage);
	}

	public void removerPalavra(String palavra) {
		if(!contagemPalavrasMap.isEmpty()) {
			contagemPalavrasMap.remove(palavra);
		}
		else {
			throw new RuntimeException("Palavra não encontrada");
		}
	}

	public void exibirContagemPalavras() {
		System.out.println(contagemPalavrasMap);
	}

	public String encontrarPalavraMaisFrequente() {
		String palavraMaisFalada = null;
		int maiorContagem = 0;
		if(!contagemPalavrasMap.isEmpty()) {
			for(Entry<String, Integer> e : contagemPalavrasMap.entrySet()) {
				maiorContagem = e.getValue();
				palavraMaisFalada = e.getKey();
			}
		}
		return palavraMaisFalada;
	}
	public static void main(String[] args) {
		ContagemPalavras contagemLinguagens = new ContagemPalavras();

		contagemLinguagens.adicionarPalavra("Java", 2);
		contagemLinguagens.adicionarPalavra("Python", 8);
		contagemLinguagens.adicionarPalavra("JavaScript", 1);
		contagemLinguagens.adicionarPalavra("C#", 6);

		System.out.print("Existem ");
		contagemLinguagens.exibirContagemPalavras(); 
		System.out.print("palavras.\n");
		String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
		System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
	}
}
