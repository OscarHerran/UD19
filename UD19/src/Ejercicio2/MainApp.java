package Ejercicio2;

import java.awt.EventQueue;

import Ejercicio2.ListaPeliculas;

public class MainApp {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaPeliculas frame = new ListaPeliculas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}