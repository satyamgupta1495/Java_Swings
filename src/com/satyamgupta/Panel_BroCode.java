//PANEL ACTS AS A CONTAINER WHICH HOLDS OTHER COMPONENTS !++

package com.satyamgupta;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import javax.swing.border.Border;

public class Panel_BroCode {
    public static void main(String[] args) {

        JLabel l1,l2,l3,label;

        //dont use new here !
        Border border =  BorderFactory.createLineBorder(new Color(0x0e0c17),3);

        ImageIcon image = new ImageIcon("snorlax.png");

        label = new JLabel();
        label.setIcon(image);
        label.setText("Hello World");
        label.setBorder(border);
        label.setLayout(null);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,50,50);   //this define the actual position oof the elements in the panel (MARGING PADDING)



        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);

        l1 = new JLabel("THIS IS RED'S AREA");
        l1.setForeground(Color.BLACK);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(0,250,250,250);

        l2 = new JLabel("THIS IS BLUE'S AREA");
        l2.setForeground(Color.BLACK);

        JPanel yellowpanel = new JPanel();
        yellowpanel.setBackground(Color.yellow);
        yellowpanel.setBounds(250,0,250,500);

        l3 =new JLabel("THIS IS YELLOW'S AREA");
        l3.setForeground(Color.BLACK);




        JFrame frame = new JFrame();

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(600,600);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(redPanel);
        redPanel.add(l1);

        frame.add(bluepanel);
        bluepanel.add(l2);

        frame.add(yellowpanel);
        yellowpanel.add(l3);
        yellowpanel.setLayout(new BorderLayout());    //if u want to MOVE ANY ELEMENTS within panel u have to set this
        yellowpanel.add(label);


    }
}
