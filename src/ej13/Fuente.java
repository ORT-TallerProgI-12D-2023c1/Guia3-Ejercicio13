package ej13;

public abstract class Fuente implements Calificable {
	private String nombre;
	private String ubicacion;

	public Fuente(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

}
