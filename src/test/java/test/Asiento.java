package test;

public class Asiento {
/*public static void main (String args[]) {*/

	String color;
	int precio;
	int registro;
	
	
	void cambiarColor(String color) {
		if (color.equals("amarillo") || color.equals("negro") || color.equals("blanco") || color.equals("rojo") || color.equals("verde")) {
			this.color = color;
		}
	}
		
}