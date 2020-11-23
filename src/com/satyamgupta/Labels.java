package com.satyamgupta;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labels extends JFrame {



        public static void main(String[] args) {
            JFrame frame = new JFrame();
            JLabel label = new JLabel("Bro do u even code?");

            ImageIcon image1 = new ImageIcon("snorlax.png");

            Border border = BorderFactory.createLineBorder(Color.red,3); //set the border and takes 2 parameter color and border size

            label.setIcon(image1);

            label.setHorizontalTextPosition(JLabel.CENTER); //left, center, right of image icon
            label.setVerticalTextPosition(JLabel.TOP); //top, center, bottom
            label.setForeground(new Color(0x000000)); //set foregrounf color of text
            label.setFont(new Font("Cascadia code pl", Font.BOLD,30)); //set font
            label.setIconTextGap(50);    //set gap between text and image
            label.setBorder(border);
            //label.setBackground(Color.DARK_GRAY); //set label background
            label.setOpaque(true);    //to show the label backgroung color
            label.setVerticalAlignment(JLabel.CENTER);        //sets the alignment of text and image
            label.setHorizontalAlignment(JLabel.CENTER);      //sets the alignment of text and image
            // label.setBounds(0,50,400 ,250); //set the x, y position of label within the frame and height and width too


//    frame.getContentPane().setBackground(Color.ORANGE); //set background color
//    frame.getContentPane().setBackground(new Color(25,45,41))
            frame.getContentPane().setBackground(new Color(0xffd800));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //frame.setSize(400,400);


            //frame.setResizable(false);


            //frame.setLayout(null);


            frame.add(label);

            //imp AND ONLY TO BE USED IN LAST
            frame.pack();

            ImageIcon image = new ImageIcon("ashok.png");
            frame.setIconImage(image.getImage());
            frame.setVisible(true);

        }

    }

