

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton Start, back;
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + "to Simple Minds");
        heading.setBounds(50, 20, 700, 35);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 18));
        heading.setForeground( new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel("Welcome " + name + "to Simple Minds");
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 12));
        rules.setText(
        "<html>"+
          "1. Only team entries are allowed, and team shall consist of two persons. There is not limit of teams from single institution." + "<br><br>" +
          "2. The decision of the quiz-master will be final and will not be subjected to any change." + "<br><br>" +
          "3. The participants shall not be allowed to use mobile or other electronic instruments during the quiz time." + "<br><br>"+
          "4. The questions shall be in the form of multiple choice, true/false statement, specific answer question etc." + "<br><br>"+
          "5. Audience/Supporters shall not give any hints or clues to the competitors." + "<br><br>" +
          "6. Replacement of any participant of a team is not allowed after registration." +"<br><br>"+        
        "</html>"
         );         
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        Start = new JButton("Start");
        Start.setBounds(400, 500, 100, 30);
        Start.setBackground(new Color(30, 144, 254));
        Start.setForeground(Color.WHITE);
        Start.addActionListener(this);
        add(Start);
        
        setLocation(350, 100);
        setSize(700, 600);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== Start){
        setVisible(false);
        new Quiz(name);
        }else{
        setVisible(false);
        new Login();
     }        
        
    }
    
    public static void main(String[] args){
     new Rules("User");
    }
    
}
