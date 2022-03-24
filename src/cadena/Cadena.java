package cadena;

public class Cadena {

	public static int longitud(String cadena) {
		return cadena.length();
	}

	public static int vocales(String cadena) {
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

	public static String invertir(String cadena) {
		StringBuilder invertido = new StringBuilder();

		for (int i = (cadena.length() - 1); i >= 0; i--) {
			invertido.append(cadena.charAt(i));
		}

		return invertido.toString();
	}

	public static int contarLetra(String cadena, char caracter) {
		int contador = 0;

		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter) {
				contador++;
			}
		}

		return contador;
	}
}
