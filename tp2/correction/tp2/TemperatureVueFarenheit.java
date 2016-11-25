package tp2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

public class TemperatureVueFarenheit extends TemperatureVue {
	

	public TemperatureVueFarenheit (TemperatureModel model, TemperatureController controller , int posX , int posY ) {
		super ("Temperature Faranheit",model , controller , posX , posY );
		
		setDisplay(""+ model . getF());
		addUpListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				controller.augmenteDegresF();
			}});
		
		addDownListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				controller.diminueDegresF ();
			}});
		
		addDisplayListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				double tempC = getDisplay();
				controller.fixeDegresC (tempC);
			}});
	}
	public void update ( Observable s, Object o) {
		setDisplay (""+ model.getF());
		controller.control();
	}

}
