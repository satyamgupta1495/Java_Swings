package com.satyamgupta;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons extends JFrame implements ActionListener  {


    JButton button = new JButton();

    JLabel label;


   Buttons(){

       ImageIcon image = new ImageIcon("snorlax.png");
       ImageIcon icon = new ImageIcon("snorlax.png");

       label = new JLabel();
       label.setIcon(icon);
       label.setBounds(450,250,450,450);
       label.setVisible(false);


       JButton button = new JButton();
       button = new JButton();
       button.setIcon(image);   //set image on button
       button.addActionListener(e -> System.out.println("b00!!"));  //USING LAMBDA FUNCTION
       button.setText("DON'T CLICK ME");
       button.setHorizontalTextPosition(JButton.CENTER);
       button.setVerticalTextPosition(JButton.BOTTOM);
       button.setFont(new Font("Cascadia code pl",Font.BOLD,15));
       button.setIconTextGap(-10);      //SET GAP BETWEEN TEXT AND IMAGE
       button.setForeground(new Color(0x0e0c17));
       button.setBackground(new Color(0xffd800));
       button.setFocusable(false); //remove annoying borderaround the buttons
       button.setBounds(100,200,300,150);
       button.setBorder(BorderFactory.createEtchedBorder());

       this.setLayout(null);
       this.setVisible(true);
       this.add(button);
       this.setSize(600,600);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       this.add(label);
   }


    //   IN PLACE OF THIS WE CAN USE LAMBDA FUNCTION-------------------------------------------------------
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println("BOO!");
            label.setVisible(true);
        }
    }
    public static void main(String[] args) {
        Buttons b = new Buttons();
    }


}
