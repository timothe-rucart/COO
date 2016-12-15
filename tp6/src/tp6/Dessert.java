package tp6;

import java.util.ArrayList;

public class Dessert {

	private String libelle;
	private double prix;	

	
	protected void setLibelle(String libelle){ this.libelle = libelle;}
	
	protected void setPrix(double prix ){ this.prix = prix; }
	
	public String getLibelle(){ return libelle;}
	
	public double getPrix(){ return prix; }
	
	public String toString(){
		return "libelle : "+libelle+", prix : "+prix;
	}
	
}
