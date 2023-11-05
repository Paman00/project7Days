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

	public static void fin() {
		sc.close();
	}
}
