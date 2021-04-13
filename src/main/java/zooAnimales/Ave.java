package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList();
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave() {
		
	}
	
	public Ave(String nom, int edad, String habitat, String gen, String col) {
		super.getNombre();
		super.getEdad();
		super.getHabitat();
		super.getGenero();
		this.colorPlumas = col;
		listado.add(this);
		
	}
	
	
	public static int cantidadAves() {
		return listado.size();
	}
	
	public void movimiento() {
		
	
	}
	
	public void crearHalcon() {
		
	}
	
	public void crearAguila() {
		
	}
}
