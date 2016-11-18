package tp1;

import java.util.ArrayList;

public abstract class Subject {
	
	ArrayList<Observer> list = new ArrayList<>();
	
	void attach(Observer o){
		list.add(o);
	}
	
	void detach(Observer o){
		list.add(o);
	}
	
	void notifyObservers(){
		for(Observer o : list){
			o.update();
		}
	}
}
