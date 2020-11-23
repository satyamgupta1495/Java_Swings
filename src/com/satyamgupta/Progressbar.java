package com.satyamgupta;
import  java.awt.*;
import  javax.swing.*;



public class Progressbar {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();
    JLabel label;


    Progressbar() {
        bar.setBounds(0,0,420,50);
        bar.setValue(0);
        bar.setForeground(Color.PINK);
        bar.setBackground(Color.WHITE);

        label =new JLabel("LOADING.....");
        label.setBounds(100,50,420,50);
        label.setFont(new Font("cascadia code", Font.BOLD,25));
        label.setForeground(Color.PINK);


        bar.setStringPainted(true);     //set the percentage bar in the progress bar
        bar.setFont(new Font("cascadia code", Font.BOLD,25));

        frame.add(bar);
        frame.add(label);
        frame.setLayout(null);          //we have to use bounds because we are using flowlayout
        frame.setSize(420, 420);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        fill();
    }


    public void fill() {
        int counter = 0;
        while (counter <= 100) {
            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter += 1;

        }
        bar.setString("DONE :)");
    }


    public static void main(String[] args) {
        Progressbar bar = new Progressbar();
    }
}
