
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    JButton b1,b2;
    String username;
    //Constructor
    Rules(String username){
        this.username = username;
        setBounds(600,200,800,650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel(" Welcome "+ username +" to Simple Learn ");
        l1.setForeground(new Color(30,144,255));
        l1.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        l1.setBounds(50,20,700,30);
        add(l1);
        
        JLabel l2 = new JLabel("Rules");
        l2.setFont(new Font("Tahoma",Font.PLAIN,16));
        l2.setBounds(20,90,600,350);
        l2.setText(
            "<html>"+
                  "1. In these Quizz."+"<br><br>"+
                  "2. Don't get Nervous"+"<br><br>"+
                  "3. You get 20 Seconds for answer."+"<br><br>"+
                  "4. You hava 50-50 lifeline."+"<br><br>"+
                  "5. If you cannot answer in 30 second.Next Question will Display Automatic."+"<br><br>"+
                  "6. There is no negative marking for Wrong answer."+"<br><br>"+
                  "7. Your Marks will display after completition of Quizz."+"<br><br>"+
            "<html>"
        );
        add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(250,500,100,30);
        b1.setBackground(new Color(30,144,255));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Start");
        b2.setBounds(400,500,100,30);
        b2.setBackground(new Color(30,144,255));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new SimpleLearn().setVisible(true);
        }else if(ae.getSource()==b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }
    public static void main(String args[]){
        new Rules("");
    }
}
