package aventuraConversacional;

import java.util.Scanner;

import static aventuraConversacional.FuncionesDialogo.centrarLinea;
import static aventuraConversacional.FuncionesDialogo.centrarTexto;
import static aventuraConversacional.FuncionesDialogo.agregarColor;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Declaramos las variables que vamos a usar
		String nombre;
		int opcion;
		String[] inventario = new String[5];
		int respeto = 5;
		int contadorFallo = 0;
		String objetoInventario = null;
		boolean objetoEncontrado = false;
		boolean finDeLaPartida = false;
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

		// Damos la introducción al usuario y esperamos a que presione START
		System.out.println(Dialogo.cajaIntroduccion());
		System.out.println(centrarLinea("Presione START para iniciar"));
		sc.nextLine();

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

		// Reiniciamos el valor de la variable usada para escoger las opciones
		opcion = 0;

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
		while (opcion != 1 && opcion != 2 && opcion != 3) {
			System.out.println(Dialogo.cajaErrorSeleccionarModo());
			System.out.println(centrarLinea("Ingrese 1 o 2 para elegir un arma"));
			opcion = sc.nextInt();
		}

		// Reset de Buffer por error
		resetBuffer();

		System.out.println(Recursos.naveAntesDeDespegar);
		if (opcion == 1) {
			System.out.println(Dialogo.cajaHoraLLegada01());
		} else if (opcion == 2) {
			System.out.println(Dialogo.cajaHoraLLegada02());
		}
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(Dialogo.cajaLanzamiento());
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		// Reiniciamos el valor de la variable usada para escoger las opciones
		opcion = 0;

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

		// TODO
		// No funciona
		if (respeto <= 0) {
			finDeLaPartida = true;
		}

		System.out.println("El respeto es de " + respeto);

		System.out.println(Dialogo.cajaJefe1());

		// Reiniciamos el valor de la variable usada para escoger las opciones
		opcion = 0;
		contadorFallo = 0;

		System.out.println(agregarColor(centrarLinea("\n¿Llevas algún objeto que declarar?"), Recursos.PURPLE));
		System.out.println("1. Bola de Nieve de Cristal");
		System.out.println("2. Destornillador");
		System.out.println("3. Pájaro de Madera");
		System.out.println("4. No");
		System.out.println(centrarLinea("Ingrese 1, 2 o 3 para elegir un arma"));
		opcion = sc.nextInt();

		// TODO Añadir errores de entrada

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
		opcion = 0;
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

		// TODO
		// No funciona
		if (respeto <= 0) {
			finDeLaPartida = true;
		}

		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(Dialogo.cajaNarrador04());

		// Reiniciamos el valor de la variable usada para escoger las opciones
		opcion = 0;

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

		// Reiniciamos el valor de la variable usada para escoger las opciones
		opcion = 0;

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
			// Reiniciamos el valor de la variable usada para escoger las opciones
			opcion = 0;
			System.out.println(Dialogo.cajaNarrador18());
			System.out.println("\n1. Seguir sin hacer nada");
			System.out.println("2. Jugar con " + inventario[0]);
			System.out.println(centrarLinea("Ingrese 1 o 2 para elegir una opción"));
			opcion = sc.nextInt();

			// TODO Añadir errores de entrada
			if (opcion == 1) {

				// Reiniciamos el valor de la variable usada para escoger las opciones
				opcion = 0;

				System.out.println(Dialogo.cajaNarrador19());
				System.out.println("\n1. Rendirse");
				System.out.println("2. Continuar");
				System.out.println(centrarLinea("Ingrese 1 o 2 para elegir una opción"));
				opcion = sc.nextInt();
				// TODO Añadir errores de entrada
				if (opcion == 1) {
					System.out.println(Dialogo.cajaNarrador20());
					finDeLaPartida = true;
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

		// Reiniciamos el valor de la variable usada para escoger las opciones
		opcion = 0;
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

		System.out.println(Dialogo.cajaNarrador29());
		System.out.println(Dialogo.cajaNarrador30());
		System.out.println(Dialogo.cajaNarrador31());

		// Reiniciamos el valor de la variable usada para escoger las opciones
		opcion = 0;

		System.out.println("\n1. Esperar y pasar tiempo al lado de la nave");
		System.out.println("2. Dar una vuelta y explorar la Luna");
		System.out.println(centrarLinea("Ingrese 1 o 2 para elegir una opción"));
		opcion = sc.nextInt();

		while (opcion != 1 && opcion != 2) {
			// TODO texto error
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
						finDeLaPartida = true;
					}
				}
			}
		} else if (opcion == 2) {

			// Reiniciamos el valor de la variable usada para escoger las opciones
			opcion = 0;

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
		// Reiniciamos el valor de la variable usada para escoger las opciones
		opcion = 0;
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

			switch (opcion) {

			case 1:
				//vidaAlien = realizarAtaque(nombre, vidaAlien, ataqueProta, defensaAlien);

				vidas = realizarAtaque(nombre, vidaProta, ataqueProta, defensaProta, vidaAlien, ataqueAlien,
						defensaAlien);
				vidaProta = vidas[0];
				vidaAlien = vidas[1];

				break;
			case 2:
				vidas = hablar(nombre, vidaProta, ataqueProta, defensaProta, vidaAlien, ataqueAlien, defensaAlien);
				vidaProta = vidas[0];
				vidaAlien = vidas[1];
				break;
			case 3:
				escogerObjeto();
				break;
			case 4:
				vidas = huir(nombre, vidaProta, ataqueProta, defensaProta, vidaAlien, ataqueAlien, defensaAlien);
				vidaProta = vidas[0];
				vidaAlien = vidas[1];
				break;
			default:
				System.out.println("Esa opción no es válida, por favor elige otra");
			}

		}

		if (vidaProta <= 0) {
			System.out.println("Mala suerte, el alien ha acabado contigo");
		} else if (vidaAlien <= 0) {
			System.out.println("Has derrorta al alien ¡Enhorabuena!");
		}
	}

	// TODO Finales
	/*
	 * Texto Fin de la partida 1
	 * System.out.println(Dialogo.cajaJefeMuerteRespeto1());
	 * //System.out.println(Dialogo.cajaJefeMuerteRespeto2(nombre));
	 * System.out.println(Recursos.despegue);
	 * System.out.println(Dialogo.cajaMuerteNarrador());
	 */

	/*
	 * Texto Fin de la partida 2 system.out.println(Dialogo.cajaFinal2_1());
	 * system.out.println(Dialogo.cajaFinal2_2());
	 */

	/**
	 * Reinicia el buffer de Scanner para evitar errores con nextLine()
	 */
	public static void resetBuffer() {
		sc.nextLine();
	}

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

	public static int[] realizarAtaque(String nombre, int vidaProta, int ataqueProta, int defensaProta, int vidaAlien,
			int ataqueAlien, int defensaAlien) {

		System.out.println("\n Atacas al alien");

		int probabilidadDefensaAlien = (int) (Math.random() * 4 + 1);

		if (probabilidadDefensaAlien == 1) {
			System.out.println("El alien consigue defenderse por lo que tu daño se ve reducido.");
			vidaAlien = vidaAlien - (ataqueProta - defensaAlien);
		} else {
			vidaAlien = vidaAlien - ataqueProta;
		}

		// Añadimos la posibilidad de que el alien ataque

		int probabilidadAtaqueAlien = (int) (Math.random() * 5 + 1);

		if (probabilidadAtaqueAlien == 1) {
			System.out.println("El alien consigue atacarte al alien");

			int probabilidadDefensaProta = (int) (Math.random() * 4 + 1);

			if (probabilidadDefensaProta == 1) {
				System.out.println("El protagonista consigue defenderse por lo que el daño se ve reducido.");
				vidaProta = vidaProta - (ataqueAlien - defensaProta);
			} else {
				vidaProta = vidaProta - ataqueAlien;
			}
		}

		// Devolvemos las vidas actualizadas en un array
		return new int[] { vidaProta, vidaAlien };
	}

	public static int[] hablar(String nombre, int vidaProta, int ataqueProta, int defensaProta, int vidaAlien,
			int ataqueAlien, int defensaAlien) {
		System.out.println("\n Atacas al alien");

		int probabilidadDefensaAlien = (int) (Math.random() * 4 + 1);

		if (probabilidadDefensaAlien == 1) {
			System.out.println("El alien consigue defenderse por lo que tu daño se ve reducido.");
			vidaAlien = vidaAlien - (ataqueProta - defensaAlien);
		} else {
			vidaAlien = vidaAlien - ataqueProta;
		}

		// Añadimos la posibilidad de que el alien ataque

		int probabilidadAtaqueAlien = (int) (Math.random() * 5 + 1);

		if (probabilidadAtaqueAlien == 1) {
			System.out.println("El alien consigue atacarte al alien");

			int probabilidadDefensaProta = (int) (Math.random() * 4 + 1);

			if (probabilidadDefensaProta == 1) {
				System.out.println("El protagonista consigue defenderse por lo que el daño se ve reducido.");
				vidaProta = vidaProta - (ataqueAlien - defensaProta);
			} else {
				vidaProta = vidaProta - ataqueAlien;
			}
		}

		// Devolvemos las vidas actualizadas en un array
		return new int[] { vidaProta, vidaAlien };

	}

	public static boolean escogerObjeto() {
		return false;

	}

	public static int[] huir(String nombre, int vidaProta, int ataqueProta, int defensaProta, int vidaAlien,
			int ataqueAlien, int defensaAlien) {

		System.out.println("\n Atacas al alien");

		int probabilidadDefensaAlien = (int) (Math.random() * 4 + 1);

		if (probabilidadDefensaAlien == 1) {
			System.out.println("El alien consigue defenderse por lo que tu daño se ve reducido.");
			vidaAlien = vidaAlien - (ataqueProta - defensaAlien);
		} else {
			vidaAlien = vidaAlien - ataqueProta;
		}

		// Añadimos la posibilidad de que el alien ataque

		int probabilidadAtaqueAlien = (int) (Math.random() * 5 + 1);

		if (probabilidadAtaqueAlien == 1) {
			System.out.println("El alien consigue atacarte al alien");

			int probabilidadDefensaProta = (int) (Math.random() * 4 + 1);

			if (probabilidadDefensaProta == 1) {
				System.out.println("El protagonista consigue defenderse por lo que el daño se ve reducido.");
				vidaProta = vidaProta - (ataqueAlien - defensaProta);
			} else {
				vidaProta = vidaProta - ataqueAlien;
			}
		}

		// Devolvemos las vidas actualizadas en un array
		return new int[] { vidaProta, vidaAlien };

	}

}
