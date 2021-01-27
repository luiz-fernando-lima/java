package br.com.abc.singleton.enumeracao;

import java.util.ArrayList;
import java.util.List;

public enum LocadoraAutomovelEnumSingleton {
	INSTANCE;
	private List<String> automoveisDisponiveis;
	
	LocadoraAutomovelEnumSingleton() {
		this.automoveisDisponiveis = new ArrayList<>();
		automoveisDisponiveis.add(0, "Moto");
		automoveisDisponiveis.add(1, "Carro");
		automoveisDisponiveis.add(2, "Ônibus");
		automoveisDisponiveis.add(3, "Caminhão");
	}
	
	public void reservarAutomovel(String pAutomovel) {
		automoveisDisponiveis.remove(pAutomovel);
	}

	public String listarAutomoveisDisponiveis() {
		return automoveisDisponiveis.toString();
	}
	
	public void recriarLista() {
		automoveisDisponiveis.clear();
		automoveisDisponiveis.add(0, "Moto");
		automoveisDisponiveis.add(1, "Carro");
		automoveisDisponiveis.add(2, "Ônibus");
		automoveisDisponiveis.add(3, "Caminhão");
	}
}