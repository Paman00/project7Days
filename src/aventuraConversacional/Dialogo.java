package aventuraConversacional;

public class Dialogo {
	/* Modelos */
	public static String modeloCajaIntroduccion(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(texto, 'u', 'v');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.PURPLE);
	}

	public static String modeloCajaProta(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCaja(texto);
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.GREEN);
	}

	public static String modeloCajaError(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(texto, '=', '!');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.RED);
	}

	public static String modeloCajaOtrosPersonajes(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(texto, '*', '*');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.CYAN);
	}

	public static String modeloCajaNarrador(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(texto, '=', '|');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.PURPLE);
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
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaErrorInicio() {
		String[] textoParaCaja = { "Error:", "¡Vaya!, parece que tiene que empezar su nombre por una letra" };
		return modeloCajaError(textoParaCaja);
	}

	public static String cajaSeleccionarObjeto(String nombre) {
		String[] textoParaCaja = { nombre + ", ",
				"vas a estar una semana fuera, 3 días de ida, uno en la luna y 3 de vuelta" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaErrorSeleccionarObjeto() {
		String[] textoParaCaja = { "Debe de elegir un numero:", "1, 2 o 3" };
		return modeloCajaError(textoParaCaja);
	}

	public static String cajaSeleccionarModoSalida() {
		String[] textoParaCaja = { "05:35", "Coges tus cosas, te metes en el coche y vas al lanzamiento" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaLanzamiento() {
		String[] textoParaCaja = { "Te preparas para el lanzamiento, antes de subir a la nave,",
				"tienes que pasar un test rápido de repaso, eres un experto 4así que no es un problema para ti" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaErrorSeleccionarModo() {
		String[] textoParaCaja = { "Debe de elegir un numero:", "1 o 2" };
		return modeloCajaError(textoParaCaja);
	}

	public static String cajaHoraLLegada01() {
		String[] textoParaCaja = { "Llegas a las 06:25 al lanzamiento" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaHoraLLegada02() {
		String[] textoParaCaja = { "Llegas a las 06:00 al lanzamiento" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaFallorespeto1() {
		String[] textoParaCaja = { "Ups, parece que aún no estás muy despierto, esa no es la respuesta correcta,",
				"venga, vuelve a intentarlo, te la sabes." };
		return modeloCajaError(textoParaCaja);
	}

	public static String cajaJefe1() {
		String[] textoParaCaja = {
				"Eso, la fuerza de la gravedad hace que se queme mucho combustible para poder salir" };
		return modeloCajaOtrosPersonajes(textoParaCaja);
	}

	public static String cajaJefe2() {
		String[] textoParaCaja = { "¿Estás bien? ¿Sabes por lo menos a dónde vas no?" };
		return modeloCajaOtrosPersonajes(textoParaCaja);
	}

	public static String cajaErrorRespeto1() {
		String[] textoParaCaja = { "Debe de elegir un numero:", "1, 2, 3, 4, 5 o 6" };
		return modeloCajaError(textoParaCaja);
	}

	public static String cajaProtaRespuestaRespeto01() {
		String[] textoParaCaja = { "...",
				"No puede ser, llevo toda la vida esperando para esto y se me ha olvidado que es lo que iba a hacer" };
		return modeloCajaProta(textoParaCaja);
	}

	public static String cajaNarrador01() {
		String[] textoParaCaja = { "...",
				"No puede ser, llevo toda la vida esperando para esto y se me ha olvidado que es lo que iba a hacer" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador02() {
		String[] textoParaCaja = { "(Ibas a responder pero de repente la respuesta se esfumó de tu mente)" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador03() {
		String[] textoParaCaja = { "(No respondes)" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaProtaRespuestaRespeto02() {
		String[] textoParaCaja = { "(Venga, eso por lo menos tengo que saberlo" };
		return modeloCajaProta(textoParaCaja);
	}

	public static String cajaErrorRespeto2() {
		String[] textoParaCaja = { "Debe de elegir un numero:", "1, 2, 3, 4, 5, 6, 7 o 8" };
		return modeloCajaError(textoParaCaja);
	}

	public static String cajaFallorespeto2() {
		String[] textoParaCaja = { "No, no vas allí señor, ¿Seguro que está todo bien?" };
		return modeloCajaError(textoParaCaja);
	}

	public static String cajaJefe3() {
		String[] textoParaCaja = { "Jajaja, Claro que sí, ya verás cómo sale todo bien" };
		return modeloCajaOtrosPersonajes(textoParaCaja);
	}

	public static String cajaJefe4(String objetoInventario, String[] inventario) {
		String[] textoParaCaja = { "Eh... señor esto no es un, " + objetoInventario + ", es un " + inventario[0] };
		return modeloCajaOtrosPersonajes(textoParaCaja);
	}

	public static String cajaJefeMuerteRespeto1() {
		String[] textoParaCaja = { "Vale, espera aquí un momento" };
		return modeloCajaOtrosPersonajes(textoParaCaja);
	}

	public static String cajaJefeMuerteRespeto2(String nombre) {
		String[] textoParaCaja = { nombre + " hemos estado hablando y creemos que va a ser mejor",
				"que hoy no subas a la nave, deberías irte a casa a descansar" };
		return modeloCajaOtrosPersonajes(textoParaCaja);
	}

	public static String cajaMuerteNarrador() {
		String[] textoParaCaja = { "(Se han ido sin ti)" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador04() {
		String[] textoParaCaja = { "Todo correcto, queda poco para subir a la nave, ¿Quieres revisar algo?" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador05(String[] inventario) {
		String[] textoParaCaja = { "Solo llevas" + inventario[0] + ", igual es poco,",
				"¿Quieres buscar algo más que llevarte?" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador06() {
		String[] textoParaCaja = { "Encuentras las llaves del coche de tu jefe y te las llevas" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador07() {
		String[] textoParaCaja = { "¿Está al 75%, quieres avisar de esto?" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador08() {
		String[] textoParaCaja = { "Ooh, ya, no lo hemos llenado del todo para que no pese más",
				" y no use tanto combustible para salir del agujero gravitational de la tierra" };
		return modeloCajaNarrador(textoParaCaja);
	}
	
	public static String cajaNarrador09() {
		String[] textoParaCaja = { "Pero si es verdad que está más bajo de lo que recordaba… Lo llenaremos hasta el 85%.", " Gracias." };
		return modeloCajaNarrador(textoParaCaja);
	}
	
	public static String cajaNarrador10(String nombre) {
		String[] textoParaCaja = { nombre + ", ¿quieres que repasemos el plan?", "Perfecto" };
		return modeloCajaNarrador(textoParaCaja);
	}
	
	public static String cajaNarrador11() {
		String[] textoParaCaja = {"Vamos a ir a explorar la luna por primera vez desde que la extraña nube de polvo la envolvió hace 2 años, desde entonces hemos perdido toda pista de qué está pasando allí, todos los rovers que hemos mandado acaban con la cámara totalmente tapada, necesitamos que alguien vaya allí en persona para ver qué está pasando y de dónde viene ese polvoS"};
		return modeloCajaNarrador(textoParaCaja);
	}
	
	public static String cajaNarrador12() {
		String[] textoParaCaja = { "El viaje de ida son 72 horas, estarás en la luna unas 12 horas, y harás otras 72 horas de vuelta. Sabemos que eres capaz." };
		return modeloCajaNarrador(textoParaCaja);
	}
	
	public static String cajaNarrador13() {
		String[] textoParaCaja = {"Hora de subir pues", "(te pones el traje, subes a la nave y te preparas para el despegue)"};
		return modeloCajaNarrador(textoParaCaja);
	}
	
	public static String cajaNarrador14() {
		String[] textoParaCaja = {"Ya son las 7am, la ventana de lanzamiento abre a las 7:30am", "¿Qué vas a hacer mientras esperas?"};
		return modeloCajaNarrador(textoParaCaja);
	}
}
