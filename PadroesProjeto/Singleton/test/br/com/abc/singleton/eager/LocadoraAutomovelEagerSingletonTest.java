package br.com.abc.singleton.eager;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class LocadoraAutomovelEagerSingletonTest {
	private LocadoraAutomovelEagerSingleton laes1 = LocadoraAutomovelEagerSingleton.getInstace();
	private LocadoraAutomovelEagerSingleton laes2 = LocadoraAutomovelEagerSingleton.getInstace();
	private LocadoraAutomovelEagerSingleton laes3 = LocadoraAutomovelEagerSingleton.getInstace();

	@Test
	public final void testEagerSingletonTodosAutomoveisDisponiveis() {
		assertEquals("[Moto, Carro, �nibus, Caminh�o]", laes1.listarAutomoveisDisponiveis());
		assertEquals("[Moto, Carro, �nibus, Caminh�o]", laes2.listarAutomoveisDisponiveis());
		assertEquals("[Moto, Carro, �nibus, Caminh�o]", laes3.listarAutomoveisDisponiveis());
	}

	@Test
	public final void testEagerSingletonTodosAutomoveisMotoCarroDisponiveis() {
		laes3.reservarAutomovel("�nibus");
		assertEquals("[Moto, Carro, Caminh�o]", laes1.listarAutomoveisDisponiveis());
		assertEquals("[Moto, Carro, Caminh�o]", laes2.listarAutomoveisDisponiveis());
		assertEquals("[Moto, Carro, Caminh�o]", laes3.listarAutomoveisDisponiveis());

		laes2.reservarAutomovel("Caminh�o");
		assertEquals("[Moto, Carro]", laes1.listarAutomoveisDisponiveis());
		assertEquals("[Moto, Carro]", laes2.listarAutomoveisDisponiveis());
		assertEquals("[Moto, Carro]", laes3.listarAutomoveisDisponiveis());
	}
}