package tp6;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Dessert> list = new ArrayList<>();
		
		Factory f = Factory.getInstance();
		
		list.add(f.getDessert("crepe au chocolat et chantilly"));
		
		for(Dessert d : list){
			System.out.println(d);
		}

		
		
	}
}
