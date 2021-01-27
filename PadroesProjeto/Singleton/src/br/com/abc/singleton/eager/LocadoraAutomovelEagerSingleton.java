package br.com.abc.singleton.eager;

import java.util.ArrayList;
import java.util.List;

public class LocadoraAutomovelEagerSingleton {
	private static final LocadoraAutomovelEagerSingleton INSTACE = new LocadoraAutomovelEagerSingleton();
	private List<String> automoveisDisponiveis;

	private LocadoraAutomovelEagerSingleton() {
		this.automoveisDisponiveis = new ArrayList<>();
		automoveisDisponiveis.add(0, "Moto");
		automoveisDisponiveis.add(1, "Carro");
		automoveisDisponiveis.add(2, "Ônibus");
		automoveisDisponiveis.add(3, "Caminhão");
	}

	public static LocadoraAutomovelEagerSingleton getInstace() {
		return INSTACE;
	}

	public void reservarAutomovel(String pAutomovel) {
		automoveisDisponiveis.remove(pAutomovel);
	}

	public String listarAutomoveisDisponiveis() {
		return automoveisDisponiveis.toString();
	}
}