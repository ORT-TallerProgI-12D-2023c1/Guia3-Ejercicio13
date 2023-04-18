package ej13;

import java.util.ArrayList;

public class Sophie {
	private ArrayList<Programa> programas;

	public Sophie() {
		super();
		this.programas = new ArrayList<Programa>();
	}

	public ArrayList<Programa> programasPorDebajoDe(double calidadMin) {
		ArrayList<Programa> programasMin = new ArrayList<Programa>();
		for (Programa programa : programasMin) {
			if (programa.calificar() < calidadMin) {
				programasMin.add(programa);
			}
		}
		return programasMin;
	}

}
