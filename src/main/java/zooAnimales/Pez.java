package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado = new ArrayList();
	public int salmones;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		
	}
	
	public Pez(String nom, int edad, String habitat, String gen, String col, int cant) {
		super.getNombre();
		super.getEdad();
		super.getHabitat();
		super.getGenero();
		this.colorEscamas = col;
		this.cantidadAletas = cant;
		listado.add(this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static int cantidadPeces() {
		return listado.size();
	}
	
	public void movimiento() {
		
	}
	
	public void crearSalmon() {
		
	}
	
	public void crearBacalao() {
		
	}

}
