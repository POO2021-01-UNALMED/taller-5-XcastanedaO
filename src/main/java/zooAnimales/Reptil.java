package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado = new ArrayList();
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int LargoCola;
	
	public Reptil() {
		
	}
	
	public Reptil(String nom, int edad, String habitat, String gen, String col, int largo) {
		super.getNombre();
		super.getEdad();
		super.getHabitat();
		super.getGenero();
		this.colorEscamas = col;
		this.LargoCola = largo;
		listado.add(this);
	}
	
	
	
	
	
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	public void movimiento() {
		
	}
	
	public void crearIguana() {
		
	}
	
	public void crearSerpiente() {
		
	}
}
