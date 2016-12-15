package tp6;

public class Chocolat extends DecorateurIngredient{
	
	Chocolat(Dessert d){
		this.dessert = d;

	}
	
	public String getLibelle(){
		return dessert.getLibelle()+" chocolat";
	}
	
	public double getPrix(){
		return dessert.getPrix()+0.5;
	}

}
