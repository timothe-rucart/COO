
public class Voiture {

	private String etat;
	private String nom;
	private Atelier a;
	
	/* on attribut un atelier selon l'état de la voiture */
	Voiture(String nom, String etat){
		this.nom = nom;
		this.etat = etat;
		
		if(etat.equals("panne severe")){
			a = AtelierSevere.getInstanciation();
		}
		else if(etat.equals("panne legere")){			
			a = AtelierLeger.getInstanciation();
		}
	}
	
	void setEtat(String etat){
		this.etat = etat;
		
		if(etat.equals("panne severe")){
			a = new AtelierSevere();
		}else if(etat.equals("panne legere")){
			a = new AtelierLeger();
		}else
			a=null;
	}
	
	public String toString(){
		return ("la voiture est de la marque: "+nom+", son etat est: "+etat);
	}

	public Atelier getAtelier(){
		return a;
	}
}