package led_project;

import java.awt.Color;

import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
	
	private ImageIcon bg;
	private JLabel myLabel;


	JFrame fr;
	JLabel lbl_heading,lbl_username,lbl_password;
	JTextField txt_username;
	JPasswordField txt_password;
	JButton btn_login, btn_cancel,btn_reg;
	Font fon1,fon2;
	
	public Login() {
		
		bg = new ImageIcon(this.getClass().getResource("/customer_regis.png"));
		myLabel = new JLabel(bg);
		myLabel.setSize(450,400);
	
		fr=new JFrame("Login Page");
		fr.add(myLabel);
		
		
		fon1=new Font("arial",Font.BOLD,20);
		fon2=new Font("arial",Font.BOLD,16);
		
		lbl_heading=new JLabel("Login Credentials");
		lbl_heading.setForeground(Color.pink);
		lbl_heading.setFont(fon1);
		lbl_heading.setBounds(170,10,200,30);
		myLabel.add(lbl_heading);
		
		lbl_username=new JLabel("Username");
		lbl_username.setForeground(Color.yellow);
		lbl_username.setFont(fon1);
		lbl_username.setBounds(50,50,150,40);
		myLabel.add(lbl_username);
		
		txt_username=new JTextField();
		txt_username.setFont(fon2);
		txt_username.setBounds(155, 50, 220, 40);
		myLabel.add(txt_username);
		
		lbl_password=new JLabel("password");
		lbl_password.setForeground(Color.yellow);
		lbl_password.setFont(fon1);
		lbl_password.setBounds(50,100,100,40);
		myLabel.add(lbl_password);
		
		txt_password=new JPasswordField();
		txt_password.setFont(fon2);
		txt_password.setBounds(155, 100, 220, 40);
		myLabel.add(txt_password);
		
		
		btn_login=new JButton("login");
		btn_login.setFont(fon2);
		btn_login.setBounds(155, 150, 90, 40);
		btn_login.addActionListener(this);
		myLabel.add(btn_login);
		
		btn_cancel=new JButton("Cancel");
		btn_cancel.setFont(fon2);
		btn_cancel.setBounds(250, 150, 90, 40);
		btn_cancel.addActionListener(this);
		myLabel.add(btn_cancel);
		
		btn_reg=new JButton("Sign_up");
		btn_reg.setForeground(Color.red);
		btn_reg.setFont(fon2);
		btn_reg.setBounds(320, 220, 100, 30);
		btn_reg.addActionListener(this);
		myLabel.add(btn_reg);
		
		fr.setSize(450,300);
		fr.setLayout(null);
		fr.setVisible(true);
		fr.setResizable(false);
		fr.setLocationRelativeTo(null);
		
		
	}
	
	
	
	public static void main(String[] args) {
		new Login();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		 if((e.getSource()==btn_cancel)) {
				
			 System.exit(0);
				
		 }
		if(e.getSource()==btn_reg) {
			new Register();
			
			fr.setVisible(false);
		}
		
		else if((e.getSource()==btn_login)){
			
			String usrname= txt_username.getText();
			String pass= txt_password.getText();
			
			if(usrname.equals("") || pass.equals("")) {
				
				JOptionPane.showMessageDialog(fr,"Please fill both the fields!!");
				
			}
			
				else if((usrname.equals("rubi") && pass.equals("rubi11")) || (usrname.equals("ram") && pass.equals("ram7"))) {
				
				JOptionPane.showMessageDialog(fr,"Welcome you are logged in sucessfully");
				new TTT1();
				
				}else {
			
					JOptionPane.showMessageDialog(fr,"Sorry!! Invalid Id or password");
			
				}
		
	
	}
}
	
}
