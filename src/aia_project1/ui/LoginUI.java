package aia_project1.ui;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import aia_project1.objects.User;

@SuppressWarnings("serial")
public class LoginUI extends JFrame {
   // 패널
   JPanel Main = new JPanel();
   JPanel South = new JPanel();
   
   // 라벨
   JLabel lbl1 = new JLabel("프로그램 이름");
   JLabel lbl2 = new JLabel("ID : ");
   JLabel lbl3 = new JLabel("Pwd : ");
   JLabel fail = new JLabel("Login Failed");
   
   // 버튼
   JButton btn1 = new JButton("Login");
   JButton btn2 = new JButton("Sign UP");
   JButton btn3 = new JButton("Search ID");
   
   // 텍스트
   JTextField txt1 = new JTextField();
   JTextField txt2 = new JTextField();
   
   public LoginUI() {
      addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            dispose();
            System.exit(0);
         }
      });
      
      setTitle("Project");
      setSize(350,500);
      setLayout(null);
      setResizable(false);
      setLocationRelativeTo(null);

      // Main 패널 설정
      Main.setLayout(null);
      Main.setBackground(Color.white);
      Main.setBounds(1, 1, 332, 397);
      
      // 라벨 설정
      lbl1.setBounds(50, 50, 100, 20);
      lbl2.setBounds(50, 300, 50, 20);
      lbl3.setBounds(36, 350, 50, 20);
      
      // 텍스트 설정
      txt1.setBounds(70, 300, 220, 25);
      txt2.setBounds(70, 350, 220, 25);
      
      // 버튼 설정
      btn1.setBounds(60, 17, 65, 30);
      btn2.setBounds(125, 17, 78, 30);
      btn3.setBounds(203, 17, 90, 30);
      
      //버튼 이벤트 핸들러:
      BtnEvtHandler hndl = new BtnEvtHandler(this);
      btn1.addActionListener(hndl);
      btn2.addActionListener(new PopUps(this, "Sign Up", true));
      btn3.addActionListener(hndl);
      
      
      
      Main.add(lbl1);
      Main.add(lbl2);
      Main.add(lbl3);
      Main.add(txt1);
      Main.add(txt2);
      
      
      
      // South 패널 설정
      South.setLayout(null);
      South.setBackground(Color.gray);
      South.setBounds(1, 400, 332, 61);
      
      South.add(btn1);
      South.add(btn2);
      South.add(btn3);
      
      
      
      
      add(Main);
      add(South);
   }
   
   public static void main(String[] args) {
      new LoginUI().setVisible(true);
   }
}
class BtnEvtHandler  implements ActionListener{
	LoginUI pushed;
	JButton clicked;
	User user;
	public BtnEvtHandler(LoginUI pushed) {
		this.pushed = pushed;
		this.user = new User();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		clicked = (JButton)e.getSource();
		
		if(clicked.equals(pushed.btn1)) {
			System.out.println("visited");
			String id = pushed.txt1.getText();
			String pwd = pushed.txt2.getText();
			System.out.println("id: "+id+" pwd: "+pwd);
			if(user.login(id, pwd)) {
				new InterfaceUI();
			}else {
				
			}
		}else if(clicked.equals(pushed.btn3)) {
			System.out.println("ID/PWD look up visited");
		}
	}
}