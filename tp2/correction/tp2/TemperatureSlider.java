package tp2;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class TemperatureSlider extends TemperatureController implements Observer {
	protected TemperatureModel model ;
	protected TemperatureController controller ;
	private JFrame sliderJFrame;
	private JSlider slider;


	public TemperatureSlider(TemperatureModel model, TemperatureController controller) {
		super(model);
		this.model = model;
		this.controller = controller;
		this.slider = new JSlider(-30,100,(int)model.getC());
		slider.setOrientation(JSlider.VERTICAL);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(new ChangeListener() {

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
		slider.setValue((int) model.getC());
	}

}
