package com.satyamgupta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Radiobutton extends JFrame implements ActionListener {


    JRadioButton Pbutton;
    JRadioButton Hbutton;
    JRadioButton Hambutton;


    Radiobutton() {
        ImageIcon image = new ImageIcon("nuclear-sign.png");

        Pbutton = new JRadioButton("PIZZA");
        Pbutton.setIcon(image);
        Hbutton = new JRadioButton("HOTDOG");
        Hambutton = new JRadioButton("HAMBURGER");

        Pbutton.addActionListener(this);
        Hbutton.addActionListener(this);
        Hambutton.addActionListener(this);

        ButtonGroup group = new ButtonGroup();
        group.add(Hbutton);
        group.add(Pbutton);
        group.add(Hambutton);

        this.add(Pbutton);
        this.add(Hbutton);
        this.add(Hambutton);
        this.setSize(500, 300);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();


    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== Pbutton){
            System.out.println("YOU ORDERED PIZZA");
        }
        else if (e.getSource()==Hbutton){
            System.out.println("YOU ORDERED HOTDOG");
        }
        else if (e.getSource()==Hambutton){
            System.out.println("YOU ORDERED HAMBURGER");
        }
    }

    public static void main(String[] args) {
        Radiobutton button = new Radiobutton() ;}

}
