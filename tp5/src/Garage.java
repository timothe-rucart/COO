import java.util.ArrayList;
import java.util.Iterator;

public class Garage {

	private ArrayList<Voiture> list = new ArrayList<>();
	private Iterator<Voiture> iter;
	private Atelier a;
		
	
	void add(Voiture v){
		list.add(v);
	}
	
	public void afficherVoiture(){
		iter = list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		System.out.println("\n");
	}

	public int listSize(){
		return list.size();
	}
	
	public ArrayList<Voiture> getList(){
		return list;
	}
	
	public void removeList(){
		list.remove(0);
	}
	
	public Voiture getVoitureList(int n){
		return list.get(n);
	}
}
