package tp2;

import java.awt.BorderLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;

public class TemperatureSlider extends TemperatureController implements Observer {

	protected TemperatureModel model ;
	protected TemperatureController controller ;
	private JFrame sliderJFrame;
	private JSlider slider;


	TemperatureSlider(TemperatureModel m,TemperatureController c){
		super(m);
		this.model = model;
		this.controller = c;

		slider = new JSlider(-10,50,(int)model.getC());		
		slider.setOrientation(JSlider.VERTICAL);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(1);

		// je sais pas trop ce que ça fait...
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);

		public void stateChanged(ChangeEvent e) {
			slideChange();

		}
	});
	sliderJFrame = new JFrame("Slider");
	sliderJFrame.add(this.slider);
	sliderJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	model.addObserver(this);
	sliderJFrame.setSize(200, 400);
	sliderJFrame.setVisible(true);


}


public void slideChange() {
	controller.fixeDegresC(slider.getValue());
}

@Override
public void update(Observable o, Object arg) {
	// TODO Auto-generated method stub

}



}
