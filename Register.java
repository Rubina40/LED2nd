package led_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register extends JFrame implements ActionListener{

	
	JFrame fr;
	JLabel lbl_heading,lbl_fname,lbl_lname,lbl_email,lbl_password,lbl_confirm;
	JTextField txt_fname,txt_lname,txt_email;
	JPasswordField txt_password,txt_confirm;
	JButton btn_create;
	Font fon1,fon2;
	
public Register() {
	fr=new JFrame("Registration Page");
	fr.getContentPane().setBackground(Color.pink);
	
	fon1=new Font("arial",Font.BOLD,24);
	fon1=new Font("Times new roman",Font.BOLD,18);
	
	lbl_heading=new JLabel("Create Account");
	lbl_heading.setForeground(Color.red);
	lbl_heading.setFont(fon1);
	lbl_heading.setBounds(170,10,200,30);
	fr.add(lbl_heading);
	
	lbl_fname=new JLabel("Fullname:");
	lbl_fname.setForeground(Color.blue);
	lbl_fname.setFont(fon1);
	lbl_fname.setBounds(50,50,150,40);
	fr.add(lbl_fname);
	
	txt_fname=new JTextField();
	txt_fname.setFont(fon2);
	txt_fname.setBounds(200, 50, 200, 30);
	fr.add(txt_fname);
	
	lbl_lname=new JLabel("Username:");
	lbl_lname.setForeground(Color.blue);
	lbl_lname.setFont(fon1);
	lbl_lname.setBounds(50,90,150,40);
	fr.add(lbl_lname);
	
	txt_lname=new JTextField();
	txt_lname.setFont(fon2);
	txt_lname.setBounds(200, 90, 200, 30);
	fr.add(txt_lname);
	
	lbl_email=new JLabel("Email:");
	lbl_email.setForeground(Color.blue);
	lbl_email.setFont(fon1);
	lbl_email.setBounds(50,130,150,40);
	fr.add(lbl_email);
	
	txt_email=new JTextField();
	txt_email.setFont(fon2);
	txt_email.setBounds(200, 130, 200, 30);
	fr.add(txt_email);
	
	lbl_password=new JLabel("password:");
	lbl_password.setForeground(Color.blue);
	lbl_password.setFont(fon1);
	lbl_password.setBounds(50,170,150,40);
	fr.add(lbl_password);
	
	txt_password=new JPasswordField();
	txt_password.setFont(fon2);
	txt_password.setBounds(200, 170, 200, 30);
	fr.add(txt_password);
	
	lbl_confirm=new JLabel("Retype password:");
	lbl_confirm.setForeground(Color.blue);
	lbl_confirm.setFont(fon1);
	lbl_confirm.setBounds(50,210,170,40);
	fr.add(lbl_confirm);
	
	txt_confirm=new JPasswordField();
	txt_confirm.setFont(fon2);
	txt_confirm.setBounds(200, 210, 200, 30);
	fr.add(txt_confirm);
	
	btn_create=new JButton("Create");
	btn_create.setFont(fon2);
	btn_create.setBounds(120, 270, 170, 40);
	btn_create.addActionListener(this);
	fr.add(btn_create);
	
	fr.setSize(450,400);
	fr.setLayout(null);
	fr.setVisible(true);
	fr.setResizable(false);
	fr.setLocationRelativeTo(null);
	
	}

	public static void main(String[] args) {
	new Register();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String full_name=txt_fname.getText();
		String username=txt_lname.getText();
		String pass=txt_password.getText();
		
		
		if(e.getSource()==btn_create) {
			Dboperation db= new Dboperation();
			String query = "insert into usr_tbl(full_name, username, pass) values('"+full_name+"','"+username+"', '"+pass+"')";
			int ans=db.insert(query);
			
			if(ans>0) {
				JOptionPane.showMessageDialog(fr, "user created sucessfully");
			}
		}
	}
}
