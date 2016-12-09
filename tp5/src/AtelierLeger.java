import java.util.Random;

public class AtelierLeger extends Atelier {

	Random r;
	static AtelierLeger a;
	
	
	AtelierLeger(){
		r = new Random();
	}
	
	public static AtelierLeger getInstanciation(){
		if(a==null){
			a = new AtelierLeger();
		}
		return a;
	}

	
	public int reparer(Voiture v) {
		return r.nextInt(3)+1;
	}	

}
