package tp1;
import javax.swing.JFrame;

public class Fermer extends JFrame{
	ConcreteObserver a;
	
	public Fermer(ConcreteObserver a,String s){
		super(s);
		this.a=a;
	}
	
	public void dispose(){
		a.getRadio().detach(a);
		super.dispose();
	}

}
