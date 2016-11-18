package tp1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ConcreteObserver extends Observer{

	JFrame fenetre = new JFrame("auditeur");
	JPanel panel = new JPanel();
	JTextArea area = new JTextArea();
	JTextField field = new JTextField();
	private RadioTchat r;


	ConcreteObserver(RadioTchat r){
		this.r = r;
		panel.setLayout(new BorderLayout());
		panel.add("Center",area);
		panel.add("South",field);
				
		area.setEditable(false);


		field.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				r.setField(field.getText());
				field.setText("");
			}
		});

		fenetre.getContentPane().add(panel);
		
		fenetre.pack();
		fenetre.setSize(new Dimension(200,400));
		fenetre.setVisible(true);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setLocale(null);

	}


	@Override
	public void update() {
		area.setText(area.getText()+ r.getField() +"\n");
	}

	public RadioTchat getRadio(){
		return r;
	}
}
