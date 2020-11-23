package com.satyamgupta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keylistner extends JFrame implements KeyListener {
   JFrame frame;
   JLabel label,label1,label2,label3;
   ImageIcon image,image1;
   JProgressBar bar;
   JPanel panel;

   Keylistner(){

       image = new ImageIcon("out/production/Java_Swings/com/satyamgupta/pokeball.png");
       image1 = new ImageIcon("out/production/Java_Swings/com/satyamgupta/snorlax.png");

       label = new JLabel();
       label.setBounds(0,0,100,100);
       //label.setBackground(Color.RED);
       //label.setOpaque(true);
       label.setIcon(image);

       label1 = new JLabel();
       label1.setIcon(image1);
       label1.setBounds(300,200,150,150);

       label2 = new JLabel("Snorlax was caught!!");
       label2.setBounds(0,100,500,100);
       label2.setForeground(Color.white);
       label2.setBackground(Color.RED);
       label2.setFont(new Font("cascadia code", Font.BOLD,35));
       label2.setOpaque(true);
       label2.setVisible(false);


       //==================progress bar================

       panel = new JPanel();
       panel.setBackground(Color.red);
       panel.setBounds(0,0,500,50);

//       label3 = new JLabel("CATCHING....");
//       label3.setBounds(100, 50, 420, 50);
//       label3.setFont(new Font("cascadia code", Font.BOLD, 25));
//       label3.setForeground(Color.PINK);
//       label3.setOpaque(true);
//       label3.setVisible(false);

       bar = new JProgressBar();
       bar.setBounds(0, 0, 500, 50);
       bar.setFocusable(false);
       bar.setValue(0);
       bar.setForeground(Color.PINK);
       bar.setBackground(Color.WHITE);
       bar.setStringPainted(true);     //set the percentage bar in the progress bar
       bar.setFont(new Font("cascadia code", Font.BOLD, 25));
       bar.setVisible(true);



       panel.add(bar);


       frame = new JFrame();




       frame.add(label2);
       frame.add(label);
       frame.add(label1);
       frame.addKeyListener(this);
       frame.setLayout(null);
       frame.setPreferredSize(new Dimension(500,500));
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       frame.add(panel);

       frame.setVisible(true);




       frame.pack();
       fill();

   }

    public void fill() {
        if (label.getX() == label1.getX() && label.getY() == label1.getY()) {
            int counter = 0;
            while (counter <= 100) {
                bar.setValue(counter);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                counter += 1;

            }

            bar.setString("Gotcha!!");

        }

    }

   public void keyTyped(KeyEvent e){
    switch (e.getKeyChar()){
        case 'a': label.setLocation(label.getX()-10,label.getY());
                    break;
        case 'w': label.setLocation(label.getX(),label.getY()-10);
                    break;

        case 's': label.setLocation(label.getX(),label.getY()+10);
                    break;
        case 'd': label.setLocation(label.getX()+10,label.getY());
            break;
    }
    }

   public void keyPressed(KeyEvent e) {
       switch (e.getKeyCode()) {
           case 37:
               //LEFT
               label.setLocation(label.getX() - 10, label.getY());
               break;
           case 38:
               //UP
               label.setLocation(label.getX(), label.getY() - 10);
               break;

           case 39:
               //RIGHT
               label.setLocation(label.getX()+ 10, label.getY() );
               break;
           case 40:
               //DOWN
               label.setLocation(label.getX() , label.getY()+ 10);
               break;
       }
       if (label.getX()==label1.getX() && label.getY()==label1.getY() ){


           //bar.setVisible(true);
           //bar.setOpaque(true);

           //label3.setVisible(true);

                fill();
           System.out.println("Snorlax was caught!!");
           label2.setVisible(true);


       }

   }
   public void keyReleased(KeyEvent e){
       //IT IS CALLED WHENEVER A BUTTON IS RELEASED
       //System.out.println("You releases ker character: "+ e.getKeyChar());
       System.out.println("You releases ker code: "+ e.getKeyCode());
   }






        public static void main(String[] args) {

       Keylistner key = new Keylistner();


    }
}
