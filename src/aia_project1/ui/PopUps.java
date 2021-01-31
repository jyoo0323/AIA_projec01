package aia_project1.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PopUps extends JDialog implements ActionListener {
	String title;
	JFrame parent;
	JPanel pan;
	
	public PopUps(JFrame owner, String title, boolean modal) {
		super(owner, modal);
		parent = owner;
		this.title = title;
	}
	
	private void signUpPop() {
		pan = new JPanel();
		setTitle(title);
		setSize(400,300);
		setResizable(false);
		setLocationRelativeTo(parent);
		setLayout(null);
		pan.setLayout(null);
		add(pan);
		pan.setBounds(0,0,399,299);
		pan.setBackground(Color.LIGHT_GRAY);
		JButton btn = new JButton("중복확인");
		JTextField id = new JTextField();
		JTextField pwd = new JTextField();
		JLabel msg = new JLabel("Enter the ID");
		JLabel idlbl = new JLabel("ID :");
		JLabel pwdlbl = new JLabel("PWD :");
		pan.add(msg);
		pan.add(btn);
		pan.add(id);
		pan.add(pwd);
		pan.add(pwdlbl);
		pan.add(idlbl);
		idlbl.setBounds(20, 150, 20, 20);
	    pwdlbl.setBounds(5, 200, 35, 20);
		msg.setBounds(5,50, 200, 30);
		btn.setBounds(270, 150, 100, 30);
		id.setBounds(40, 150, 225, 25);
		pwd.setBounds(40, 200, 225, 25);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Sign UP")) {
			signUpPop();
			//remove(pan);
		}
		
	}

}
