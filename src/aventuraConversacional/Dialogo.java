package aventuraConversacional;

public class Dialogo {
	/* Modelos */
	public static String modeloCajaIntroduccion(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(texto, 'u', 'v');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.PURPLE);
	}

	public static String modeloCajaBasico(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCaja(texto);
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.GREEN);
	}

	public static String modeloCajaError(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(texto, '=', '!');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.RED);
	}

	/* Cajas de Texto */
	public static String cajaIntroduccion() {
		String[] textoParaCaja = { "¡Hola jugador!",
				"en esta aventura usted llevará a caba una misión en el espacio mientras se enfrenta a numerosas dificultades" };
		return modeloCajaIntroduccion(textoParaCaja);
	}

	public static String cajaInicio() {
		String[] textoParaCaja = { "Año 2026",
				"Hoy por fin es el día de la misión, el ser humano no pisa la luna desde el 72" };
		return modeloCajaBasico(textoParaCaja);
	}

	public static String cajaErrorInicio() {
		String[] textoParaCaja = { "Error:", "¡Vaya!, parece que tiene que empezar su nombre por una letra" };
		return modeloCajaError(textoParaCaja);
	}

	public static String cajaSeleccionarObjeto(String nombre) {
		String[] textoParaCaja = { nombre + ", ",
				"vas a estar una semana fuera, 3 días de ida, uno en la luna y 3 de vuelta" };
		return modeloCajaBasico(textoParaCaja);
	}

	public static String cajaErrorSeleccionarObjeto() {
		String[] textoParaCaja = { "Debe de elegir un numero:", "1, 2 o 3" };
		return modeloCajaError(textoParaCaja);
	}

	public static String cajaSeleccionarModoSalida() {
		String[] textoParaCaja = { "05:35", "Coges tus cosas, te metes en el coche y vas al lanzamiento" };
		return modeloCajaBasico(textoParaCaja);
	}

	public static String cajaLanzamiento() {
		String[] textoParaCaja = { "Te preparas para el lanzamiento, antes de subir a la nave,",
				"tienes que pasar un test rápido de repaso, eres un experto 	así que no es un problema para ti" };
		return modeloCajaBasico(textoParaCaja);
	}

	public static String cajaErrorSeleccionarModo() {
		String[] textoParaCaja = { "Debe de elegir un numero:", "1 o 2" };
		return modeloCajaError(textoParaCaja);
	}

	public static String cajaFallorespeto1() {
		String[] textoParaCaja = { "Ups, parece que aún no estás muy despierto, esa no es la respuesta correcta,",
				"venga, vuelve a intentarlo, te la sabes." };
		return modeloCajaError(textoParaCaja);
	}

	public static String cajaErrorRespeto1() {
		String[] textoParaCaja = { "Debe de elegir un numero:", "1, 2, 3, 4, 5 o 6" };
		return modeloCajaError(textoParaCaja);
	}
}
