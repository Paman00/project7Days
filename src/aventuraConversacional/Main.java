package aventuraConversacional;

import java.util.Scanner;

import static aventuraConversacional.FuncionesDialogo.centrarLinea;
import static aventuraConversacional.FuncionesDialogo.centrarTexto;
import static aventuraConversacional.FuncionesDialogo.agregarColor;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Declaramos las funciones que vamos a usar
		String nombre;
		int opcion;
		String[] inventario = new String[5];
		int respeto = 5;
		int contadorFallo = 0;
		String objetoInventario = null;

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
			System.out.println(centrarLinea("Llegas a las 06:00"));
		} else if (opcion == 2) {
			System.out.println(centrarLinea("Llegas a las 06:25"));
		}
		System.out.println(centrarLinea("Llegas al lanzamiento"));
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();

		System.out.println(Dialogo.cajaLanzamiento());
		System.out.println(centrarLinea("Presione START para continuar"));
		sc.nextLine();
		// Reiniciamos el valor de la variable usada para escoger las opciones
		opcion = 0;
		System.out.println(centrarLinea("¿En qué parte se gasta más combustible?"));
		System.out.println("1. En la salida de la atmósfera de la Tierra");
		System.out.println("2. En el espacio");
		System.out.println("3. En el aterrizaje en la Luna ");
		System.out.println("4. En la salida de la atmósfera de la Luna");
		System.out.println("5. En el aterrizaje en la Tierra");
		System.out.println(centrarLinea("Ingrese 1, 2, 3, 4, 5 para elegir una respuesta"));
		opcion = sc.nextInt();

		while (opcion < 1 || opcion > 5) {
			System.out.println(Dialogo.cajaErrorRespeto1());
			System.out.println(centrarLinea("Ingrese 1, 2, 3, 4 o 5 para elegir la respuesta"));
			opcion = sc.nextInt();
			contadorFallo++;
			if (contadorFallo == 1) {
				respeto--;
			}
		}

		while (opcion != 5) {
			System.out.println(Dialogo.cajaFallorespeto1());
			System.out.println(centrarLinea("Ingrese 1, 2, 3, 4 o 5 para elegir la respuesta"));
			opcion = sc.nextInt();
		}

		System.out.println(
				centrarTexto("Eso, la fuerza de la gravedad hace que se queme mucho combustible para poder salir"));

		// Reiniciamos el valor de la variable usada para escoger las opciones
		opcion = 0;

		System.out.println(centrarLinea("¿Llevas algún objeto que declarar?"));
		System.out.println("1. Bola de Nieve de Cristal");
		System.out.println("2. Destornillador");
		System.out.println("3. Pájaro de Madera");
		System.out.println("4. No");
		System.out.println(centrarLinea("Ingrese 1, 2 o 3 para elegir un arma"));
		opcion = sc.nextInt();

		if (opcion == 1) {
			objetoInventario = "Bola de Nieve de Cristal";
		} else if (opcion == 2) {
			objetoInventario = "Destornillador";
		} else if (opcion == 3) {
			objetoInventario = "Pájaro de Madera";
		}

		boolean objetoEncontrado = false;

		for (int i = 0; i < inventario.length; i++) {
			if (objetoInventario.equals(inventario[i])) {
				objetoEncontrado = true;
				System.out.println(centrarLinea("(Revisa tu equipaje)"));
				System.out.println(centrarLinea("Efectivamente, un " + inventario[i] + " todo correcto"));
				i = inventario.length; // Si encuentra el objeto, sale del bucle
			}
		}
		if (!objetoEncontrado) {
			System.out.println(centrarLinea("(Revisa tu equipaje)"));
			System.out
					.println(centrarLinea("Eh… señor esto no es un " + objetoInventario + ", es un " + inventario[0]));
			respeto--;
		}

		System.out.println(
				agregarColor(centrarLinea("Proxima pregunta, ¿por qué estamos haciendo esta misión?"), Recursos.RED));

	}

	/**
	 * Reinicia el buffer de Scanner para evitar errores con nextLine()
	 */
	public static void resetBuffer() {
		sc.nextLine();
	}
}
