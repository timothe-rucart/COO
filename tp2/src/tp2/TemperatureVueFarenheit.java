package tp2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

public class TemperatureVueFarenheit extends TemperatureVue {

	TemperatureVueFarenheit( TemperatureModel model, TemperatureController controller, int posX,int posY) {
		super("Temperature Farenheit",model, controller, posX, posY);
		setDisplay ( " " + model.getC ());
		
		addUpListener ( new ActionListener () {
			public void actionPerformed ( ActionEvent e ) {
				controller.augmenteDegresC ();
			}});
		
		
		addDownListener ( new ActionListener () {
			public void actionPerformed ( ActionEvent e ) {
				controller.diminueDegresC ();
			}});
		
		
		addDisplayListener ( new ActionListener () {
			public void actionPerformed ( ActionEvent e ) {
				double tempC = getDisplay ();
				controller . fixeDegresC ( tempC );
			}});
	}
	public void update ( Observable s , Object o ) {
		setDisplay ( " " + model (). getC ());
	}
}