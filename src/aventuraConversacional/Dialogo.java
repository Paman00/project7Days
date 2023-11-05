package aventuraConversacional;

import java.util.ArrayList;
import java.util.List;

public class Dialogo {
	public static int anchoPredeterminado = 71;

	public static final String ANSI_RESET = "\u001B[0m";

	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RED = "\u001B[31m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";

	public static String dIntro() {
		// TODO
		StringBuilder message = new StringBuilder();
		message.append(formatearTextoCaja(new String[] { "", "Hola jugador,",
				"en esta aventura usted llevará a cabo una misión en el espacio mientras se enfrenta a numerosas dificultades ",
				"" }));

		return message.toString();
	}

	public static String m001() {
		return centrarLinea("Irá su astronauta solo, ¿Cúal es su nombre?: ", anchoPredeterminado);
	}

	public static String e001() {
		StringBuilder message = new StringBuilder();
		message.append(ANSI_BLACK_BACKGROUND + ANSI_RED
				+ formatearTextoCajaPersonalizada(
						new String[] { "Error:", "Vaya, parece que tiene que empezar su nombre por una letra!", },
						anchoPredeterminado, '=', '!')
				+ ANSI_RESET).append(m001());
		return message.toString();
	}

	public static String d001() {
		StringBuilder message = new StringBuilder();

		message.append(Recursos.casco()).append("\n")
				.append(ANSI_BLACK_BACKGROUND
						+ formatearTextoCaja(new String[] { "Año 2026",
								"Hoy por fin es el día de la misión, el ser humano no pisa la luna desde el 72" })
						+ ANSI_RESET)
				.append(m001());
		return message.toString();

	}

	public static String formatearTextoCaja(String[] textos) {
		// formatearTextoCaja(textos) -> String
		/*
		 * Dado un array de Strings, devuelve un String con el texto formateado en una
		 * caja.
		 */

		return formatearTextoCajaPersonalizada(textos, anchoPredeterminado, '=', '|');
	}

	public static String formatearTextoCajaPersonalizada(String[] textos, int anchoMaximo, char horizontalChar,
			char verticalChar) {
		// formatearTextoCajaPersonalizada(textos, anchoMaximo, horizontalChar,
		// verticalChar) -> String
		/*
		 * Dado un array de Strings, devuelve un String con el texto formateado en una
		 * caja personalizada.
		 */

		return formatearTextoCajaFullPersonalizada(textos, anchoMaximo, horizontalChar, verticalChar, horizontalChar,
				verticalChar);
	}

	public static String formatearTextoCajaFullPersonalizada(String[] textos, int anchoMaximo, char superiorChar,
			char derechaChar, char inferiorChar, char izquierdaChar) {
		// formatearTextoCajaFullPersonalizada(textos, anchoMaximo, superiorChar,
		// derechaChar, inferiorChar, izquierdaChar) -> String
		/*
		 * Dado un array de Strings, devuelve un String con el texto formateado en una
		 * caja personalizada.
		 */

		if (anchoMaximo < 5) {
			anchoMaximo = 5;
		}
		StringBuilder resultado = new StringBuilder("\n");
		String bordeSuperior = bordeHorizontal(superiorChar, anchoMaximo); // Borde superior
		resultado.append(bordeSuperior);

		for (String texto : textos) {

			String[] lineas = ajustarLineas(texto.replace("\n", "").replace("\r", ""), anchoMaximo - 4);
			for (String linea : lineas) {
				resultado.append(izquierdaChar + " " + centrarLinea(linea, anchoMaximo - 4) + " " + derechaChar + "\n");
			}
		}

		String bordeInferior = bordeHorizontal(inferiorChar, anchoMaximo); // Borde inferior
		resultado.append(bordeInferior);
		return resultado.toString();
	}

	public static String centrarLinea(String linea, int anchoMaximo) {
		// centrarLinea(linea, anchoMaximo) -> String
		/*
		 * Dado un texto y un ancho máximo, devuelve el texto centrado en una linea de
		 * ancho anchoMaximo.
		 */

		StringBuilder resultado = new StringBuilder();
		int espacios = (anchoMaximo - linea.length()) / 2;

		for (int i = 0; i < espacios; i++) {
			resultado.append(" ");
		}
		if ((anchoMaximo % 2 == 0 && linea.length() % 2 != 0) || (anchoMaximo % 2 == 1 && linea.length() % 2 == 0)) {
			resultado.append(" ");
		}

		resultado.append(linea);

		for (int i = 0; i < espacios; i++) {
			resultado.append(" ");
		}

		return resultado.toString();
	}

	public static String[] ajustarLineas(String texto, int anchoMaximo) {
		// ajustarLineas(texto, anchoMaximo) -> String[]
		/*
		 * Dado un texto y un ancho máximo, devuelve un array de lineas ajustadas al
		 * ancho máximo.
		 */

		StringBuilder line = new StringBuilder("");
		List<String> lineas = new ArrayList<String>();

		String words[] = texto.split(" ");
		for (String word : words) {
			if (word.equals("\n") || word.equals("\r") || word.equals("\r\n") || word.equals("\n\r")) {
				lineas.add(line.toString());
				line = new StringBuilder("");
			} else if (line.length() + word.length() < anchoMaximo) {
				line.append(word + " ");
			} else {
				lineas.add(line.toString());
				line = new StringBuilder(word + " ");
			}
		}
		lineas.add(line.toString());

		return lineas.toArray(new String[lineas.size()]);
	}

	public static String bordeHorizontal(char horizontalChar, int anchoMaximo) {
		// bordeHorizontal(horizontalChar, anchoMaximo) -> String
		/*
		 * Dado un carácter y un ancho máximo, devuelve un String con el carácter
		 * repetido anchoMaximo veces.
		 */

		StringBuilder borde = new StringBuilder();
		for (int i = 0; i < anchoMaximo; i++) {
			borde.append(horizontalChar);
		}
		borde.append("\n");
		return borde.toString();
	}
}
