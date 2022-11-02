package Ejercicio1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SaludoPersonalizado extends JFrame {

	private static final long serialVersionUID = 1L;

	//private JFrame frame; //ATRIBUTO FRAME SOBRE LA QUE SE EJECUTARAN LOS COMPONENTES
	private JPanel panel;
	
	private final int ANCHO = 600; // DIMENSIONES POR DEFECTO DEL FRAME
	private final int LARGO = 600;
	private JTextField text; // ATRIBUTO Jtext
	private JLabel label;
	private JButton boton;
	
	//CONSTRUCTOR POR DEFECTO
	public SaludoPersonalizado() {
		panel = new JPanel();
		this.text = new JTextField("");
		this.label = new JLabel("Cual es tu nombre");
		this.boton = new JButton("Decir Hola");
		label.setBounds(100, 80, 200, 30);
		text.setBounds(90, 140, 210,20);
		boton.setBounds(140, 220, 100, 20);
		boton.addActionListener(new ActionListener(){
		// ACCI�N DEFINIDA QUE EJECUTAR� EL BOTON DESDE EL CONSTRUCTOR
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola " + text.getText());	
			}
		});
		
		panel.add(label);
		panel.add(text);
		panel.add(boton);
		
		setVisible();
// LLAMA AL METODO PARA QUE SEA VISIBLE
	}
	
	public SaludoPersonalizado(String value) {
		this.text.setText(value);//ACTUALIZA EL VALOR DEL JTEXTFIELD
	}
	
	//METODO PARA HACER VISIBLE EL MARCO
	public void setVisible() {
		setTitle("Cambia letras");
		setBounds(400, 400, 400, 400);
		setContentPane(panel);
		panel.setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	
	//METODOS DE ACCESO

	
	public void setText(JTextField text) {
		this.text = text;
	}
	
	public JTextField getText() {
		return this.text;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	
}
