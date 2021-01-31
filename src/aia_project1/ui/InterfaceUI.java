package aia_project1.ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class InterfaceUI extends JFrame {
	public InterfaceUI() {
		setTitle("UI");
		addWindowListener(new WindowAdapter() {
	         @Override
	         public void windowClosing(WindowEvent e) {
	            dispose();
	         }
	    });
	 
        setSize(350,500);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
	}
	
	public static void main(String[] args) {
		new InterfaceUI();
	}
}
