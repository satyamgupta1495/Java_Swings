package com.satyamgupta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouselistener extends JFrame  implements MouseListener {

    JLabel label = new JLabel();
    
    Mouselistener(){


        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(500,500));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
    }

    public static void main(String[] args) {
        Mouselistener m = new Mouselistener() ;}

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("YOU CLICKED ME");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("YOU PRESSED ME");
        label.setBackground(Color.BLUE);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("YOU RELEASED ME");
        label.setBackground(Color.green);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("YOU ENTERED INTO COMPONENTS IN ME");
        label.setBackground(Color.yellow);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("YOU EXITED INTO COMPONENTS IN ME");
        label.setBackground(Color.red);
    }
}
