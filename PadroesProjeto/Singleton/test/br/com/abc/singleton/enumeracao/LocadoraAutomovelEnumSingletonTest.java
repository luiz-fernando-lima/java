package br.com.abc.singleton.enumeracao;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class LocadoraAutomovelEnumSingletonTest {
	private LocadoraAutomovelEnumSingleton laes1 = LocadoraAutomovelEnumSingleton.INSTANCE;
	private LocadoraAutomovelEnumSingleton laes2 = LocadoraAutomovelEnumSingleton.INSTANCE;
	private LocadoraAutomovelEnumSingleton laes3 = LocadoraAutomovelEnumSingleton.INSTANCE;

	@AfterEach
	public void tearDown() throws Exception {
		laes1.recriarLista();
	}
	
	@Test
	public final void testEnumSingletonTodosAutomoveisDisponiveis() {
		assertEquals("[Moto, Carro, Ônibus, Caminhão]", laes1.listarAutomoveisDisponiveis());
		assertEquals("[Moto, Carro, Ônibus, Caminhão]", laes2.listarAutomoveisDisponiveis());
		assertEquals("[Moto, Carro, Ônibus, Caminhão]", laes3.listarAutomoveisDisponiveis());
	}

	@Test
	public final void testEnumSingletonTodosAutomoveisMotoCarroDisponiveis() {
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