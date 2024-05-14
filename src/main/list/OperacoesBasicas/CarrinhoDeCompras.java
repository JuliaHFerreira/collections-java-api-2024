package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itemCarrinho;

	public CarrinhoDeCompras() {
		this.itemCarrinho = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		Item novoItem = new Item(nome, preco, quantidade);
		itemCarrinho.add(novoItem);
	}

	public void removerItem(String nome) {
		List<Item> removerPorNome = new ArrayList<>();
		for(Item i : itemCarrinho) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				removerPorNome.add(i);
			}
		}
		itemCarrinho.removeAll(removerPorNome);
	}

	public double calcularValorTotal() {
		double total = 0;
		for(Item i : itemCarrinho) {
			total += i.getPreco()*i.getQuantidade();
		}
		return total;
	}

	public void exibirItens() {
		System.out.println(itemCarrinho);
	}

	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

		carrinhoDeCompras.adicionarItem("Lápis", 2, 3);
		carrinhoDeCompras.adicionarItem("Lápis", 2, 3);
		carrinhoDeCompras.adicionarItem("Caderno", 35, 1);
		carrinhoDeCompras.adicionarItem("Borracha", 2, 2);
		carrinhoDeCompras.adicionarItem("Mochila", 105, 1);
		carrinhoDeCompras.adicionarItem("Estojo", 49.90, 1);

		carrinhoDeCompras.exibirItens();

		carrinhoDeCompras.removerItem("Lápis");

		carrinhoDeCompras.exibirItens();

		System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
	}
}
