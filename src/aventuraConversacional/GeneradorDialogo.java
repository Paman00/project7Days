package aventuraConversacional;

public class GeneradorDialogo {

	public static String obtenerCajaIntroduccion() {
		String[] textoParaCaja = { "¡Hola jugador!",
				"en esta aventura usted llevará a caba una misión en el espacio mientras se enfrenta a numerosas dificultades" };
		String textoEnCaja = Dialogo.formatearTextoCajaPersonalizada(textoParaCaja, 'u', 'v');
		return Dialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.PURPLE);
	}

	public static String obtenerCajaInicio() {
		String[] textoParaCaja = { "Año 2026",
				"Hoy por fin es el día de la misión, el ser humano no pisa la luna desde el 72" };
		String textoEnCaja = Dialogo.formatearTextoCaja(textoParaCaja);
		return Dialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.GREEN);
	}

	public static String obtenerCajaErrorInicio() {
		String[] textoParaCaja = { "Error:", "¡Vaya!, parece que tiene que empezar su nombre por una letra" };
		String textoEnCaja = Dialogo.formatearTextoCajaPersonalizada(textoParaCaja, '=', '!');
		return Dialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.RED);
	}

	public static String obtenerCajaSeleccionarObjeto(String nombre) {
		String[] textoParaCaja = { "",
				nombre + ", vas a estar una semana fuera, 3 días de ida, uno en la luna y 3 de vuelta", "" };
		String textoEnCaja = Dialogo.formatearTextoCaja(textoParaCaja);
		return Dialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.GREEN);
	}

	public static String obtenerCajaErrorSeleccionarObjeto() {
		String[] textoParaCaja = { "Debe de elegir un numero:", "1, 2 o 3" };
		String textoEnCaja = Dialogo.formatearTextoCajaPersonalizada(textoParaCaja, '=', '!');
		return Dialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.RED);
	}

	// public static String obtenerCajaR
}
