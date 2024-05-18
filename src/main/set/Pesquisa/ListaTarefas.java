package main.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

	private Set<Tarefa> tarefaSet;

	public ListaTarefas() {
		this.tarefaSet = new HashSet<>();
	}

	public void adicionarTarefa(String descricao) {
		tarefaSet.add(new Tarefa(descricao, false));
	}

	public void removerTarefa(String descricao) {
		Tarefa removerTarefaPorDescricao = null;
		if(!tarefaSet.isEmpty()) {
			for(Tarefa t : tarefaSet) {
				if(t.getDescricao() == descricao){
					removerTarefaPorDescricao = t;
					break;
				}
			}
		}
		tarefaSet.remove(removerTarefaPorDescricao);
	}

	public void exibirTarefas() {
		System.out.println(tarefaSet);
	}

	public int contarTarefas() {
		if(!tarefaSet.isEmpty()) {
			return tarefaSet.size();
		}
		return 0;
	}

	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefaConcluidas = new HashSet<>();
		if(!tarefaSet.isEmpty()) {
			for(Tarefa t : tarefaSet) {
				if(t.getTarefaStatus().equals(true)) {
					tarefaConcluidas.add(t);
				}
			}
		}
		return tarefaConcluidas;
	}

	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefaPendentes = new HashSet<>();
		if(!tarefaSet.isEmpty()) {
			for(Tarefa t : tarefaSet) {
				if(t.getTarefaStatus().equals(false)) {
					tarefaPendentes.add(t);
				}
			}
		}
		return tarefaPendentes;
	}

	public void marcarTarefaConcluida(String descricao) {
		if(!tarefaSet.isEmpty()) {
			for(Tarefa t : tarefaSet) {
				if(t.getDescricao() == descricao) {
					t.setTarefaStatus(true);
					break;
				}
			}
		}
	}

	public void marcarTarefaPendente(String descricao) {
		if(!tarefaSet.isEmpty()) {
			for(Tarefa t : tarefaSet) {
				if(t.getDescricao() == descricao) {
					t.setTarefaStatus(false);
					break;
				}
			}
		}
	}

	public void limparListaTarefas() {
		tarefaSet.clear();
	}

	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();

		listaTarefas.adicionarTarefa("Estudar Java");
		listaTarefas.adicionarTarefa("Fazer exercícios físicos");
		listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
		listaTarefas.adicionarTarefa("Ler livro");
		listaTarefas.adicionarTarefa("Preparar apresentação");

		System.out.println("Tarefas: ");
		listaTarefas.exibirTarefas();

		listaTarefas.removerTarefa("Fazer exercícios físicos");
		System.out.println();
		System.out.println("Tarefas: ");
		listaTarefas.exibirTarefas();
		
		System.out.println();
		System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

		System.out.println();
		System.out.println("Tarefas Pendentes: ");
		System.out.println(listaTarefas.obterTarefasPendentes());

		listaTarefas.marcarTarefaConcluida("Ler livro");
		listaTarefas.marcarTarefaConcluida("Estudar Java");
		listaTarefas.marcarTarefaConcluida("Preparar apresentação");

		System.out.println();
		System.out.println("Tarefas Concluidas: ");
		listaTarefas.obterTarefasConcluidas();

		listaTarefas.marcarTarefaPendente("Estudar Java");

		System.out.println();
		System.out.println("Tarefas: ");
		listaTarefas.exibirTarefas();

		listaTarefas.limparListaTarefas();
		System.out.println();
		System.out.println("Tarefas: ");
		listaTarefas.exibirTarefas();
	}
}
