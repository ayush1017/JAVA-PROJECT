package Quiz_Application;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//it acts as an interface so in inter face you have to overwride abstract method of an interface 

public class Quiz_login extends JFrame implements ActionListener{
    JButton b;
    JLabel name;
   JTextField t;
    Quiz_login()
    {
        getContentPane().setBackground(Color.WHITE);//Setting the color of the background   
       // setSize(1200, 600);//Set the size of the frame 
       // setLocation(200,150);
       setBounds(200, 150, 1200, 600);
        setVisible(true);//Visibility of frame is by default hidden
        //Creating your own layout
        setLayout(null);

        // creating the headings 
    JLabel head= new JLabel("WELCOME TO KBC QUIZ ");
    head.setBounds(850, 100, 300, 35);
    head.setFont(new Font("Mongolian Baiti", Font.BOLD, 19));// giving fonts to the text
    add(head);
    //Text field
     name= new JLabel("Enter your name ");
    name.setBounds(870, 200, 300, 20);
    name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));// giving fonts to the text
    add(name);

    //Buttons
    b= new JButton("Start");
    b.setBounds(820, 300, 120, 25);
    b.addActionListener(this);
    add(b);

    t = new JTextField();
    t.setBounds(820, 250, 300, 25 );
    t.setFont(new Font("Times New Roman", Font.BOLD, 20));
    t.setVisible(true);
    add(t);

     // placing the image
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Icons/log31.jpg"));
        JLabel image= new JLabel(i1);
        add(image);
        image.setBounds(0, 0, 700, 600);
    

  
    
   
}
public void actionPerformed(ActionEvent ae) 
{
    if(ae.getSource() == b)
    {
        String name= t.getText();
        {
            setVisible(false);
            new Quiz_main(name);
        }
        
    } 

}
    public static void main(String[] args)
    {
        new Quiz_login();
    }

    
}
