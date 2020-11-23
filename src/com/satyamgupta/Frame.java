package com.satyamgupta;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;

public class Frame extends JFrame {

    public static void main(String[] args) {
    JFrame frame = new JFrame();

    ImageIcon image1 = new ImageIcon("snorlax.png");
    frame.getContentPane().setBackground(Color.ORANGE); //set background color
    frame.getContentPane().setBackground(new Color(25,45,41));
    frame.getContentPane().setBackground(new Color(0xffd800));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setSize(400,400);


    frame.setResizable(false);


    frame.setLayout(null);

    frame.setVisible(true);


    //imp AND ONLY TO BE USED IN LAST AFTER ADDING ALL THE COMPONENTS IN FRAME
    //frame.pack();

    ImageIcon image = new ImageIcon("ashok.png");
    frame.setIconImage(image.getImage());

    }

}
