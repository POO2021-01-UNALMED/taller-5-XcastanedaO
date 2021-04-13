package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String genero;
	private String habitat;
	//private Zona[] zona;
	//private ArrayList<Zona> zona = new ArrayList();
	private Zona zona;
	public Animal() {
		
	}
	
	public Animal(String nom,int edad, String habitat, String gen) {
		this.nombre = nom;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = gen;
		this.totalAnimales++;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getGenero() {
		return this.getGenero();
	}
	
	public String getHabitat() {
		return this.getHabitat();
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public Zona getZona() {
		return this.zona;
	}
	
	
	
	
	
	
	public void movimiento(){
		return this.movimiento();
	}
	
	public String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos() + "/n" +
				"Aves: " + Ave.cantidadAves() + "/n" +
				"Reptiles: " + Reptil.cantidadReptiles() + "/n"+
				"Peces: " + Pez.cantidadPeces() + "/n" +
				"Anfibios " + Anfibio.cantidadAnfibios() + "/n";
	}
	
	public String toString() {
		if(this.getZona().equals(null)) {
			return "Mi nombre es " + this.getNombre() + ",tengo una edad de " + this.getEdad()+",habito en "+ this.getHabitat()+" y mi genero es" + this.getGenero();	
		}else {
			return "Mi nombre es " + this.getNombre() + ",tengo una edad de " + this.getEdad()+",habito en "+ this.getHabitat()+" y mi genero es" + this.getGenero()+",la zona en la que me ubico es "+ this.getZona()+",en el zoo" +this.getZona().getZool();
		}
	}	
		
	
	
	
	
}
