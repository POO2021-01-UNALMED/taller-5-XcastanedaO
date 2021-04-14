package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		
	}
	
	public Ave(String nom, int edad, String habitat, String gen, String col) {
		super.setNombre(nom);;
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(gen);
		this.colorPlumas = col;
		listado.add(this);

	}
	
	
	public static int cantidadAves() {
		return listado.size();
	}
	
	public String movimiento(){
		return "volar";
	}
	
	public static Animal crearHalcon(String nom,int edad,String gen) {
		Ave obj = new Ave(nom,edad,"montanas",gen,"cafe glorioso");
		halcones ++;
		return obj;
		
	}
	
	public static Animal crearAguila(String nom,int edad,String gen) {
		aguilas++;
		Ave obj = new Ave(nom,edad,"montanas",gen,"blanco y amarillo");
		return obj;
	}

	public String getColorPlumas() {
		// TODO Esbozo de m�todo generado autom�ticamente
		return this.colorPlumas;
	}
}
