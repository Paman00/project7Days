package aventuraConversacional;

import java.util.Scanner;

public class Aventura {
	private static Scanner sc = new Scanner(System.in);

	public static void aIntro() {
		// TODO
	}
	
	public static String a001() {
		System.out.println(Dialogo.d001());
		String nombre = sc.nextLine();
		while (!nombre.substring(0, 1).matches("[a-zA-ZñÑ]*")) {
			System.out.println(Dialogo.e001());
			nombre = sc.nextLine();
		}
		return nombre;
	}
	
	public static int a002() {
		//TODO
		System.out.println(Dialogo.d003());
		System.out.println(Dialogo.m002());
		int opcion = sc.nextInt();
		if (opcion==1) {
			
		}else if(opcion==2) {
			
		}else if (opcion==3) {
			
		}
		while (opcion < 1 || opcion >3) {
			System.out.println(Dialogo.e002());
			opcion = sc.nextInt();
		}
		return opcion;
	}
	
	public static void fin() {
		sc.close();
	}
}
