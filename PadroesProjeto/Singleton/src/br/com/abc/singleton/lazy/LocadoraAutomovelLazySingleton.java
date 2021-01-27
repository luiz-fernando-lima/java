package br.com.abc.singleton.lazy;

import java.util.ArrayList;
import java.util.List;

public class LocadoraAutomovelLazySingleton {
	private static LocadoraAutomovelLazySingleton INSTACE;
	private List<String> automoveisDisponiveis;

	private LocadoraAutomovelLazySingleton() {
		this.automoveisDisponiveis = new ArrayList<>();
		automoveisDisponiveis.add(0, "Moto");
		automoveisDisponiveis.add(1, "Carro");
		automoveisDisponiveis.add(2, "Ônibus");
		automoveisDisponiveis.add(3, "Caminhão");
	}

	public static LocadoraAutomovelLazySingleton getInstaceLazyComum() {
		if(INSTACE == null) {
			INSTACE = new LocadoraAutomovelLazySingleton();			
		}
		return INSTACE;
	}

	public synchronized static LocadoraAutomovelLazySingleton getInstaceLazySincronizado() {
		if(INSTACE == null) {
			INSTACE = new LocadoraAutomovelLazySingleton();			
		}
		return INSTACE;
	}

	public static LocadoraAutomovelLazySingleton getInstaceLazyDuplaVerificacao() {
		if(INSTACE == null) {
			synchronized (LocadoraAutomovelLazySingleton.class) {
				if(INSTACE == null) {
					INSTACE = new LocadoraAutomovelLazySingleton();
				}
			}		
		}
		return INSTACE;
	}

	public void reservarAutomovel(String pAutomovel) {
		automoveisDisponiveis.remove(pAutomovel);
	}

	public String listarAutomoveisDisponiveis() {
		return automoveisDisponiveis.toString();
	}
}