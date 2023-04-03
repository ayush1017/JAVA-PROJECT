package Quiz_Application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz_main extends JFrame implements ActionListener{
 String questions[][] = new String[6][5];
 String answers[][] = new String[6][2];
 String useranswers[][] = new String[6][1];
 JLabel qno, que;   
JButton b1,next,Submit;
JRadioButton op1,op2,op3,op4;
ButtonGroup grp;
public static int ans_given = 0;
public static int count = 0;
public static int score = 0;
String name;
 Quiz_main(String name)
{
    this.name=name;
    setBounds(50, 0, 1440, 850);//Setting the background
    setVisible(true);//Default visibility hidden 
    getContentPane().setBackground(Color.BLUE);//changing the color of  the background
    setLayout(null);

    ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Icons/Quiz.jpg"));
    JLabel image= new JLabel(i1);
    image.setBounds(0, 0, 1440, 392);
    add(image);

     qno=new JLabel();
    qno.setBounds(100, 450, 50, 30);
    qno.setForeground(Color.WHITE);
    qno.setFont(new Font("Tahema", Font.PLAIN, 20));
    add(qno);


     que=new JLabel();
    que.setBounds(150, 450 , 900, 30);
    que.setForeground(Color.WHITE);
    que.setFont(new Font("Tahema", Font.PLAIN, 24));
     qno.setForeground(Color.WHITE);
    add(que);
   //QUESTIONS
   
   questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
   questions[0][1] = "JVM";
   questions[0][2] = "JDB";
   questions[0][3] = "JDK";
   questions[0][4] = "JRE";

   questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
   questions[1][1] = "int";
   questions[1][2] = "Object";
   questions[1][3] = "long";
   questions[1][4] = "void";

   questions[2][0] = "Which package contains the Random class?";
   questions[2][1] = "java.util package";
   questions[2][2] = "java.lang package";
   questions[2][3] = "java.awt package";
   questions[2][4] = "java.io package";

   questions[3][0] = "An interface with no fields or methods is known as?";
   questions[3][1] = "Runnable Interface";
   questions[3][2] = "Abstract Interface";
   questions[3][3] = "Marker Interface";
   questions[3][4] = "CharSequence Interface";

   questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
   questions[4][1] = "Stack";
   questions[4][2] = "String memory";
   questions[4][3] = "Random storage space";
   questions[4][4] = "Heap memory";

   questions[5][0] = "Which of the following is a marker interface?";
   questions[5][1] = "Runnable interface";
   questions[5][2] = "Remote interface";
   questions[5][3] = "Readable interface";
   questions[5][4] = "Result interface";

   answers[0][1] = "JDB";
   answers[1][1] = "int";
   answers[2][1] = "java.util package";
   answers[3][1] = "Marker Interface";
   answers[4][1] = "Heap memory";
   answers[5][1] = "Remote interface";


    //RadioButtons
     op1= new JRadioButton();
     op1.setBounds(170, 520, 700, 30);
     op1.setBackground(Color.BLUE);
     op1.setFont(new Font("Tahema", Font.PLAIN, 15));
     op1.setForeground(Color.WHITE);
     add(op1);

     op2= new JRadioButton();
     op2.setBounds(170, 560, 700, 30);
     op2.setBackground(Color.BLUE);
     op2.setFont(new Font("Tahema", Font.PLAIN, 15));
     op2.setForeground(Color.WHITE);
     add(op2);

     op3= new JRadioButton();
     op3.setBounds(170, 600, 700, 30);
     op3.setBackground(Color.BLUE);
     op3.setFont(new Font("Tahoma", Font.PLAIN, 15));
     op3.setForeground(Color.WHITE);
     add(op3);

     op4= new JRadioButton();
     op4.setBounds(170, 640, 700, 30);
     op4.setBackground(Color.BLUE);
     op4.setFont(new Font("Tahoma", Font.PLAIN, 15));
     op4.setForeground(Color.WHITE);
     add(op4);
    //Grouping the radiobuttons
      grp=new ButtonGroup();
     grp.add(op1);
     grp.add(op2);
     grp.add(op3);
     grp.add(op4);


      next= new JButton("Next");
      next.setBounds(1100,700,200,40);
      next.setBackground(Color.RED);
      next.setFont(new Font("Tahoma", Font.PLAIN, 15));
      next.setForeground(Color.WHITE);
      next.addActionListener(this);
      add(next);

      Submit= new JButton("Submit");
      Submit.setBounds(1100,750,200,40);
      Submit.setBackground(Color.RED);
      Submit.setFont(new Font("Tahoma", Font.PLAIN, 15));
      Submit.setForeground(Color.WHITE);
      Submit.setEnabled(false);
      Submit.addActionListener(this);
      add(Submit);

     



     start(count);

    
}
//Onclick Event of next  Button 
public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == next) { 
        repaint();
        op1.setEnabled(true);
            op2.setEnabled(true);
            op3.setEnabled(true);
            op4.setEnabled(true);
        ans_given = 1;
        if (grp.getSelection() == null) {
           useranswers[count][0] = "";
        } else {
            useranswers[count][0] = grp.getSelection().getActionCommand();
            
        }


       count++;
       start(count);
        
        
        if (count == 5) {
            next.setEnabled(false);
            Submit.setEnabled(true);
        }

        
}
else if (ae.getSource() == Submit) {
    ans_given = 1;
    if (grp.getSelection() == null) {
        useranswers[count][0] = "";
    } else {
        useranswers[count][0] = grp.getSelection().getActionCommand();
    }

    for (int i = 0; i < useranswers.length; i++) {
        if (useranswers[i][0].equals(answers[i][1])) {
            score += 10;
        } else {
            score += 0;
        }
    }
    setVisible(false);
  //  new Score(username, score);

}
        
}   
 
//Putting the question in the interface
public void start(int count) {
    qno.setText("" + (count + 1) + ". ");
    que.setText(questions[count][0]);
    op1.setText(questions[count][1]);
   op1.setActionCommand(questions[count][1]);
    
    op2.setText(questions[count][2]);
    op2.setActionCommand(questions[count][2]);
    
    op3.setText(questions[count][3]);
    op3.setActionCommand(questions[count][3]);
    
    op4.setText(questions[count][4]);
    op4.setActionCommand(questions[count][4]);
    
    grp.clearSelection();
}
 
    public static void main(String args[])
    {
        new Quiz_main(" ");
    }
}
