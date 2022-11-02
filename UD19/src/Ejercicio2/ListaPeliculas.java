package Ejercicio2;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;

public class ListaPeliculas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JComboBox <Object> comboBox;

	public ListaPeliculas() {
		
		setTitle("Peliculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel lblTitulo = new JLabel("Escribe el titulo de una pelicula");
		lblTitulo.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblTitulo);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setVgap(30);
		panel_1.add(panel_3);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		panel_3.add(textField);
		textField.setColumns(15);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnAdd = new JButton("Añadir");
		

		btnAdd.addActionListener(addPeli);
		panel_4.add(btnAdd);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel lblPelis = new JLabel("Peliculas");
		lblPelis.setHorizontalAlignment(SwingConstants.CENTER);
		lblPelis.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_2.add(lblPelis);
		
		JPanel panel_6 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_6.getLayout();
		flowLayout_1.setVgap(30);
		panel_2.add(panel_6);
		
		comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"K-pax"}));//PEL�CULA POR DEFECTO A MOSTRAR
		panel_6.add(comboBox);
		comboBox.addItem("God is not Dead");
		
	}
	
	//METODO QUE DEFINE EL ADHERIR EL OBJETO TEXTFIELD A LA LISTA
	ActionListener addPeli = new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			if (textField.getText().trim().length() > 0) {
				comboBox.addItem(textField.getText());
				
			}else {
				JOptionPane.showMessageDialog(contentPane, "Indique  Pelicula");
			}
			textField.setText(" ");	
		}
	};

}