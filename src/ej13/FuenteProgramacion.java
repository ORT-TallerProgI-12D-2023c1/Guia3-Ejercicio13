package ej13;

import java.util.ArrayList;

public class FuenteProgramacion extends Fuente {

	private ArrayList<Metodo> metodos;

	public FuenteProgramacion(String nombre, String ubicacion, ArrayList<Metodo> metodos) {
		super(nombre, ubicacion);

		this.metodos = new ArrayList<Metodo>();
	}

	public ArrayList<Metodo> getMetodos() {
		return metodos;
	}

	public boolean mostrarMetodoPorNombre(String nombre) {
		boolean hayMatch = false;
		for (Metodo metodo : metodos) {
			if (metodo.esIgual(nombre)) {
				hayMatch = true;
				System.out.println(metodo);
			}
		}
		return hayMatch;
	}

	@Override
	public double calificar() {
		double acumCalidad = 0;
		for (Metodo metodo : metodos) {
			acumCalidad += metodo.calificar();
		}
		return acumCalidad / metodos.size();
	}

}
