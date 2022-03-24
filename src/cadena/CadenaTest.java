package cadena;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CadenaTest {

	@Test
	void testLongitud() {
		assertEquals(6, Cadena.longitud("patata"));
	}

	@Test
	void testVocalesConVocales() {
		assertEquals(3, Cadena.vocales("patata"));
	}
	
	@Test
	void testVocalesSinVocales() {
		assertEquals(0, Cadena.vocales("sjdgjg"));
	}

	@Test
	void testInvertir() {
		assertEquals("atatap", Cadena.invertir("patata"));
	}

	@Test
	void testContarLetraCuandoHay() {
		assertEquals(2, Cadena.contarLetra("patata", 't'));
	}
	
	@Test
	void testContarLetraCuandoNoHay() {
		assertEquals(0, Cadena.contarLetra("patata", 'y'));
	}

}
