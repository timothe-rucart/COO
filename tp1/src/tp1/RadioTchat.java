package tp1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RadioTchat extends Subject{

	JFrame f1 = new JFrame("RadioTchat");
	JTextArea ta1 = new JTextArea();
	JTextField tf1 = new JTextField();
	JButton boutton = new JButton("nouvel utilisateur");
	JPanel p1 = new JPanel();
	private RadioTchat r =this;


	public RadioTchat(){		

		tf1.setPreferredSize(new Dimension(150,30)); 
		tf1.setForeground(Color.BLUE); //met une couleur bleu à l'écriture

		//On ne peut plus ecrire dans le text area
		ta1.setEditable(false);

		p1.setLayout(new BorderLayout());
		p1.add("Center",ta1);
		p1.add("South",tf1);
		p1.add("North",boutton);

		tf1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ta1.setText(ta1.getText()+tf1.getText()+"\n");
				notifyObservers();
				tf1.setText("");
			}
		});


		boutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				attach(new ConcreteObserver(r));
			}
		});





		f1.getContentPane().add(p1);						
		f1.pack();
		// setSize, mettre toujours après le pack
		f1.setSize(300,500);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLocationRelativeTo(null);
	}


	public String getField(){
		return tf1.getText();
	}

	public void setField(String s){
		tf1.setText(s);
		ta1.setText(ta1.getText()+tf1.getText()+"\n");
		notifyObservers();
		tf1.setText("");
	}

}
