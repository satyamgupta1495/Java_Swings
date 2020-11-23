package com.satyamgupta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Filechooser extends JFrame implements ActionListener {

    JButton button;

    Filechooser(){


        button = new JButton("Select file");
        button.addActionListener(this);


        this.add(button);
        this.setLayout(new FlowLayout());          //we have to use bounds because we are using flowlayout
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==button){


            JFileChooser file1 = new JFileChooser();

            file1.setCurrentDirectory(new File("."));

            //int response  = file1.showOpenDialog(null); //SELECT FILE TO OPEN
            int response  = file1.showSaveDialog(null); //SAVE A  FILE



            if (response == JFileChooser.APPROVE_OPTION){
                File file = new File(file1.getSelectedFile().getAbsolutePath());
                System.out.println(file1);

            }
        }
    }

    public static void main(String[] args) {
     Filechooser file =  new Filechooser() ;


    }
}
