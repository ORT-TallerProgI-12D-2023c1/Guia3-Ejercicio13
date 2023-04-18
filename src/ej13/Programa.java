package ej13;

import java.util.ArrayList;

public class Programa implements Calificable {

	private int id;
	private String nombre;
	private String nomResponsable;
	private boolean pasoPruebas;
	private ArrayList<Fuente> fuentes;

	@Override
	public double calificar() {

		return pasoPruebas ? this.obtenerPromedios() : 0;

	}

	public void mostrarDetalleDeMetodo(String nombreMetodo) {
		boolean metodoExiste = false;
		for (Fuente fuente : fuentes) {
			if (fuente instanceof FuenteProgramacion) {
				metodoExiste = ((FuenteProgramacion) fuente).mostrarMetodoPorNombre(nombreMetodo);
			}
		}
		if(!metodoExiste) {
			System.out.printf("El método %s no existe", nombreMetodo);
		}
	}

	public ArrayList<Fuente> listadoFuentesMayoresAlPromedio() {
		double promedios = this.obtenerPromedios();
		ArrayList<Fuente> fuentesMayores = new ArrayList<Fuente>();
		for (Fuente fuente : fuentesMayores) {
			if (fuente.calificar() > promedios) {
				fuentesMayores.add(fuente);
			}
		}
		return fuentesMayores;
	}

	private double obtenerPromedios() {
		double acumCalidad = 0;
		for (Fuente fuente : fuentes) {
			acumCalidad += fuente.calificar();
		}
		return acumCalidad / fuentes.size();
	}
}
