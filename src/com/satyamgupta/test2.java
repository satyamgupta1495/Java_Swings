package com.satyamgupta;

import javax.swing.*;
import java.awt.*;

public class test2 extends JFrame {

   JLabel label;
   JProgressBar bar;
    test2() {

        label = new JLabel();
        label.setBounds(0,0,500,50);

        label.setOpaque(true);

        bar  = new JProgressBar();
        bar.setStringPainted(true);
        bar.setValue(0);
        bar.setBounds(0,0,500,50);
        bar.setForeground(Color.BLACK);
        bar.setBackground(Color.WHITE);


        this.add(bar);
        this.add(label);

        this.setLayout(null);
        this.setPreferredSize(new Dimension(500,500));
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        fill();
    }

    public void fill() {
        int count = 0;
        while (count <= 100) {
            bar.setValue(count);
            try {

                Thread.sleep(50);

            } catch (InterruptedException e) {

            }
            count += 1;
        }
        bar.setString("DONEEEEE!");
    }
    public static void main(String[] args) {
        test2 t  = new test2() ;
    }
}
