package tp1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RadioTchat {

	JFrame f1 = new JFrame();
	JTextArea ta1 = new JTextArea("Hello World Every Body");
	JTextField tf1 = new JTextField("valeur par default");
	JButton boutton = new JButton("nouvel utilisateur");
	
	
	public RadioTchat(){

		JPanel p1 = new JPanel();

		p1.setLayout(new BorderLayout());
		
		tf1.setPreferredSize(new Dimension(150,30)); 
		tf1.setForeground(Color.BLUE); //met une couleur bleu à l'écriture
		
		
		//On ne peut plus ecrire dans le text area
		ta1.setEditable(false);
		
		p1.add("Center",ta1);
		p1.add("South",tf1);
		p1.add("North",boutton);

		f1.getContentPane().add(p1);
						
		f1.pack();
		// setSize, mettre toujours après le pack
		f1.setSize(300,500);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLocationRelativeTo(null);
	}

	
	private void pause(){
		try {

		      Thread.sleep(1000);

		    } catch (InterruptedException e) {

		      e.printStackTrace();

		    }
	}
	
	public static void main(String[] args) {
		new RadioTchat();
	}
}
