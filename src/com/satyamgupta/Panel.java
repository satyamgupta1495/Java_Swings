package com.satyamgupta;

import javax.swing.*;
import java.awt.*;

public class Panel extends JFrame {

    public static void main(String[] args) {

      Panel p = new Panel();
    }

    public Panel() {
        JFrame frame = new JFrame("THIS IS A FRAME");
        JLabel label = new JLabel("THIS IS A LABEL");
        label.setForeground(Color.white);
        JTextField t1 = new JTextField("ENTER YOUR TEXT HERE");
        JButton b1, b2, b3;
        b1 = new JButton("BUTTON 1");
        b2 = new JButton("BUTTON 2");
        b3 = new JButton("BUTTON 3");

        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(t1);
        panel.add(label);
        panel.setLayout(new FlowLayout());

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.red);
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(t1);
        panel2.add(label);
        panel2.setLayout(new FlowLayout());


        frame.add(panel);
        frame.add(panel2);

        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
