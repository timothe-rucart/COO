import java.util.Random;

public class AtelierSevere extends Atelier{

	Random r;
	static AtelierSevere a;
	
	AtelierSevere(){
		r = new Random();
	}
	
	public static AtelierSevere getInstanciation(){
		if(a==null)
			a = new AtelierSevere();
		return a;
	}
	
	public int reparer(Voiture v) {
		return r.nextInt(3)+4;
	}

}
