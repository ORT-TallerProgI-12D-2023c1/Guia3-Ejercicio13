package ej13;

public class Metodo implements Calificable {
	private String nombre;
	private int cantidadParams;
	private int cantidadInstrucciones;
	private int cantidadRamificaciones;

	public String getNombre() {
		return nombre;
	}

	public int getCantidadParams() {
		return cantidadParams;
	}

	public int getCantidadInstrucciones() {
		return cantidadInstrucciones;
	}

	public int getCantidadRamificaciones() {
		return cantidadRamificaciones;
	}

	public Metodo(String nombre, int cantidadParams, int cantidadInstrucciones, int cantidadRamificaciones) {
		super();
		this.nombre = nombre;
		this.cantidadParams = cantidadParams;
		this.cantidadInstrucciones = cantidadInstrucciones;
		this.cantidadRamificaciones = cantidadRamificaciones;
	}

	@Override
	public double calificar() {
		return 5.0 / (cantidadParams + 1) + 20 / cantidadInstrucciones + 3 / (cantidadRamificaciones + 1);
	}

	@Override
	public String toString() {
		return "Metodo [" + nombre + ", cantidadParams=" + cantidadParams + ", cantidadInstrucciones="
				+ cantidadInstrucciones + ", cantidadRamificaciones=" + cantidadRamificaciones + ", calificacion="
				+ calificar() + "]";
	}

	public boolean esIgual(String nombre2) {
		return nombre2.equals(this.nombre);
	}

}
