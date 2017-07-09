package model;

public class Pays {

	private String nom;
	private int richesse;
	private int densite;
	private int climat;
	private String codeCouleur;
	
	public Pays (String nom, int richesse, int densite, int temperature, int climat, String codeCouleur){
		this.nom = nom;
		this.richesse = richesse;
		this.climat = climat;
		this.densite = densite;
		this.codeCouleur = codeCouleur;
	}
	
	public void creationMonde() {
		
		
	}
}
