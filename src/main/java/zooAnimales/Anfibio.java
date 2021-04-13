package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado = new ArrayList();
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	
	public Anfibio() {
		
	}
	
	public Anfibio(String nom, int edad, String habitat, String gen, String col, Boolean venenoso) {
		super.getNombre();
		super.getEdad();
		super.getHabitat();
		super.getGenero();
		this.colorPiel = col;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	public String movimiento() {
		return "Saltar";
	}
	
	public void crearRana() {
		
	
	}
	
	public void crearSalamandra() {
		
	}
	
}
