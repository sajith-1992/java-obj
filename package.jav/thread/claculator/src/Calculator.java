import java.awt.Color;

import javax.swing.*;  

public class Calculator {
    
    Calculator(){
        JFrame jf=new JFrame("calculator"); 
        jf.setLayout(null);
        jf.setSize(300,400);
        jf.setLocation(100,100);

        JLabel screen=new JLabel("hello");
        screen.setBounds(5,50,200,50);
        screen.setBackground(Color.BLUE);
        screen.setOpaque(true);
        jf.add(screen);
        
        
        JButton b1=new JButton("1");
        b1.setBounds(10,100,50, 50);
        jf.add(b1);
        JButton b2=new JButton("2");
        b2.setBounds(80,100,50, 50);
        jf.add(b2);
        JButton b3=new JButton("3");
        b3.setBounds(160,100,50, 50);
        jf.add(b3);

        
        jf.setVisible(true);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) throws Exception {
     new Calculator();
    }
}
