import java.io.*; 
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		Voiture v1 = new Voiture("BMW","panne legere");
		Voiture v2 = new Voiture("Audi","panne legere");
		Voiture v3 = new Voiture("Renault","panne severe");
		Voiture v4 = new Voiture("Mini","panne severe");
		
		Garage renault = new Garage();
		renault.add(v1);
		renault.add(v2);
		renault.add(v3);
		renault.add(v4);
		
		int n = 0;
		while(n != renault.listSize()){
			Voiture v = renault.getList().get(n);
			Atelier a = v.getAtelier();
			
			int temps = a.reparer(v);
			
			for(int i=1; i <=temps ; i++){
				Thread.sleep(1000);
				System.out.println(i+"heure(s) est passé");
			}
			renault.getVoitureList(n).setEtat("marche");
			n++;
			renault.afficherVoiture();
		}

	}

}
