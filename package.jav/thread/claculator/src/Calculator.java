

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
        
        
        JButton b7=new JButton("7");
        b7.setBounds(10,100,50, 50);
        jf.add(b7);
        
        JButton b8=new JButton("8");
        b2.setBounds(80,100,50, 50);
        jf.add(b8);
        
        JButton b9=new JButton("3");
        b9.setBounds(160,100,50, 50);
        jf.add(b9);

        JButton b4=new JButton("4");
        b4.setBounds(10,180,50, 50);
        jf.add(b4);


        JButton b5=new JButton("5");
        b5.setBounds(80,180,50, 50);
        jf.add(b9);

        JButton b6=new JButton("6");
        b9.setBounds(160,180,50, 50);
        jf.add(b6);


        JButton button7=new JButton("4");
        button7.setBounds(10,260,50, 50);
        jf.add(button7);


        JButton button8=new JButton("5");
        button8.setBounds(80,260,50, 50);
        jf.add(button8);

         Button Button9=new JButton("6");
        Buttonb9.setBounds(160,260,50, 50);
        jf.add(buttonb9);


        


        jf.setVisible(true);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) throws Exception {
     new Calculator();
    }
}
