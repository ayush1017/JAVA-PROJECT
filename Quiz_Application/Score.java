package Quiz_Application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;
import java.lang.ProcessBuilder;



public class Score extends JFrame implements ActionListener{

    JButton play;
    String name;
    int score;
    
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

     play= new JButton("Play Again");
        play.setBounds(500, 210, 200, 30);
        play.setFont(new Font("Tahoma", Font.PLAIN, 26));
        play.setBackground(Color.GREEN);
        play.addActionListener(this);
        add(play);



 ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Icons/log2.jpg"));
        JLabel image= new JLabel(i1);
        image.setBounds(0, 0, 950, 850);
        add(image);

       

        if(score==60)
        {
           try{
            ProcessBuilder pb=new ProcessBuilder("C:\\Program Files\\Windows Media Player\\wmplayer.exe", "C:\\Users\\Ayush Singh\\Downloads\\W.mp4");
            pb.start();
           }catch(IOException e)
           {
            e.printStackTrace();
           }
        }
        else if(score==50)
        {
            JOptionPane.showMessageDialog(score1, "Wah Kya Baat hai you won  6 lakhs 40 thousand");
        }
        else if(score==40)
        {
            JOptionPane.showMessageDialog(score1, "Wah Kya Baat hai you won  3 lakhs 60 thousand");
        }
        else if(score==30)
        {
            JOptionPane.showMessageDialog(score1, "Wah Kya Baat hai you won  40 thousand");
        }
        else if(score==20)
        {
            JOptionPane.showMessageDialog(score1, "Wah Kya Baat hai you won  10,000");
        }
        else
        {
            JOptionPane.showMessageDialog(score1, "DURBHAGYA WARSH AAP DHANRASHI NAHI PRAPT KARPAYE!!");
        }
        



    
        


          
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==play)
        {
            setVisible(false);
            new Quiz_login();
            
       
        }
       
       

    }
    public static void main(String arg[])
    {
        new Score(" ", 0);
    }
}
