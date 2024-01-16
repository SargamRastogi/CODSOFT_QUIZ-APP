package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    JButton Start,Back;
    String name;
    Rules(String name ) {
        this.name = name ;
        JLabel heading = new JLabel("Welcome" + name + "to QUIZ TEST");
        heading.setBounds(150,100,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,36));
        heading.setForeground(new Color(0,0,0));
        add(heading);
        JLabel rules = new JLabel();
        rules.setBounds(70,150,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setForeground(new Color(0,0,0));
        rules.setText(
                "<html>"+
                        "1. Only Single participation is allowed." + "<br><br>" +
                        "2. The medium of the questions will be only English." + "<br><br>" +
                        "3.You only have 15 seconds to answer the question."  + "<br><br>" +
                        "4, No cell phones or other secondary devices is allowed in the room or test area." + "<br><br>"
        );
        add(rules);
         Back = new JButton("Back");
         Back.setBounds(300,500,100,30);
         Back.setBackground(new Color(22,99,30));
         Back.setForeground(Color.WHITE);
         Back.addActionListener(this);
         add(Back);
        Start = new JButton("Start");
        Start.setBounds(450,500,100,30);
        Start.setBackground(new Color(22,99,30));
        Start.setForeground(Color.WHITE);
        Start.addActionListener(this);
        add(Start);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/back.png"));
        Image i = i1.getImage().getScaledInstance(800,650,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(0,0,800,650);
        add(image);
        setSize(800,650);
     setLocation(350,100);
     setLayout(null);
     setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
 if(e.getSource() == Start){
setVisible(false);
new Quiz (name);
 }else {
 setVisible(false);
 new Login();
 }
    }

    public static void main(String[] args) {
new Rules("User");
    }
}

