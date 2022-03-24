package cadena;

public class Cadena {

	public int longitud(String cadena) {
		return cadena.length();
	}

	public int vocales(String cadena) {
		int numVocales = 0;
		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < cadena.length(); i++) {
			for (char c : vocales) {
				if (cadena.charAt(i) == c) {
					numVocales++;
				}
			}
		}

		return numVocales;
	}

	public String invertir(String cadena) {
		StringBuilder invertido = new StringBuilder();

		for (int i = cadena.length(); i > 0; i--) {
			invertido.append(cadena.charAt(i));
		}

		return invertido.toString();
	}

	public int contarLetra(String cadena, char caracter) {
		int contador = 0;

		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter) {
				contador++;
			}
		}

		return contador;
	}
}
