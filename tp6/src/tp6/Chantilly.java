package tp6;

public class Chantilly extends DecorateurIngredient {
	
	public Chantilly (Dessert d){
		this.dessert = d;
		
	}
	
	public String getLibelle(){
		return super.dessert.getLibelle()+" chantilly";
	}
	
	public double getPrix(){
		return super.dessert.getPrix()+0.5;
	}
}
