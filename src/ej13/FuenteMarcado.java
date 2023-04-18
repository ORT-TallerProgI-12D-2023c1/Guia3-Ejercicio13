package ej13;

public class FuenteMarcado extends Fuente {
	private int tamañoArchivo;

	public FuenteMarcado(String nombre, String ubicacion, int tamañoArchivo) {
		super(nombre, ubicacion);
		this.tamañoArchivo = tamañoArchivo;
	}

	@Override
	public double calificar() {
		return 450.0 / tamañoArchivo;

	}

}
