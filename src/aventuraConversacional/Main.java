package aventuraConversacional;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(Recursos.dragon);
		ManejadorAventura.obtenerStartInicio();
		String nombre = ManejadorAventura.obtenerNombreJugador();
		String objeto = ManejadorAventura.obtenerSeleccionObjeto(nombre);
	}
	
	public static void resetBuffer() {
		ManejadorAventura.resetBuffer();
	}

}
