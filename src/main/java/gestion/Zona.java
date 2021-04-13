package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	public Zoologico zoo;
	//private Animal[] animales;
	private ArrayList<Animal> animales = new ArrayList();
	
	public Zona() {
		
	}
	
	public Zona(String nom, Zoologico zool) {
		this.nombre = nom;
		this.zoo = zool;
	}
	
	public  ArrayList<Animal> getAnimales() {
		return this.animales;
	}
	
	public void agregueAnimales(Animal animal) {
		this.animales.add(animal);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
	
	public Zoologico getZool() {
		return this.zoo;
	}
	

}
