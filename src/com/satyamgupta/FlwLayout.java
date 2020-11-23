package com.satyamgupta;

import javax.swing.*;
import java.awt.*;

public class FlwLayout extends JFrame {
    public static void main(String[] args) {


        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));  //SET BORDER MARGIN
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());
        

        panel.add(new JButton("B1"));
        panel.add(new JButton("B2"));
        panel.add(new JButton("B3"));
        panel.add(new JButton("B4"));
        panel.add(new JButton("B5"));
        panel.add(new JButton("B6"));
        panel.add(new JButton("B7"));
        panel.add(new JButton("B8"));
        panel.add(new JButton("B9"));


        frame.add(panel);
        frame.setVisible(true);
    }
}
