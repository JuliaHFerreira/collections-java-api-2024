package main.set.Pesquisa;

import java.util.Objects;

public class Tarefa {
	
	private String descricao;
	private Boolean tarefaStatus;
	
	public Tarefa(String descricao, Boolean tarefaStatus) {
		this.descricao = descricao;
		this.tarefaStatus = tarefaStatus;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public Boolean getTarefaStatus() {
		return tarefaStatus;
	}
	
	public void setTarefaStatus(Boolean tarefaStatus) {
		this.tarefaStatus = tarefaStatus;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Tarefa))
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(descricao, other.descricao);
	}

	@Override
	public String toString() {
		return "{Tarefa: " + 
				descricao + 
				", Status: " + 
				tarefaStatus + "}\n";
	}
		
}
