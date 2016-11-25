package tp2;

import java.awt.event.ActionListener;
import java.util.Observer;

import javax.swing.*;

public abstract class TemperatureVue implements Observer {
	private String label ;
	protected TemperatureModel model ;
	protected TemperatureController controller ;
	private JFrame temperatureJFrame ;
	private JTextField display = new JTextField ();
	private JButton upJButton = new JButton ( " + " );
	private JButton downJButton = new JButton ( " -" );
	TemperatureVue ( String label , TemperatureModel model ,
			TemperatureController controller , int posX , int posY ) {
		this.label = label ;
		this.model = model ;
		this.controller = controller ;
		temperatureJFrame = new JFrame ( label );
		temperatureJFrame.add( new JLabel ( label ) , BorderLayout.NORTH );
		temperatureJFrame.add( display , BorderLayout.CENTER );
		JPanel panelbuttons = new JPanel ();
		panelbuttons.add ( downJButton );
		panelbuttons.add ( upJButton );
		temperatureJFrame.add ( panelbuttons , BorderLayout.SOUTH );
		temperatureJFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		model.addObserver ( this ); // Connexion entre la vue et le modele
		temperatureJFrame.setSize (200 ,100);
		temperatureJFrame.setLocation ( posX , posY );
		temperatureJFrame.setVisible ( true );
	}
	public void setDisplay ( String s ) {
		display . setText ( s );
	}
	public void enableWarningColor () {
		display . setBackground ( Color . RED );
	}

	public void disableWarningColor () {
		display . setBackground ( Color . WHITE );
	}
	public double getDisplay () {
		double result = 0.0;
		try {
			result = Double . valueOf ( display . getText ()). doubleValue ();
		}
		catch ( Nu mberF ormatE xcept ion e ){}
		return result ;
	}
	public void addDisplayListener ( ActionListener a ){ display . addActionListe ner ( a );}
	public void addUpListener ( ActionListener a ){ upJButton . addActionListener ( a );}
	public void addDownListener ( ActionListener a ){ downJButton . addActionListe ner ( a );}
	protected TemperatureModel model (){
		return model ;
	}
}
