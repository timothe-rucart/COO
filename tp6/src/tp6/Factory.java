package tp6;

public class Factory {

	private static Factory INSTANCE;
	
	
	public static Factory getInstance(){
		if(INSTANCE == null)
			INSTANCE = new Factory();
		return INSTANCE;
	}
	
	public Dessert getDessert(String dessert){
		Dessert d = null;
		
		if(dessert.contains("gaufre")){
			d = new Gaufre();
		}
		else if(dessert.contains("crepe")){
			 d = new Crepe();
		}
		
		// si une gaufre ou une crepe a ete cree
		if( d != null){
			if(dessert.contains("chantilly")){
				d.setLibelle("chantilly");
			}
			
			if(dessert.contains("chocolat")){
				
				//si il ne contient pas de chantilly
				if(d.getLibelle() == null){
					d.setLibelle("chocolat");
				}
				//si le dessert contient déja de la chantilly
				else{
					d.setLibelle(d.getLibelle()+" & chocolat");
				}
			}
		}
		return d;
		
	}
}