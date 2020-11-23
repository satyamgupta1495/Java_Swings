package com.satyamgupta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checkbx extends JFrame implements ActionListener {

    JButton button;
    JCheckBox cbox;
    ImageIcon gicon;
    ImageIcon ricon;

    Checkbx() {


        gicon = new ImageIcon("snorlax.png");
        ricon = new ImageIcon("pokeball.png");


        cbox = new JCheckBox();
        cbox.setText("I AM NOT ROBOT");
        cbox.setFocusable(false);
        cbox.setIcon(gicon);            //CHANGE THE CHECKBOX ICON
        cbox.setSelectedIcon(ricon);    //CHANGE THE BORING SQUARE BOX OF CHECKBOX WITH IMAGE
        cbox.setFont(new Font("cascadia code", Font.PLAIN,32));



        button = new JButton();
        button.setText("SUBMIT");
        button.addActionListener(this);

        this.add(button);
        this.setSize(500, 300);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(cbox);
        this.setVisible(true);


    }

    public static void main(String[] args) {
        Checkbx box = new Checkbx();
    }

 public void actionPerformed(ActionEvent e){
        if (e.getSource() == button){
            System.out.println(cbox.isSelected());
        }
    }
}