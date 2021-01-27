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
		automoveisDisponiveis.add(2, "�nibus");
		automoveisDisponiveis.add(3, "Caminh�o");
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
		automoveisDisponiveis.add(2, "�nibus");
		automoveisDisponiveis.add(3, "Caminh�o");
	}
}