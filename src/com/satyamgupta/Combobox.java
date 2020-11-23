package com.satyamgupta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Combobox extends JFrame implements ActionListener {

    JComboBox comboBox;
    Combobox(){

        String[] animals = {"Dog","Cat","Birds"};
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());
        //comboBox.addItem("Horse");
        //comboBox.insertItemAt("Pork",0);   //this add the item in combox at the certain index
        //comboBox.setSelectedIndex(0);           //this set the top most selected item
        //comboBox.removeItem("Pork");
        comboBox.removeAllItems();


        this.add(comboBox);
        this.setSize(500, 300);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();

    }


    public void actionPerformed(ActionEvent e){
        if(e.getSource()==comboBox){
//            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }

    }

    public static void main(String[] args) {
        Combobox box = new Combobox();
    }
}
