package com.satyamgupta;

import javax.swing.*;
import java.awt.*;

public class BdrLayout extends JFrame {
    public static void main(String[] args) {


        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout(10,10));  //SET BORDER MARGIN
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();


        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.blue);
        panel3.setBackground(Color.cyan);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.DARK_GRAY);

        //--------------------------SET BORDER WIDTH AND HEIGHT------------------------------------//
        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);


    }







}
