package main.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class AgendaEventos {
	
	private Map<LocalDate, Evento> eventosMap;
	
	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		eventosMap.put(data, new Evento(nome, atracao));
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
		/*Set<LocalDate> datSete = eventosMap.keySet();
		Collection<Evento> values = eventosMap.values(); - não funciona*/ 
		//eventosMap.get(); - não funciona
		
		LocalDate dataAtual = LocalDate.now();
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		for(Entry<LocalDate, Evento> e : eventosTreeMap.entrySet()) { //poderia for(var e : eventosmap.entrySet())
			if(e.getKey().isEqual(dataAtual) || e.getKey().isAfter(dataAtual)) {
				LocalDate proximaData = e.getKey();
				Evento proximoEvento = e.getValue();
				System.out.println("O proximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
	    AgendaEventos agendaEventos = new AgendaEventos();

	    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
	    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
	    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
	    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
	    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

	    agendaEventos.exibirAgenda();

	    agendaEventos.obterProximoEvento();
	  }
}
