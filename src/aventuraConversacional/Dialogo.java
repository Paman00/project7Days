package aventuraConversacional;

import java.util.ArrayList;
import java.util.List;

public class Dialogo {
	
	
	public static String formatearTexto(String[] textos) {
		int anchoMaximo = 70; // Ancho máximo de la caja
		StringBuilder resultado = new StringBuilder();
		String textoBorde = bordeHorizontal('=', anchoMaximo); // Borde superior e inferior
		
		resultado.append(textoBorde);

		for (String texto : textos) {
			String[] lineas = ajustarLineasTexto(texto, anchoMaximo - 4);
			for (String linea : lineas) {
				resultado.append("| " + centrarTexto(linea, anchoMaximo - 4) + " |\n");
			}
		}

		resultado.append(textoBorde);
		return resultado.toString();
	}

	public static String centrarTexto(String texto, int anchoMaximo) {
		StringBuilder resultado = new StringBuilder();
		int espacios = (anchoMaximo - texto.length()) / 2;

		for (int i = 0; i < espacios; i++) {
			resultado.append(" ");
		}
		if (texto.length() % 2 != 0) {
			resultado.append(" ");
		}
		resultado.append(texto);
		for (int i = 0; i < espacios; i++) {
			resultado.append(" ");
		}

		return resultado.toString();
	}

	public static String[] ajustarLineasTexto(String texto, int anchoMaximo) {
		StringBuilder line = new StringBuilder("");
		List<String> lineas = new ArrayList<String>();

		String words[] = texto.split(" ");
		for (String word : words) {
			if (line.length() + word.length() < anchoMaximo) {
				line.append(word + " ");
			} else {
				lineas.add(line.toString());
				line = new StringBuilder(word + " ");
			}
		}
		lineas.add(line.toString());

		return lineas.toArray(new String[lineas.size()]);
	}

	public static String bordeHorizontal(char caracterBorde, int anchoMaximo) {
		StringBuilder borde = new StringBuilder();
		for (int i = 0; i < anchoMaximo; i++) {
			borde.append(caracterBorde);
		}
		borde.append("\n");
		return borde.toString();
	}
}
