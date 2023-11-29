package aventuraConversacional;

import java.util.ArrayList;
import java.util.List;

public class FuncionesDialogo {
	public static int anchoPredeterminado = 71;

	/**
	 * Agrega color a un mensaje de texto 
	 * @param mensaje texto a colorear
	 * @param color color a aplicar, usar las constantes de la clase Recursos
	 * @return texto coloreado
	 */
	public static String agregarColor(String mensaje, String color) {
		return color + mensaje + Recursos.RESET;
	}

	/**
	 * Formatea un texto en una caja de texto con el ancho predeterminado y los bordes predeterminados ('=' horizontal, '|' vertical)
	 * @param textos texto a formatear, cada elemento del array es una linea, se ajusta automáticamente
	 * @return texto formateado en una caja predeterminada
	 */
	public static String formatearTextoCaja(String[] textos) {
		return formatearTextoCajaPersonalizada(textos, '=', '|');
	}

	/**
	 * Formatea un texto en una caja de texto con el ancho predeterminado y los bordes personalizados
	 * @param textos texto a formatear, cada elemento del array es una linea, se ajusta automáticamente
	 * @param horizontalChar carácter a usar para el borde horizontal
	 * @param verticalChar carácter a usar para el borde vertical
	 * @return texto formateado en una caja de tamaño predeterminado con bordes personalizados
	 */
	public static String formatearTextoCajaPersonalizada(String[] textos, char horizontalChar, char verticalChar) {
		return formatearTextoCajaFullPersonalizada(textos, anchoPredeterminado, horizontalChar, verticalChar,
				horizontalChar, verticalChar);
	}

	/**
	 * Formatea un texto en una caja de texto con un ancho personalizado y cada uno de los bordes personalizados
	 * @param textos texto a formatear, cada elemento del array es una linea, se ajusta automáticamente
	 * @param anchoMaximo ancho máximo de la caja, mínimo 5
	 * @param superiorChar carácter a usar para el borde horizontal superior
	 * @param derechaChar carácter a usar para el borde vertical derecho
	 * @param inferiorChar carácter a usar para el borde horizontal inferior
	 * @param izquierdaChar carácter a usar para el borde vertical izquierdo
	 * @return texto formateado en una caja de tamaño personalizado con bordes personalizados
	 */
	public static String formatearTextoCajaFullPersonalizada(String[] textos, int anchoMaximo, char superiorChar,
			char derechaChar, char inferiorChar, char izquierdaChar) {
		if (anchoMaximo < 5) {
			anchoMaximo = 5;
		}
		String resultado = "\n";

		String bordeSuperior = bordeHorizontal(superiorChar, anchoMaximo); // Borde superior
		resultado += bordeSuperior + "\n";

		for (String texto : textos) {

			String[] lineas = ajustarLineas(texto.replace("\n", "").replace("\r", ""), anchoMaximo - 4);
			for (String linea : lineas) {
				resultado += izquierdaChar + " " + centrarLineaPersonalizada(linea, anchoMaximo - 4) + " " + derechaChar + "\n";
			}
		}

		String bordeInferior = bordeHorizontal(inferiorChar, anchoMaximo); // Borde inferior
		resultado += bordeInferior;
		return resultado.toString();
	}

	/**
	 * Centra un texto en una caja de texto con el ancho predeterminado, con saltos de linea automáticos
	 * @param texto texto a centrar
	 * @return texto centrado en una caja de tamaño máximo predeterminado
	 */
	public static String centrarTexto(String texto) {
		return centrarTextoPersonalizado(texto, anchoPredeterminado);
	}
	/**
	 * Centra un texto en una caja de texto con un ancho personalizado, con saltos de linea automáticos
	 * @param texto texto a centrar
	 * @param anchoMaximo ancho máximo de la caja
	 * @return texto centrado en una caja de tamaño máximo personalizado
	 */
	public static String centrarTextoPersonalizado(String texto, int anchoMaximo) {
		String[] lineas = ajustarLineas(texto, anchoMaximo);
		String resultado = "";
		for(int i = 0; i<lineas.length; i++) {
			
			resultado += centrarLineaPersonalizada(lineas[i], anchoMaximo);
			if(i!=lineas.length-1) {
				resultado+="\n";
			}
		}
		return resultado;
	}
	/**
	 * Centra una linea sin saltos de linea con el ancho predeterminado
	 * @param linea texto no mayor al ancho predeterminado a centrar
	 * @return texto centrado en una caja de tamaño máximo predeterminado
	 */
	public static String centrarLinea(String linea) {
		return centrarLineaPersonalizada(linea, anchoPredeterminado);
	}
	/**
	 * Centra una linea sin saltos de linea con un ancho personalizado
	 * @param linea texto no mayor al ancho especificado a centrar
	 * @param anchoMaximo ancho máximo de la linea
	 * @return texto centrado en una linea de tamaño máximo personalizado
	 */
	public static String centrarLineaPersonalizada(String linea, int anchoMaximo) {
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

	/**
	 * Ajusta un texto a un ancho máximo, con saltos de linea automáticos
	 * @param texto texto a ajustar (sin saltos de linea)
	 * @param anchoMaximo ancho máximo de cada linea del texto
	 * @return texto ajustado a un ancho máximo
	 */
	public static String[] ajustarLineas(String texto, int anchoMaximo) {
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

	/**
	 * Genera un borde horizontal de un ancho especificado
	 * @param horizontalChar carácter a usar para el borde horizontal
	 * @param anchoMaximo ancho máximo del borde
	 * @return
	 */
	public static String bordeHorizontal(char horizontalChar, int anchoMaximo) {
		StringBuilder borde = new StringBuilder();
		for (int i = 0; i < anchoMaximo; i++) {
			borde.append(horizontalChar);
		}
		return borde.toString();
	}
}
