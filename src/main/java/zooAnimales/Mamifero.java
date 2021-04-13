package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado = new ArrayList();
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		
	}
	
	public Mamifero(String nom, int edad, String habitat, String gen,Boolean pelaje, int patas ) {
		super.getNombre();
		super.getEdad();
		super.getHabitat();
		super.getGenero();
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	
	
	
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public void crearCaballo() {
		
	}
	
	public void crearLeon() {
		
	}
}
