package aventuraConversacional;

import java.util.Scanner;

public class ManejadorAventura {
	private static Scanner sc = new Scanner(System.in);

	public static void iniciarAventura() {
		obtenerStartInicio();
		String nombre = obtenerNombreJugador();
		String objeto = obtenerSeleccionObjeto(nombre);
	}

	public static void obtenerStartInicio() {
		System.out.println(GeneradorDialogo.obtenerCajaIntroduccion());
		System.out.println(Dialogo.centrarLineaPredeterminada("Presione START para inciar"));
		sc.nextLine();
	}

	public static String obtenerNombreJugador() {
		System.out.println(Recursos.obtenerCasco());
		System.out.println(GeneradorDialogo.obtenerCajaInicio());
		System.out.println(Dialogo.centrarLineaPredeterminada("Irá su astronauto solo, ¿Cúal es su nombre?: "));
		String nombre = sc.nextLine();
		while (!nombre.substring(0, 1).matches("[a-zA-ZñÑ]*")) {
			System.out.println(GeneradorDialogo.obtenerCajaErrorInicio());
			System.out.println(Dialogo.centrarLineaPredeterminada("Irá su astronauto solo, ¿Cúal es su nombre?: "));
			nombre = sc.nextLine();
		}
		return nombre;
	}

	public static String obtenerSeleccionObjeto(String nombre) {
		System.out.println(GeneradorDialogo.obtenerCajaSeleccionarObjeto(nombre));
		System.out.println(Dialogo
				.centrarLineaPredeterminada("Selecciona una de las herramientas que se presentara acontinuación:"));
		System.out.println("1.");
		System.out.println(Recursos.obtenerBola());
		System.out.println("Presione START para continuar");
		sc.nextLine();
		System.out.println("2.");
		System.out.println(Recursos.obtenerDestornillador());
		System.out.println("Presione START para continuar");
		sc.nextLine();
		System.out.println("3.");
		System.out.println(Recursos.obtenerPajaro());
		System.out.println("Presione START para continuar");
		sc.nextLine();
		System.out.println(Dialogo.centrarLineaPredeterminada("Ingrese 1, 2 o 3 para elegir un arma"));
		int opcion = sc.nextInt();
		while (opcion != 1 && opcion != 2 && opcion != 3) {
			System.out.println(GeneradorDialogo.obtenerCajaErrorSeleccionarObjeto());
			System.out.println(Dialogo.centrarLineaPredeterminada("Ingrese 1, 2 o 3 para elegir un arma"));
			opcion = sc.nextInt();
		}
		String objeto = "";
		switch (opcion) {
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
		System.out.println(Dialogo.centrarLineaPredeterminada("Muy bien!, ha seleccionado " + objeto));
		return objeto;
	}
}
