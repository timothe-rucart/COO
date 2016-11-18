package tp1;

import java.util.ArrayList;

public abstract class Subject {
	
	ArrayList<Observer> list = new ArrayList<>();
	
	abstract void attach(Observer o);
	
	abstract void detach(Observer o);
	
	abstract void notifyObservers();
}
