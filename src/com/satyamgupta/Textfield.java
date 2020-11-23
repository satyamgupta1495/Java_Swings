package com.satyamgupta;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Textfield extends JFrame implements ActionListener {

    JTextField textfield;
    JButton button;

    Textfield(){

        textfield = new JTextField();
        textfield.setPreferredSize(new Dimension(250,40));
        textfield.setFont(new Font("cascadia code", Font.PLAIN,32));
        textfield.setForeground(new Color(0xffd800));
        textfield.setBackground(new Color(0x0e0c17));
        textfield.setCaretColor(new Color(0xffd800));     //SET COLOR OF CURSOR
        textfield.setText("username");

        button = new JButton("SUBMIT");
        button.addActionListener(this);
        button.setFocusable(false);

        this.add(button);
        this.add(textfield);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() ==button){
            System.out.println("WELCOME " +textfield.getText());
        }
    }

    public static void main(String[] args) {

        Textfield text = new Textfield();
    }
}
