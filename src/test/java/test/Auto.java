package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
		
		

	int cantidadAsientos() {
		int cantidad = 0;
		for (int i=0; i<this.asientos.length; i++) {
				if (this.asientos[i] instanceof Asiento)
						cantidad ++;
		}
		return cantidad;
		
	}
	  public String verificarIntegridad(){
	        int registrar = this.registro;
	        for (Asiento asiento:asientos) {
	            if(asiento != null) {
	                if (registrar == asiento.registro && registrar == this.motor.registro) {
	                    return "Auto original";
	                } else {
	                    return "Las piezas no son originales";
	                }
	            }
	        }
			return marca;
	    }

	

	}
	
	

