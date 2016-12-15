package tp6;

public class Chocolat extends DecorateurIngredient{
	
	Chocolat(Dessert d){
		this.dessert = d;
	}
	
	public String getLibelle(){
		return super.dessert.getLibelle();
	}
	
	public double getPrix(){
		return super.dessert.getPrix();
	}

}
