package aventuraConversacional;

public class Dialogo {

	public static String cajaIntroduccion() {
		String[] textoParaCaja = { "¡Hola jugador!",
				"en esta aventura usted llevará a caba una misión en el espacio mientras se enfrenta a numerosas dificultades" };
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(textoParaCaja, 'u', 'v');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.PURPLE);
	}

	public static String cajaInicio() {
		String[] textoParaCaja = { "Año 2026",
				"Hoy por fin es el día de la misión, el ser humano no pisa la luna desde el 72" };
		String textoEnCaja = FuncionesDialogo.formatearTextoCaja(textoParaCaja);
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.GREEN);
	}

	public static String cajaErrorInicio() {
		String[] textoParaCaja = { "Error:", "¡Vaya!, parece que tiene que empezar su nombre por una letra" };
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(textoParaCaja, '=', '!');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.RED);
	}

	public static String cajaSeleccionarObjeto(String nombre) {
		String[] textoParaCaja = { nombre + ", ",
				"vas a estar una semana fuera, 3 días de ida, uno en la luna y 3 de vuelta" };
		String textoEnCaja = FuncionesDialogo.formatearTextoCaja(textoParaCaja);
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.GREEN);
	}

	public static String cajaErrorSeleccionarObjeto() {
		String[] textoParaCaja = { "Debe de elegir un numero:", "1, 2 o 3" };
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(textoParaCaja, '=', '!');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.RED);
	}
	
	public static String cajaSeleccionarModoSalida() {
		String[] textoParaCaja = {"05:35","Coges tus cosas, te metes en el coche y vas al lanzamiento"};
		String textoEnCaja = FuncionesDialogo.formatearTextoCaja(textoParaCaja);
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.GREEN);
	}

	// public static String obtenerCajaR
}
