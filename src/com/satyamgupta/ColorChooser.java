package com.satyamgupta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooser extends JFrame implements ActionListener {


    JButton button;
    JLabel label;


    ColorChooser(){

        button = new JButton("CHOOSE COLOR");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.darkGray);
        label.setForeground(Color.white);
        label.setOpaque(true);
        label.setText("THIS IS A TEXT !");
        label.setFont(new Font("cascadia code", Font.BOLD,50));


        this.add(label);
        this.add(button);
        this.setLayout(new FlowLayout());          //we have to use bounds because we are using flowlayout
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()== button) {
            JColorChooser choosecolor = new JColorChooser();

            Color color = JColorChooser.showDialog(null,"CHOOSE YOUR COLOR",Color.BLACK);

//            label.setForeground(color);
            label.setBackground(color);
        }
    }

    public static void main(String[] args) {

        ColorChooser color = new ColorChooser();
    }


}
