package led_project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TTT1 extends JFrame implements ActionListener {
	
	private ImageIcon bg;
	private JLabel myLabel;
	
    JLabel lb1,lb2;  
    JTextArea ta;  
    JButton b, back;  
    JButton pad,text;
    Font fon;
    public TTT1(){  
    	super("Count your words!!");  
    	bg = new ImageIcon(this.getClass().getResource("/bgphoto.png"));
		myLabel = new JLabel(bg);
		myLabel.setSize(450,400);
		
		fon=new Font("arial",Font.BOLD,16);
     
        lb1=new JLabel("Characters: ");  
        lb1.setBounds(50,50,120,20); 
        lb1.setFont(fon);
        lb2=new JLabel("Words: ");  
        lb2.setBounds(50,80,100,20);
        lb2.setFont(fon);
          
        ta=new JTextArea();  
        ta.setBounds(50,110,320,200);  
          
        b=new JButton("click");  
        b.setBounds(50,320, 80,30);//x,y,w,h  
        b.addActionListener(this); 
        
        back=new JButton("back");
        back.setBounds(0,0,100,30);
        back.addActionListener(this);
      
        pad=new JButton("Pad Color");  
        pad.setBounds(140,320, 110,30);//x,y,w,h  
        pad.addActionListener(this);  
  
        text=new JButton("Text Color");  
        text.setBounds(260,320, 110,30);//x,y,w,h  
        text.addActionListener(this);  
  
        add(lb1);add(lb2);add(ta);add(b); add(back);add(pad);add(text);add(myLabel);  
          
        setSize(450,400);  
        setLayout(null);//using no layout manager 
        setVisible(true);
        setResizable(false);
		setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    public void actionPerformed(ActionEvent e){  
        if(e.getSource()==b){  
        String text=ta.getText();  
        lb1.setText("Characters: "+text.length());  
        String words[]=text.split("\\s");  
        lb2.setText("Words: "+words.length);  
        }else if(e.getSource()==pad){  
            Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLACK);  
            ta.setBackground(c);  
        }else if(e.getSource()==text){  
            Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLACK);  
            ta.setForeground(c);  
        }else if (e.getSource()==back) {
        	
        	new Login();
        	setVisible(false);
        }
    }  
public static void main(String[] args) {  
    new TTT1();  
}
public void actionPerformed1(ActionEvent e) {
	// TODO Auto-generated method stub
	
}}





