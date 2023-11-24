package aventuraConversacional;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Declaramos las funciones que vamos a usar
		String nombre;
		int opcionObjeto;
		String objeto = null;

		// Damos la introducción al usuario y esperamos a que presione START
		System.out.println(Dialogo.cajaIntroduccion());
		System.out.println(FuncionesDialogo.centrarLinea("Presione START para iniciar"));
		sc.nextLine();

		// Pedimos el nombre al usuario
		System.out.println(Recursos.casco);
		System.out.println(Dialogo.cajaInicio());
		System.out.println(FuncionesDialogo.centrarLinea("Irá su astronauta solo, ¿Cuál es su nombre?: "));
		nombre = sc.nextLine();
		// Si el usuario no ingreso nada, o el primer caracter del nombre no es una
		// letra, vuelve a pedirlo hasta que el dato sea correcto
		while (nombre.isEmpty() || !Character.isLetter(nombre.charAt(0))) {
			System.out.println(Dialogo.cajaErrorInicio());
			System.out.println(FuncionesDialogo.centrarLinea("Irá su astronauta solo, ¿Cuál es su nombre?: "));
			nombre = sc.nextLine();
		}

		// Enseñamos la caja antes de pedir el objeto, y esperamos a que el usuario
		// presione START
		System.out.println(Dialogo.cajaSeleccionarObjeto(nombre));
		System.out.println(FuncionesDialogo.centrarLinea("Presione START para continuar"));
		sc.nextLine();

		// Damos cada uno de los objeto con un número, esperamos a que el usuario
		// presione START entre cada uno
		System.out.println(
				FuncionesDialogo.centrarLinea("Selecciona una de las herramientas que se presentara a continuación:"));
		System.out.println("1.");
		System.out.println(Recursos.bola);
		System.out.println(FuncionesDialogo.centrarLinea("Presione START para continuar"));
		sc.nextLine();
		System.out.println("2.");
		System.out.println(Recursos.destornillador);
		System.out.println(FuncionesDialogo.centrarLinea("Presione START para continuar"));
		sc.nextLine();
		System.out.println("3.");
		System.out.println(Recursos.pajaro);
		System.out.println(FuncionesDialogo.centrarLinea("Presione START para continuar"));
		sc.nextLine();

		// Le pedimos al usuario que objeto desea
		System.out.println(FuncionesDialogo.centrarLinea("Ingrese 1, 2 o 3 para elegir un arma"));
		opcionObjeto = sc.nextInt();
		// Si el usuario ingresa un numero que no corresponde al objeto, volver a
		// pedirlo
		while (opcionObjeto != 1 && opcionObjeto != 2 && opcionObjeto != 3) {
			System.out.println(Dialogo.cajaErrorSeleccionarObjeto());
			System.out.println(FuncionesDialogo.centrarLinea("Ingrese 1, 2 o 3 para elegir un arma"));
			opcionObjeto = sc.nextInt();
		}
		// Según la opción, asignara a objeto la elección elegida
		switch (opcionObjeto) {
		case 1:
			objeto = "bola";
			break;
		case 2:
			objeto = "destornillador";
			break;
		case 3:
			objeto = "pajaro";
			break;
		}
		System.out.println(FuncionesDialogo.centrarLinea("Muy bien!, ha seleccionado " + objeto));
	}

	public static void resetBuffer() {
		sc.nextLine();
	}

}
