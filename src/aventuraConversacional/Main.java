package aventuraConversacional;

import java.util.Scanner;

import static aventuraConversacional.FuncionesDialogo.centrarLinea;
import static aventuraConversacional.FuncionesDialogo.centrarTexto;
import static aventuraConversacional.FuncionesDialogo.agregarColor;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	/**
	 * Realiza un ataque al alien y en base a una probabilidad este se defiende y
	 * ataca devuelta
	 * 
	 * @param vidaProta    Numero entero correspondiente a la vida del Prota
	 * @param vidaAlien    Numero entero correspondiente a la vida del alien
	 * @param ataqueProta  Numero entero correspondiente a el ataque del Prota
	 * @param ataqueAlien  Numero entero correspondiente a el ataque del Alien
	 * @param defensaProta Numero entero correspondiente a la defensa del Prota
	 * @param defensaAlien Numero entero correspondiente a la defensa del alien
	 * @return resultado Vida restante del Prota y del Alien
	 */
	public static int[] realizarAtaque(int vidaProta, int ataqueProta, int defensaProta, int vidaAlien, int ataqueAlien,
			int defensaAlien) {

		System.out.println(Dialogo.cajaNarrador42());

		int probabilidadDefensaAlien = (int) (Math.random() * 4 + 1);

		if (probabilidadDefensaAlien == 1) {
			System.out.println(Dialogo.cajaNarrador43());
			vidaAlien = vidaAlien - (ataqueProta - defensaAlien);
		} else {
			vidaAlien = vidaAlien - ataqueProta;
		}

		System.out.println(Dialogo.cajaNarrador44(vidaAlien));

		// Añadimos la posibilidad de que el alien ataque

		int probabilidadAtaqueAlien = (int) (Math.random() * 5 + 1);

		if (probabilidadAtaqueAlien == 1) {

			System.out.println(Dialogo.cajaNarrador45());

			int probabilidadDefensaProta = (int) (Math.random() * 4 + 1);

			if (probabilidadDefensaProta == 1) {
				System.out.println(Dialogo.cajaNarrador46());
				vidaProta = vidaProta - (ataqueAlien - defensaProta);
			} else {
				vidaProta = vidaProta - ataqueAlien;
			}

			System.out.println(Dialogo.cajaNarrador47(vidaProta));
		}

		// Devolvemos las vidas actualizadas en un array
		return new int[] { vidaProta, vidaAlien };
	}

	/**
	 * El Prota intenta hablar con el alien sindo esto inutil y el alien le ataca y
	 * con una probabilidad el Prota se puede defender
	 * 
	 * @param vidaProta    Numero entero correspondiente a la vida del Prota
	 * @param vidaAlien    Numero entero correspondiente a la vida del alien
	 * @param ataqueProta  Numero entero correspondiente a el ataque del Prota
	 * @param ataqueAlien  Numero entero correspondiente a el ataque del Alien
	 * @param defensaProta Numero entero correspondiente a la defensa del Prota
	 * @param defensaAlien Numero entero correspondiente a la defensa del alien
	 * @return resultado Vida restante del Prota
	 */
	public static int[] hablar(int vidaProta, int ataqueProta, int defensaProta, int vidaAlien, int ataqueAlien,
			int defensaAlien) {

		System.out.println(Dialogo.cajaNarrador48());
		System.out.println(Dialogo.cajaNarrador49());

		int probabilidadDefensaProta = (int) (Math.random() * 4 + 1);

		if (probabilidadDefensaProta == 1) {
			System.out.println(Dialogo.cajaNarrador46());
			vidaProta = vidaProta - (ataqueAlien - defensaProta);
		} else {
			vidaProta = vidaProta - ataqueAlien;
		}

		// Devolvemos las vidas actualizadas en un array
		return new int[] { vidaProta };

	}

	/**
	 * El Prota intenta huir del alien sindo esto inutil y el alien le ataca y con
	 * una probabilidad el Prota se puede defender
	 * 
	 * @param vidaProta    Numero entero correspondiente a la vida del Prota
	 * @param vidaAlien    Numero entero correspondiente a la vida del alien
	 * @param ataqueProta  Numero entero correspondiente a el ataque del Prota
	 * @param ataqueAlien  Numero entero correspondiente a el ataque del Alien
	 * @param defensaProta Numero entero correspondiente a la defensa del Prota
	 * @param defensaAlien Numero entero correspondiente a la defensa del alien
	 * @return resultado Vida restante del Prota
	 */
	public static int[] huir(String nombre, int vidaProta, int ataqueProta, int defensaProta, int vidaAlien,
			int ataqueAlien, int defensaAlien) {

		System.out.println(Dialogo.cajaNarrador48());
		System.out.println(Dialogo.cajaNarrador49());

		int probabilidadDefensaProta = (int) (Math.random() * 4 + 1);
		System.out.println(Dialogo.cajaNarrador46());
		if (probabilidadDefensaProta == 1) {

			vidaProta = vidaProta - (ataqueAlien - defensaProta);
		} else {
			vidaProta = vidaProta - ataqueAlien;
		}

		// Devolvemos las vidas actualizadas en un array
		return new int[] { vidaProta, vidaAlien };

	}

	public static void main(String[] args) {

		// Damos la introducción al usuario y esperamos a que presione START
		System.out.println(Dialogo.cajaIntroduccion());
		System.out.println(centrarLinea("Presione START para iniciar"));
		sc.nextLine();
		String finalDeLaPartida = aventura();

		// Texto Fin de la partida 1
		if (finalDeLaPartida.equals("perdido1")) {
			System.out.println(centrarLinea("Presione START para continuar"));
			sc.nextLine();
			System.out.println(Dialogo.cajaJefeMuerteRespeto1());
			// System.out.println(Dialogo.cajaJefeMuerteRespeto2());
			System.out.println(Recursos.despegue);
			System.out.println(Dialogo.cajaMuerteNarrador());
			System.out.println(centrarLinea("Presione START para continuar"));
			sc.nextLine();
			System.out.println(Recursos.gameOver);

			// Texto Fin de la partida 2
		} else if (finalDeLaPartida.equals("perdido2")) {
			System.out.println(Dialogo.cajaFinal2_1());
			System.out.println(Dialogo.cajaFinal2_2());
			System.out.println(centrarLinea("Presione START para continuar"));
			sc.nextLine();
			System.out.println(Recursos.gameOver);
			
			// Texto Fin de la partida 3
		} else if (finalDeLaPartida.equals("perdido3")) {
			System.out.println(centrarLinea("Presione START para continuar"));
			sc.nextLine();
			System.out.println(Dialogo.cajaFinal3_1());
			System.out.println(Dialogo.cajaFinal3_2());
			System.out.println(centrarLinea("Presione START para continuar"));
			sc.nextLine();
			System.out.println(Recursos.gameOver);

			// Texto Fin de la partida 4
		} else if (finalDeLaPartida.equals("perdido4")) {
			System.out.println(Dialogo.cajaFinal4());
			System.out.println(Recursos.finDelJuego);

			// Texto Fin de la partida 5
		} else if (finalDeLaPartida.equals("perdido5")) {
			System.out.println(centrarLinea("Presione START para continuar"));
			sc.nextLine();
			System.out.println(Dialogo.cajaFinal5_1());
			System.out.println(Dialogo.cajaFinal5_2());
			System.out.println(centrarLinea("Presione START para continuar"));
			sc.nextLine();
			System.out.println(Recursos.finDelJuego);

			// Texto Fin de la partida 6
		} else if (finalDeLaPartida.equals("perdido6")) {
			System.out.println(centrarLinea("Presione START para continuar"));
			sc.nextLine();
			System.out.println(Dialogo.cajaFinal6());
			System.out.println(centrarLinea("Presione START para continuar"));
			sc.nextLine();
			System.out.println(Recursos.finDelJuego);
			// Texto Fin de la partida 7
		} else if (finalDeLaPartida.equals("perdido7")) {
			System.out.println(centrarLinea("Presione START para continuar"));
			sc.nextLine();
			System.out.println(Dialogo.cajaFinal7_1());
			System.out.println(Dialogo.cajaFinal7_2());
			System.out.println(centrarLinea("Presione START para continuar"));
			sc.nextLine();
			System.out.println(Recursos.finDelJuego);
		}
	}

	public static String aventura() {

		// Declaramos las variables que vamos a usar
		String nombre;
		int opcion;
		String[] inventario = new String[5];
		int respeto = 5;
		int contadorFallo = 0;
		String objetoInventario = null;
		boolean objetoEncontrado = false;
		int inteligencia = 0;
		int cansancio = 0;
		int contadorEspera = 0;

		int vidaProta = 35;
		int ataqueProta = 10;
		int defensaProta = 3;

		int vidaAlien = 30;
		int ataqueAlien = 8;
		int defensaAlien = 5;

		int vidas[] = { vidaProta, vidaAlien };

		// Pedimos el nombre al usuario
		System.out.println(Recursos.casco);
		System.out.println(Dialogo.cajaInicio());
		System.out.println(centrarLinea("Irá su astronauta solo, ¿Cuál es su nombre?: "));
		nombre = sc.nextLine();
		// Si el usuario no ingreso nada, o el primer caracter del nombre no es una
		// letra, vuelve a pedirlo hasta que el dato sea correcto
		while (nombre.isEmpty() || !Character.isLetter(nombre.charAt(0))) {
			System.out.println(Dialogo.cajaErrorInicio());
			System.out.println(centrarLinea("Irá su astronauta solo, ¿Cuál es su nombre?: "));
			nombre = sc.nextLine();
		}

		// Enseñamos la caja antes de pedir el objeto, y esperamos a que el usuario
		// presione START
		System.out.println(Dialogo.cajaSeleccionarObjeto(nombre));
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		// Damos cada uno de los objeto con un número, esperamos a que el usuario
		// presione START entre cada uno
		System.out.println(centrarLinea("Selecciona una de las herramientas que se presentara a continuación:"));
		System.out.println("1. Bola de Nieve de Cristal");
		System.out.println(Recursos.bola);
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		System.out.println("2. Destornillador");
		System.out.println(Recursos.destornillador);
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		System.out.println("3.Pájaro de Madera");
		System.out.println(Recursos.pajaro);
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		// Le pedimos al usuario que objeto desea
		System.out.println(centrarLinea("Ingrese 1, 2 o 3 para elegir un arma"));
		opcion = sc.nextInt();
		// Si el usuario ingresa un numero que no corresponde al objeto, volver a
		// pedirlo
		while (opcion != 1 && opcion != 2 && opcion != 3) {
			System.out.println(Dialogo.cajaErrorSeleccionarObjeto());
			System.out.println(centrarLinea("Ingrese 1, 2 o 3 para elegir un arma"));
			opcion = sc.nextInt();
		}
		// Según la opción, asignara a objeto la elección elegida

		switch (opcion) {
		case 1:
			inventario[0] = "Bola de Nieve de Cristal";
			break;
		case 2:
			inventario[0] = "Destornillador";
			break;
		case 3:
			inventario[0] = "Pájaro de Madera";
			break;
		}

		System.out.println(centrarLinea("Muy bien!, ha seleccionado " + inventario[0]));

		// Enseñamos la caja antes de pedir la opcion, y esperamos a que el usuario
		// presione START
		System.out.println(Dialogo.cajaSeleccionarModoSalida());
		System.out.println(Recursos.coche);
		System.out.println(centrarLinea("¿Cómo vas a ir?"));
		System.out.println("1. Con prisa");
		System.out.println("2. Tranquilamente");

		// Le pedimos al usuario que objeto desea
		System.out.println(centrarLinea("Ingrese 1 o 2 para elegir como quiere ir"));
		opcion = sc.nextInt();

		// Si el usuario ingresa un numero que no corresponde al objeto, volver a
		// pedirlo
		while (opcion != 1 && opcion != 2) {
			System.out.println(Dialogo.cajaError3());
			System.out.println(centrarLinea("Ingrese 1 o 2 para elegir un arma"));
			opcion = sc.nextInt();
		}

		// Reset de Buffer por error
		resetBuffer();

		if (opcion == 1) {
			System.out.println(Dialogo.cajaHoraLLegada01());
		} else if (opcion == 2) {
			System.out.println(Dialogo.cajaHoraLLegada02());
		}

		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(Recursos.naveAntesDeDespegar);
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(Dialogo.cajaLanzamiento());
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		do {
			System.out
					.println(agregarColor(centrarLinea("\n¿En qué parte se gasta más combustible?"), Recursos.PURPLE));
			System.out.println("1. En la salida de la atmósfera de la Tierra");
			System.out.println("2. En el espacio");
			System.out.println("3. En el aterrizaje en la Luna ");
			System.out.println("4. En la salida de la atmósfera de la Luna");
			System.out.println("5. En el aterrizaje en la Tierra");
			System.out.println(centrarLinea("Ingrese 1, 2, 3, 4, 5 para elegir una respuesta"));
			opcion = sc.nextInt();

			if (opcion == 2) {
				System.out.println(Dialogo.cajaFallorespeto1());
				contadorFallo++;
				if (contadorFallo == 1) {
					respeto--;
				}
				contadorFallo = 0;
			} else if (opcion == 3) {
				System.out.println(Dialogo.cajaFallorespeto1());
				contadorFallo++;
				if (contadorFallo == 1) {
					respeto--;
				}
				contadorFallo = 0;
			} else if (opcion == 4) {
				System.out.println(Dialogo.cajaFallorespeto1());
				contadorFallo++;
				if (contadorFallo == 1) {
					respeto--;
				}
				contadorFallo = 0;
			} else if (opcion == 5) {
				System.out.println(Dialogo.cajaFallorespeto1());
				contadorFallo++;
				if (contadorFallo == 1) {
					respeto--;
				}
				contadorFallo = 0;
			} else if (opcion < 1 || opcion > 5) {
				System.out.println(Dialogo.cajaErrorRespeto1());
			}

		} while (opcion != 1);

		System.out.println("El respeto es de " + respeto);

		// Si el respeto llega a 0, se acaba la partida y retorna el texto clave
		if (respeto <= 0) {
			return "perdido1";
		}

		System.out.println("El respeto es de " + respeto);

		System.out.println(Dialogo.cajaJefe1());

		// Reiniciamos el valor de la variable usada para escoger las opciones
		contadorFallo = 0;

		System.out.println(agregarColor(centrarLinea("\n¿Llevas algún objeto que declarar?"), Recursos.PURPLE));
		System.out.println("1. Bola de Nieve de Cristal");
		System.out.println("2. Destornillador");
		System.out.println("3. Pájaro de Madera");
		System.out.println("4. No");
		System.out.println(centrarLinea("Ingrese 1, 2 o 3 para elegir un arma"));
		opcion = sc.nextInt();

		while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4) {
			System.out.println(Dialogo.cajaError2());
			System.out.println(centrarLinea("Ingrese 1 o 2 para elegir un arma"));
			opcion = sc.nextInt();
		}

		if (opcion == 1) {
			objetoInventario = "Bola de Nieve de Cristal";
		} else if (opcion == 2) {
			objetoInventario = "Destornillador";
		} else if (opcion == 3) {
			objetoInventario = "Pájaro de Madera";
		} else if (opcion == 4) {
			objetoInventario = "No";
		}

		for (int i = 0; i < inventario.length; i++) {
			if (objetoInventario.equals(inventario[i])) {
				objetoEncontrado = true;
				System.out.println(agregarColor(centrarLinea("\nRevisan tu equipaje"), Recursos.PURPLE));
				System.out.println(agregarColor(centrarLinea("\nEfectivamente, un " + inventario[0] + " todo correcto"),
						Recursos.CYAN));
				i = inventario.length; // Si encuentra el objeto, sale del bucle
			}
		}
		if (!objetoEncontrado) {
			System.out.println(agregarColor(centrarLinea("\nRevisan tu equipaje"), Recursos.PURPLE));
			System.out.println(Dialogo.cajaJefe4(objetoInventario, inventario));

			respeto--;
		}

		System.out.println("El respeto es de " + respeto);

		System.out.println(agregarColor(centrarLinea("\nProxima pregunta, ¿por qué estamos haciendo esta misión?"),
				Recursos.PURPLE));
		System.out.println(Dialogo.cajaNarrador02());
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		System.out.println(Dialogo.cajaProtaRespuestaRespeto01());
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		System.out.println(Dialogo.cajaNarrador03());
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		System.out.println(Dialogo.cajaJefe2());
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		System.out.println(Dialogo.cajaProtaRespuestaRespeto02());

		// Reiniciamos el valor de la variable usada para escoger las opciones
		contadorFallo = 0;

		do {

			System.out.println("\n1. Marte");
			System.out.println("2. Saturno");
			System.out.println("3. Urano");
			System.out.println("4. La Luna");
			System.out.println("5. Plutón");
			System.out.println("6. El sol");
			System.out.println("7. Bogotá");
			System.out.println("8. Ferrol");
			System.out.println(centrarLinea("\nIngrese 1, 2, 3, 4, 5, 6, 7 o 8 para elegir una ubicación"));
			opcion = sc.nextInt();

			if (opcion == 1) {
				System.out.println(Dialogo.cajaFallorespeto2());
				contadorFallo++;
				if (contadorFallo == 1) {
					respeto--;
				}
				contadorFallo = 0;
			} else if (opcion == 2) {
				System.out.println(Dialogo.cajaFallorespeto2());
				contadorFallo++;
				if (contadorFallo == 1) {
					respeto--;
				}
				contadorFallo = 0;
			} else if (opcion == 3) {
				System.out.println(Dialogo.cajaFallorespeto2());
				contadorFallo++;
				if (contadorFallo == 1) {
					respeto--;
				}
				contadorFallo = 0;
			} else if (opcion == 5) {
				System.out.println(Dialogo.cajaFallorespeto2());
				contadorFallo++;
				if (contadorFallo == 1) {
					respeto--;
				}
				contadorFallo = 0;
			} else if (opcion == 6) {
				System.out.println(Dialogo.cajaFallorespeto2());
				contadorFallo++;
				if (contadorFallo == 1) {
					respeto--;
				}
				contadorFallo = 0;
			} else if (opcion == 7) {
				System.out.println(Dialogo.cajaFallorespeto2());
				contadorFallo++;
				if (contadorFallo == 1) {
					respeto--;
				}
				contadorFallo = 0;
			} else if (opcion == 8) {
				System.out.println(Dialogo.cajaFallorespeto2());
				opcion = sc.nextInt();
				contadorFallo++;
				if (contadorFallo == 1) {
					respeto--;
				}
				contadorFallo = 0;
			} else if (opcion < 1 || opcion > 8) {
				System.out.println(Dialogo.cajaErrorRespeto2());
			}

		} while (opcion != 4);

		System.out.println(Dialogo.cajaJefe3());

		System.out.println("El respeto es de " + respeto);

		if (respeto <= 0) {
			return "perdido1";
		}

		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(Dialogo.cajaNarrador04());

		do {
			System.out.println("\n1. Revisar inventario");
			System.out.println("2. Revisar combustible");
			System.out.println("3. Revisar el plan con tu jefe");
			System.out.println("4. No");
			System.out.println(centrarLinea("Ingrese 1, 2, 3 o 4 para elegir una opción"));
			opcion = sc.nextInt();

			if (opcion == 1) {
				opcion = 0;
				System.out.println(Dialogo.cajaNarrador05(inventario));
				System.out.println("1. Si");
				System.out.println("2. No");
				opcion = sc.nextInt();
				if (opcion == 1) {
					System.out.println(Dialogo.cajaNarrador06());
					System.out.println(Recursos.llaves);
					inventario[1] = "llaves";
				}
			} else if (opcion == 2) {
				opcion = 0;
				System.out.println(Dialogo.cajaNarrador07());
				System.out.println("1. Si");
				System.out.println("2. No");
				opcion = sc.nextInt();
				if (opcion == 1) {
					System.out.println(Dialogo.cajaNarrador08());
					System.out.println(centrarLinea("Presione START para continuar"));
					sc.nextLine();
					System.out.println(Dialogo.cajaNarrador09());
				}
			} else if (opcion == 3) {
				System.out.println(Dialogo.cajaNarrador10(nombre));
				System.out.println(centrarLinea("Presione START para continuar"));
				sc.nextLine();
				System.out.println(Dialogo.cajaNarrador11());
				System.out.println(centrarLinea("Presione START para continuar"));
				sc.nextLine();
				System.out.println(Dialogo.cajaNarrador12());

			} else if (opcion < 1 || opcion > 4) {
				System.out.println(Dialogo.cajaError2());
			}

		} while (opcion != 4);

		System.out.println(Dialogo.cajaNarrador13());
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		System.out.println(Dialogo.cajaNarrador14());

		System.out.println("\n1. Mirar por la ventana");
		System.out.println("2. Echarte una siesta");
		System.out.println("3. Nada");
		System.out.println(centrarLinea("Ingrese 1, 2 o 3 para elegir una opción"));
		opcion = sc.nextInt();

		while (opcion != 1 && opcion != 2 && opcion != 3) {
			System.out.println(Dialogo.cajaErrorSeleccionarObjeto());
			System.out.println(centrarLinea("Ingrese 1, 2 o 3 para elegir un arma"));
			opcion = sc.nextInt();
		}

		if (opcion == 1) {
			System.out.println(Dialogo.cajaNarrador15());
			System.out.println(Recursos.dragon);
		} else if (opcion == 2) {
			System.out.println(Dialogo.cajaNarrador16());
			System.out.println(centrarLinea("Presione START para continuar"));
			sc.nextLine();
			System.out.println(Dialogo.cajaNarrador17());
		} else if (opcion == 3) {

			System.out.println(Dialogo.cajaNarrador18());
			System.out.println("\n1. Seguir sin hacer nada");
			System.out.println("2. Jugar con " + inventario[0]);
			System.out.println(centrarLinea("Ingrese 1 o 2 para elegir una opción"));
			opcion = sc.nextInt();

			while (opcion != 1 && opcion != 2) {
				System.out.println(Dialogo.cajaError3());
				System.out.println(centrarLinea("Ingrese 1 o 2 para elegir un arma"));
				opcion = sc.nextInt();
			}

			if (opcion == 1) {

				System.out.println(Dialogo.cajaNarrador19());
				System.out.println("\n1. Rendirse");
				System.out.println("2. Continuar");
				System.out.println(centrarLinea("Ingrese 1 o 2 para elegir una opción"));
				opcion = sc.nextInt();

				while (opcion != 1 && opcion != 2) {
					System.out.println(Dialogo.cajaError3());
					System.out.println(centrarLinea("Ingrese 1 o 2 para elegir un arma"));
					opcion = sc.nextInt();
				}

				if (opcion == 1) {
					System.out.println(Dialogo.cajaNarrador20());
					return "perdido2";
				} else if (opcion == 2) {
					System.out.println(Dialogo.cajaNarrador21(nombre));
				}

			} else if (opcion == 2) {
				System.out.println(Dialogo.cajaNarrador22());
			}
		}

		System.out.println(Dialogo.cajaOtroPersonaje1());

		System.out.println(Dialogo.cajaNarrador23());
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		System.out.println(Dialogo.cajaNarrador24());

		while (opcion == 3 || opcion == 4) {

			System.out.println("\n1. Revisar conbustible");
			System.out.println("2. Revisar cuánto tiempo queda");
			System.out.println("3. Estudiar");
			System.out.println("4. Jugar juegos en el móvil");
			System.out.println(centrarLinea("Ingrese 1, 2, 3 o 4 para elegir una opción"));
			opcion = sc.nextInt();

			if (opcion == 1) {
				System.out.println(Dialogo.cajaNarrador25());
			} else if (opcion == 2) {
				System.out.println(Dialogo.cajaNarrador26());
			}

		}

		if (opcion == 3) {
			System.out.println(Dialogo.cajaNarrador27());
			inteligencia++;
			System.out.println(
					centrarLinea(agregarColor("La inteligencia de " + nombre + "aumenta en 1", Recursos.PURPLE)));
		} else if (opcion == 4) {
			System.out.println(Dialogo.cajaNarrador28());
			cansancio++;
			System.out
					.println(centrarLinea(agregarColor("El cansacio de " + nombre + "aumenta en 1", Recursos.PURPLE)));
		}

		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(Dialogo.cajaNarrador29());
		System.out.println(Dialogo.cajaNarrador30());
		System.out.println(Dialogo.cajaNarrador31());

		System.out.println("\n1. Esperar y pasar tiempo al lado de la nave");
		System.out.println("2. Dar una vuelta y explorar la Luna");
		System.out.println(centrarLinea("Ingrese 1 o 2 para elegir una opción"));
		opcion = sc.nextInt();

		while (opcion != 1 && opcion != 2) {
			System.out.println(Dialogo.cajaError3());
			System.out.println(centrarLinea("Ingrese 1 o 2 para elegir un arma"));
			opcion = sc.nextInt();
		}

		if (opcion == 1) {
			opcion = 0;
			while (opcion != 2) {
				System.out.println("\n1. Esperar y pasar tiempo al lado de la nave");
				System.out.println("2. Dar una vuelta y explorar la Luna");
				System.out.println(centrarLinea("Ingrese 1 o 2 para elegir una opción"));
				opcion = sc.nextInt();

				if (opcion == 1) {
					contadorEspera++;
					if (contadorEspera == 5) {
						System.out.println(Dialogo.cajaNarrador32());
						return "perdido2";
					}
				}
			}
		} else if (opcion == 2) {

			System.out.println("¿Qué haces?");
			System.out.println(Dialogo.cajaNarrador33()); // como 33
			System.out.println(Dialogo.cajaNarrador34());
			System.out.println(Recursos.sombra);

			System.out.println("\n1. Acercarse más");
			System.out.println("2. Media Vuelta");
			System.out.println(centrarLinea("Ingrese 1 o 2 para elegir una opción"));
			opcion = sc.nextInt();

			while (opcion != 1 && opcion != 2) {
				System.out.println(Dialogo.cajaError3());
				System.out.println(centrarLinea("Ingrese 1 o 2 para elegir un arma"));
				opcion = sc.nextInt();
			}

			if (opcion == 1) {
				System.out.println(Dialogo.cajaNarrador35());
			} else if (opcion == 2) {
				System.out.println(Dialogo.cajaNarrador36());
			}

			System.out.println(centrarLinea("Presione START para continuar"));
			sc.nextLine();
			System.out.println(Recursos.menosSombra);
		}

		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println("¿Qué haces?");
		System.out.println("\n1. Acercarse más");
		System.out.println("2. Media Vuelta");
		System.out.println(centrarLinea("Ingrese 1 o 2 para elegir una opción"));
		opcion = sc.nextInt();

		while (opcion != 1 && opcion != 2) {
			System.out.println(Dialogo.cajaError3());
			System.out.println(centrarLinea("Ingrese 1 o 2 para elegir un arma"));
			opcion = sc.nextInt();
		}

		if (opcion == 1) {
			System.out.println(Dialogo.cajaNarrador37());
		} else if (opcion == 2) {
			System.out.println(Dialogo.cajaNarrador38());
		}

		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		System.out.println(Recursos.alien);
		System.out.println(Dialogo.cajaNarrador39());

		System.out.println("¿Qué harás?");

		while (vidaProta > 0 && vidaAlien > 0) {

			System.out.println("\n1. Luchar");
			System.out.println("2. Hablar");
			System.out.println("3. Objeto");
			System.out.println("4. Huir");
			System.out.println(centrarLinea("Ingrese 1, 2, 3 o 4 para elegir una opción"));
			opcion = sc.nextInt();

			while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4) {
				System.out.println(Dialogo.cajaError2());
				System.out.println(centrarLinea("Ingrese 1, 2, 3 o 4 para elegir un arma"));
				opcion = sc.nextInt();
			}

			if (opcion == 1) {
				// vidaAlien = realizarAtaque(nombre, vidaAlien, ataqueProta, defensaAlien);

				vidas = realizarAtaque(vidaProta, ataqueProta, defensaProta, vidaAlien, ataqueAlien, defensaAlien);
				vidaProta = vidas[0];
				vidaAlien = vidas[1];

			} else if (opcion == 2) {
				vidas = hablar(vidaProta, ataqueProta, defensaProta, vidaAlien, ataqueAlien, defensaAlien);
				vidaProta = vidas[0];
				vidaAlien = vidas[1];

			} else if (opcion == 3) {

				for (int i = 0; i < inventario.length; i++) {

					if (inventario[0].equals("Bola de Nieve de Cristal")) {
						return "perdido6";

					} else if (inventario[0].equals("Destornillador")) {

						System.out.println("¿Qué haces?");
						System.out.println("\n1. Pegarle con el destornillador");
						System.out.println("2. Regarle el destornillador");
						System.out.println(centrarLinea("Ingrese 1 o 2 para elegir una opción"));
						opcion = sc.nextInt();

						while (opcion != 1 && opcion != 2) {
							System.out.println(Dialogo.cajaError3());
							System.out.println(centrarLinea("Ingrese 1 o 2 para elegir un arma"));
							opcion = sc.nextInt();
						}

						if (opcion == 1) {

							System.out.println(Dialogo.cajaNarrador40());

							System.out.println("¿Qué haces con el cuerpo del alien?");
							System.out.println("\n1. Dejarlo allí");
							System.out.println("2. Llevártelo a la tierra");
							System.out.println(centrarLinea("Ingrese 1 o 2 para elegir una opción"));
							opcion = sc.nextInt();

							while (opcion != 1 && opcion != 2) {
								System.out.println(Dialogo.cajaError3());
								System.out.println(centrarLinea("Ingrese 1 o 2 para elegir un arma"));
								opcion = sc.nextInt();
							}

							if (opcion == 1) {
								return "perdido3";
							} else if (opcion == 2) {
								return "perdido5";
							}

						} else if (opcion == 2) {
							return "perdido6";
						}

					} else if (inventario[0].equals("Pájaro de Madera")) {
						System.out.println(Dialogo.cajaNarrador41());
						vidas[1] += 10;
					} else if (inventario[1].equals("llaves")) {
						return "perdido7";
					}
				}

			} else if (opcion == 4) {
				vidas = huir(nombre, vidaProta, ataqueProta, defensaProta, vidaAlien, ataqueAlien, defensaAlien);
				vidaProta = vidas[0];
				vidaAlien = vidas[1];
			}

		}

		if (vidaProta <= 0) {
			return "perdido3";

		} else if (vidaAlien <= 0) {

			System.out.println(Dialogo.cajaFinal4_5());

			System.out.println("¿Qué haces con el cuerpo del alien?");
			System.out.println("\n1. Dejarlo allí");
			System.out.println("2. Llevártelo a la tierra");
			System.out.println(centrarLinea("Ingrese 1 o 2 para elegir una opción"));
			opcion = sc.nextInt();

			while (opcion != 1 && opcion != 2) {
				System.out.println(Dialogo.cajaError3());
				System.out.println(centrarLinea("Ingrese 1 o 2 para elegir un arma"));
				opcion = sc.nextInt();
			}

			if (opcion == 1) {
				return "perdido4";
			} else if (opcion == 2) {
				return "perdido5";
			}
		}
		return "";
	}

	/**
	 * Reinicia el buffer de Scanner para evitar errores con nextLine()
	 */
	public static void resetBuffer() {
		sc.nextLine();
	}

	// TODO pasar los diaologos a cajas en Dialogo

	public static int realizarAtaque(String nombre, int vidaAlien, int ataqueProta, int defensaAlien) {

		System.out.println("\n" + nombre + " ataca al alien");

		int probabilidad = (int) (Math.random() * 4 + 1);

		if (probabilidad == 1) {
			System.out.println("El alien consigue defenderse por lo que tu daño se ve reducido.");
			int resultado = vidaAlien - (ataqueProta - defensaAlien);
			return resultado;
		} else {
			int resultado = vidaAlien - (ataqueProta);
			return resultado;
		}
	}

}
