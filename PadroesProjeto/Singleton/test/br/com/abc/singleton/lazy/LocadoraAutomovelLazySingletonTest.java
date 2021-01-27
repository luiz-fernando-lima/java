package br.com.abc.singleton.lazy;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class LocadoraAutomovelLazySingletonTest {
	private LocadoraAutomovelLazySingleton laes1 = LocadoraAutomovelLazySingleton.getInstaceLazyComum();
	private LocadoraAutomovelLazySingleton laes2 = LocadoraAutomovelLazySingleton.getInstaceLazySincronizado();
	private LocadoraAutomovelLazySingleton laes3 = LocadoraAutomovelLazySingleton.getInstaceLazyDuplaVerificacao();

	@Test
	public final void testLazySingletonTodosAutomoveisDisponiveis() {
		assertEquals("[Moto, Carro, Ônibus, Caminhão]", laes1.listarAutomoveisDisponiveis());
		assertEquals("[Moto, Carro, Ônibus, Caminhão]", laes2.listarAutomoveisDisponiveis());
		assertEquals("[Moto, Carro, Ônibus, Caminhão]", laes3.listarAutomoveisDisponiveis());
	}

	@Test
	public final void testLazySingletonTodosAutomoveisMotoCarroDisponiveis() {
		laes3.reservarAutomovel("Ônibus");
		assertEquals("[Moto, Carro, Caminhão]", laes1.listarAutomoveisDisponiveis());
		assertEquals("[Moto, Carro, Caminhão]", laes2.listarAutomoveisDisponiveis());
		assertEquals("[Moto, Carro, Caminhão]", laes3.listarAutomoveisDisponiveis());

		laes2.reservarAutomovel("Caminhão");
		assertEquals("[Moto, Carro]", laes1.listarAutomoveisDisponiveis());
		assertEquals("[Moto, Carro]", laes2.listarAutomoveisDisponiveis());
		assertEquals("[Moto, Carro]", laes3.listarAutomoveisDisponiveis());
	}
}