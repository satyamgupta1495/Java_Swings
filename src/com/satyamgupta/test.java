package com.satyamgupta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test extends JFrame implements ActionListener {

    JFrame frame;
    JLabel label;
    JButton button, button2;

    test(){

        label = new JLabel("THIS IS A DEMO TEXT");
        label.setBackground(Color.DARK_GRAY);
        label.setOpaque(true);
        label.setFont(new Font("cascadia code", Font.BOLD,35));

        button = new JButton("Choose your TEXT color");
        button.setFocusable(false);
        button.addActionListener(this);

        button2 = new JButton("Choose your BG color");
        button2.setFocusable(false);
        button2.addActionListener(this);

        frame = new JFrame();
        frame.add(label);
        frame.add(button);
        frame.add(button2);

        frame.setLayout(new FlowLayout());
        frame.setPreferredSize(new Dimension(420,420));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }

    public static void main(String[] args) {

        test t = new test();
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            JColorChooser color1 = new JColorChooser();
            Color color = JColorChooser.showDialog(null,"DEMOCOLOR",Color.BLACK);

            label.setBackground(color);

        }
        else if (e.getSource()==button2){
            JColorChooser color1 = new JColorChooser();
            Color color = JColorChooser.showDialog(null,"DEMOCOLOR",Color.BLACK);

            label.setForeground(color);
        }
    }
}
