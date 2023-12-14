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

	public static String modeloCajaFinales(String[] texto) {
		String textoEnCaja = FuncionesDialogo.formatearTextoCajaPersonalizada(texto, '=', '|');
		return FuncionesDialogo.agregarColor(textoEnCaja, Recursos.BLACK_BACKGROUND + Recursos.YELLOW);
	}

	/* Cajas de texto de Inicio */

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

	/* Cajas de texto de Error */

	public static String cajaErrorInicio() {
		String[] textoParaCaja = { "Error:", "¡Vaya!, parece que tiene que empezar su nombre por una letra" };
		return modeloCajaError(textoParaCaja);
	}

	public static String cajaErrorSeleccionarObjeto() {
		String[] textoParaCaja = { "Debe de elegir un numero:", "1, 2 o 3" };
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

	public static String cajaErrorRespeto2() {
		String[] textoParaCaja = { "Debe de elegir un numero:", "1, 2, 3, 4, 5, 6, 7 o 8" };
		return modeloCajaError(textoParaCaja);
	}

	public static String cajaFallorespeto2() {
		String[] textoParaCaja = { "No, no vas allí señor, ¿Seguro que está todo bien?" };
		return modeloCajaError(textoParaCaja);
	}

	public static String cajaError2() {
		String[] textoParaCaja = { "Debe de elegir un numero:", "1, 2, 3 o 4" };
		return modeloCajaError(textoParaCaja);
	}

	public static String cajaError3() {
		String[] textoParaCaja = { "Debe de elegir un numero:", "1 o 2" };
		return modeloCajaError(textoParaCaja);
	}

	/* Cajas de texto del Narrador */

	public static String cajaSeleccionarObjeto(String nombre) {
		String[] textoParaCaja = { nombre + ", ",
				"vas a estar una semana fuera, 3 días de ida, uno en la luna y 3 de vuelta" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaSeleccionarModoSalida() {
		String[] textoParaCaja = { "05:35", "Coges tus cosas, te metes en el coche y vas al lanzamiento" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaLanzamiento() {
		String[] textoParaCaja = { "Te preparas para el lanzamiento, antes de subir a la nave,",
				"tienes que pasar un test rápido de repaso, eres un experto así que no es un problema para ti" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaHoraLLegada01() {
		String[] textoParaCaja = { "Llegas a las 06:00 al lanzamiento" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaHoraLLegada02() {
		String[] textoParaCaja = { "Llegas a las 06:25 al lanzamiento" };
		return modeloCajaNarrador(textoParaCaja);
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
		String[] textoParaCaja = {
				"Pero si es verdad que está más bajo de lo que recordaba… Lo llenaremos hasta el 85%.", " Gracias." };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador10(String nombre) {
		String[] textoParaCaja = { nombre + ", ¿quieres que repasemos el plan?", "Perfecto" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador11() {
		String[] textoParaCaja = {
				"Vamos a ir a explorar la luna por primera vez desde que la extraña nube de polvo la envolvió hace 2 años, desde entonces hemos perdido toda pista de qué está pasando allí, todos los rovers que hemos mandado acaban con la cámara totalmente tapada, necesitamos que alguien vaya allí en persona para ver qué está pasando y de dónde viene ese polvoS" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador12() {
		String[] textoParaCaja = {
				"El viaje de ida son 72 horas, estarás en la luna unas 12 horas, y harás otras 72 horas de vuelta. Sabemos que eres capaz." };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador13() {
		String[] textoParaCaja = { "Hora de subir pues",
				"(te pones el traje, subes a la nave y te preparas para el despegue)" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador14() {
		String[] textoParaCaja = { "Ya son las 7am, la ventana de lanzamiento abre a las 7:30am",
				"¿Qué vas a hacer mientras esperas?" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador15() {
		String[] textoParaCaja = {
				"Miras por la ventana aburrido, pasan 5 minutos cuando de repente ves a un dragón bajar del cielo mientras escupe fuego, te quedas mirando cómo se pelea con más dragones y entretienes hasta que pasa la media hora, te quedas ligeramente preocupado de que lleves sólo media hora sólo y ya te estás imaginando cosas raras para distraerte" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador16() {
		String[] textoParaCaja = { "Es una idea terrible, pero te da bastante igual" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador17() {
		String[] textoParaCaja = {
				"Te duermes y sueñas con la nave explotando en el espacio, de repente, un sonido fuerte te despierta" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador18() {
		String[] textoParaCaja = {
				"Estás un rato largo sin hacer nada, miras el reloj y ves que sólo han pasado 3 minutos, vuelves a mirar el reloj, han pasado 4 minutos, cómo no haga algo pronto sientes que te vas a volver loco." };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador19() {
		String[] textoParaCaja = {
				"Empiezas a pensar en todo lo que podría salir mal en el viaje y en cómo no quieres morir, si hay un momento para marcharse, es ahora" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador20() {
		String[] textoParaCaja = { "Sales de la nave y dices que no estás preparado, te vas a casa" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador21(String nombre) {
		String[] textoParaCaja = { nombre + "Saca valor y decide continuar" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador22() {
		String[] textoParaCaja = { "Te entretienes un rato y distraes la mente, de repente, suena un anuncio" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador23() {
		String[] textoParaCaja = {
				"Después de un despegue exitoso estás en el espacio sólo, la verdad es que más tranquilo, ahora tienes que esperar 3 días hasta llegar all" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador24() {
		String[] textoParaCaja = {
				"Tendrás que elegir cómo usar esos días y prepararte para la investagión en la Luna" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador25() {
		String[] textoParaCaja = { "60%, ha sido un buen despegue" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador26() {
		String[] textoParaCaja = { "2 días y 20 horas, queda un rato aún" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador27() {
		String[] textoParaCaja = {
				"Estudias algunos libros que hay en la nave, antes de llegar a la Luna, te sientes un experto en cocina.",
				"Tampoco hay ninguna cocina para comprobarlo pero no te hace falta" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador28() {
		String[] textoParaCaja = {
				"Muy productivamente te pasas tres días jugando juegos de móvil, duermes bastante poco",
				"como nunca es de noche en el espacio, se te olvida" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador29() {
		String[] textoParaCaja = { "[Legada a la Luna]" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador30() {
		String[] textoParaCaja = {
				"Desde hace unas horas llevas viendo como la luna se acercaba, te preparas y te pones el traje espacial" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador31() {
		String[] textoParaCaja = { "Sales de la nave y miras a tu alrededor", "¿Qué haces?" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador32() {
		String[] textoParaCaja = {
				"Te quedas todo el tiempo allí sentado sin hacer nada, cuando ya ha sido suficiente,",
				"te vuelves a la nave, Luna explorada supongo." };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador33() {
		String[] textoParaCaja = { "Te adentras en la nube de polvo de la Luna y caminas un rato" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador34() {
		String[] textoParaCaja = {
				"Te estás empezando a aburrir de la Luna cuando de repente ves una sombra a lo lejos " };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador35() {
		String[] textoParaCaja = { "Al acercarte ves la sombra más nítida" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador36() {
		String[] textoParaCaja = { "Un poder desconocido te impide darte la vuleta",
				"La sombra se acerca más y se vuelve más nítida" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador37() {
		String[] textoParaCaja = { "Te acercas lo suficiente como para ver lo que parece ser un alien" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador38() {
		String[] textoParaCaja = {
				"No puedes alejarte debido a un poder misterioso, mientras la sombra se acerca lo suficiente como para distinguir una figura que parece ser un alien" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador39() {
		String[] textoParaCaja = {
				"Lo que parece ser un alien comienza a hacer ruidos irreconocibles para ti mientras se acerca más" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador40() {
		String[] textoParaCaja = { "Le das con el destornillador y le quitas 50HP de un golpe", "Alien derrotado" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador41() {
		String[] textoParaCaja = { "El alien se lo come, su vida sube en 10HP" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador42() {
		String[] textoParaCaja = { "Atacas al Alien" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador43() {
		String[] textoParaCaja = { "El alien consigue defenderse por lo que tu daño se ve reducido." };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador44(int vidaAlien) {
		String[] textoParaCaja = { "La vida del alien se ve reducida a" + vidaAlien };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador45() {
		String[] textoParaCaja = { "El alien consigue atacarte" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador46() {
		String[] textoParaCaja = { "Consigues defenderte del alien por lo que el daño se ve reducido" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador47(int vidaProta) {
		String[] textoParaCaja = { "Tu vida se ve reducida a" + vidaProta };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador48() {
		String[] textoParaCaja = { "Intentas hablar con el alien pero es inútil" };
		return modeloCajaNarrador(textoParaCaja);
	}

	public static String cajaNarrador49() {
		String[] textoParaCaja = { "El alien te asiesta un golpe" };
		return modeloCajaNarrador(textoParaCaja);
	}

	/* Cajas de texto del Protagonista */

	public static String cajaProtaRespuestaRespeto01() {
		String[] textoParaCaja = { "...",
				"No puede ser, llevo toda la vida esperando para esto y se me ha olvidado que es lo que iba a hacer" };
		return modeloCajaProta(textoParaCaja);
	}

	public static String cajaProtaRespuestaRespeto02() {
		String[] textoParaCaja = { "(Venga, eso por lo menos tengo que saberlo" };
		return modeloCajaProta(textoParaCaja);
	}

	/* Cajas de texto de Otros Personajes */

	public static String cajaJefe1() {
		String[] textoParaCaja = {
				"Eso, la fuerza de la gravedad hace que se queme mucho combustible para poder salir" };
		return modeloCajaOtrosPersonajes(textoParaCaja);
	}

	public static String cajaJefe2() {
		String[] textoParaCaja = { "¿Estás bien? ¿Sabes por lo menos a dónde vas no?" };
		return modeloCajaOtrosPersonajes(textoParaCaja);
	}

	public static String cajaJefe3() {
		String[] textoParaCaja = { "Jajaja, Claro que sí, ya verás cómo sale todo bien" };
		return modeloCajaOtrosPersonajes(textoParaCaja);
	}

	public static String cajaJefe4(String objetoInventario, String[] inventario) {
		String[] textoParaCaja = { "Eh... señor esto no es un, " + objetoInventario + ", es un " + inventario[0] };
		return modeloCajaOtrosPersonajes(textoParaCaja);
	}

	public static String cajaOtroPersonaje1() {
		String[] textoParaCaja = { "VOZ: Quedan 3 minutos para el despegue." };
		return modeloCajaOtrosPersonajes(textoParaCaja);
	}

	/* Cajas de texto de Final */

	public static String cajaJefeMuerteRespeto1() {
		String[] textoParaCaja = { "Vale, espera aquí un momento" };
		return modeloCajaFinales(textoParaCaja);
	}

	public static String cajaJefeMuerteRespeto2(String nombre) {
		String[] textoParaCaja = { nombre + " hemos estado hablando y creemos que va a ser mejor",
				"que hoy no subas a la nave, deberías irte a casa a descansar" };
		return modeloCajaFinales(textoParaCaja);
	}

	public static String cajaMuerteNarrador() {
		String[] textoParaCaja = { "(Se han ido sin ti)" };
		return modeloCajaFinales(textoParaCaja);
	}

	public static String cajaFinal2_1() {
		String[] textoParaCaja = {
				"Vuelves a la tierra y comunicas que todo en la Luna está correcto, nada interesante" };
		return modeloCajaFinales(textoParaCaja);
	}

	public static String cajaFinal2_2() {
		String[] textoParaCaja = { "A la gente le parece una respuesta aburrida pero entienden que así son las cosas,",
				"te recuerdan como un astronauta mediocre y poco más, te da para vivir" };
		return modeloCajaFinales(textoParaCaja);
	}

	public static String cajaFinal3_1() {
		String[] textoParaCaja = { "El alien ha podido contigo" };
		return modeloCajaFinales(textoParaCaja);
	}

	public static String cajaFinal3_2() {
		String[] textoParaCaja = { "Parece ser que atacar al alien no fue la mejor idea",
				"Mejor suerte la proxima vez" };
		return modeloCajaFinales(textoParaCaja);
	}

	public static String cajaFinal4_5() {
		String[] textoParaCaja = { "No sabes como pero acabas de matar al alien" };
		return modeloCajaFinales(textoParaCaja);
	}

	public static String cajaFinal4() {
		String[] textoParaCaja = {
				"Vuelves a la tierra, cuando la gente te pide que informes lo que ha pasado les cuentas tu pelea con el alien y te toman por loco, en futuras misiones, otros astronautas van a la Luna y ninguno ve lo que dijiste, definitivamente estás loco y así te recordarán siempre." };
		return modeloCajaFinales(textoParaCaja);
	}

	public static String cajaFinal5_1() {
		String[] textoParaCaja = {
				"Llevas al Alien a la tierra y todos alucinan, es el mayor descubrimiento de la historia, se te recuerda como una de las personas más importantes del mundo " };
		return modeloCajaFinales(textoParaCaja);
	}

	public static String cajaFinal5_2() {
		String[] textoParaCaja = {
				"Unos años después los aliens salen de la luna y declaran la guerra a los humanos, culpa tuya supongo" };
		return modeloCajaFinales(textoParaCaja);
	}

	public static String cajaFinal6() {
		String[] textoParaCaja = {
				"El Alien toma tu regalo como un claro símbolo de paz y de hecho se sube a tu nave, te lo llevas de vuelta a la tierra y se lo presentas a todo el mundo, los Aliens Lunares se vuelven amigos de la humanidad. Todo el mundo te recuerda como el mejor astronauta de la historia" };
		return modeloCajaFinales(textoParaCaja);
	}

	public static String cajaFinal7_1() {
		String[] textoParaCaja = {
				"El Alien coge las llaves, al tocarlas este desaparece, sin saber que hacer vuelves a la tierra, cuando la gente te pide que informes  lo que ha pasado les cuentas tu pelea con el alien y te toman por loco." };
		return modeloCajaFinales(textoParaCaja);
	}

	public static String cajaFinal7_2() {
		String[] textoParaCaja = {
				"Poco después te informan de que tu jefe lleva 3 días desaparecido, pero la verdad es que te da un poco igual. Eres recordado cómo el astronauta loco." };
		return modeloCajaFinales(textoParaCaja);
	}

}
