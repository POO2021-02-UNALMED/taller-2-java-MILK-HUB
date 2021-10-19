package test;


public class Motor {

	int numeroCilindros;
	String tipo;
	int registro;
	
	
	void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	
	void asignarTipo(String tipoM) {
		switch (tipoM) {
		case"electrico":
		case"gasolina": {
		this.tipo = tipoM;
		break;
		}
		
	}
	
	
	}
	
	
}