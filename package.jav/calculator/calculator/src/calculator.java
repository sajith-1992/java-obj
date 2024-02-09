
    import java.awt.Color;

import javax.swing.*;  

public class calculator{
    
    calculator(){
        JFrame jf=new JFrame("calculator"); 
        jf.setLayout(null);
        jf.setSize(300,400);
        jf.setLocation(100,100);

        JLabel screen=new JLabel("hello");
        screen.setBounds(20,40,250,40);
        screen.setBackground(Color.BLUE);
        screen.setOpaque(true);
        screen.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(screen);
        
        
        JButton b7=new JButton("7");
        b7.setBounds(10,100,50, 50);
        jf.add(b7);
        
        JButton b8=new JButton("8");
        b8.setBounds(80,100,50, 50);
        jf.add(b8);
        
        JButton b9=new JButton("3");
        b9.setBounds(160,100,50, 50);
        jf.add(b9);

        JButton b4=new JButton("4");
        b4.setBounds(10,180,50, 50);
        jf.add(b4);


        JButton b5=new JButton("5");
        b5.setBounds(80,180,50, 50);
        jf.add(b5);

        JButton b6=new JButton("6");
        b6.setBounds(160,180,50, 50);
        jf.add(b6);


        JButton b3=new JButton("3");  
        b3.setBounds(10,260,50, 50);
        jf.add(b3);



        JButton b2=new JButton("2");
        b2.setBounds(80,260,50, 50);
        jf.add(b2);

         JButton b1=new JButton("1");
        b1.setBounds(160,260,50, 50);
        jf.add(b1);

        JButton star=new JButton("*");
        star.setBounds(10,320,50, 50);
        jf.add(star);

        JButton zero=new JButton("0");
        zero.setBounds(80,320,50, 50);
        jf.add(zero);

        /*JButton =new JButton("*");
        multiply.setBounds(160,320,50, 50);
        jf.add(multiply);*/


        JButton div=new JButton("/");
        div.setBounds(230,100,50, 50);
        jf.add(div);


        JButton subtractionbutton=new JButton("-");
        subtractionbutton.setBounds(230,180,50, 50);
        jf.add(subtractionbutton);


        JButton additionbutton=new JButton("+");
        additionbutton.setBounds(230,260,50, 50);
        jf.add(additionbutton);

      


        jf.setVisible(true);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) throws Exception {
     new calculator();
    }
}

    
