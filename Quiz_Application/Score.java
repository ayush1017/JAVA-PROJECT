package Quiz_Application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener{

    JButton play;
    
     Score(String name, int score)
    {
        setBounds(450, 0, 950, 850);//Setting the background
    setVisible(true);//Default visibility hidden 
    getContentPane().setBackground(Color.white);//changing the color of  the background
    setLayout(null);

    JLabel heading = new JLabel("Thankyou !! " + name + " For playing KBC ONLINE Quiz.");
        heading.setBounds(380, 30, 700, 30 );
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        heading.setForeground(Color.WHITE);
        add(heading); 

        JLabel score1= new JLabel("Your Score is :"+score);
    score1.setBounds(500, 150, 700, 30);
        score1.setFont(new Font("Tahoma", Font.PLAIN, 26));
        score1.setForeground(getForeground());
        score1.setForeground(Color.WHITE);
        add(score1);

        JButton play= new JButton("Play Again");
        play.setBounds(500, 210, 200, 30);
        play.setFont(new Font("Tahoma", Font.PLAIN, 26));
        play.addActionListener(this);
        play.setBackground(Color.GREEN);
        add(play);



 ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Icons/log2.jpg"));
        JLabel image= new JLabel(i1);
        image.setBounds(0, 0, 950, 850);
        add(image);
        



    
        


          
    }
    public void actionPerformed(ActionEvent ae)
    {
    
        setVisible(false);
        new Quiz_login();
        
        

    
    }
    public static void main(String arg[])
    {
        new Score(" ", 0);
    }
}
