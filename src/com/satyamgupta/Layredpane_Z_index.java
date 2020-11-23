package com.satyamgupta;

import javax.swing.*;
import java.awt.*;

public class Layredpane_Z_index  extends JFrame {

    public static void main(String[] args) {


        JLabel label =new JLabel();
        label.setOpaque(true);
        label.setBackground(Color.RED);
        label.setBounds(50,50,200,200);


        JLabel label1 =new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.green);
        label1.setBounds(100,100,200,200);


        JLabel label3 =new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(150,150,200,200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);


//        layeredPane.add(label,JLayeredPane.DEFAULT_LAYER);          //position of stack layer z-index ki tarah hai ye
//        layeredPane.add(label1,JLayeredPane.DEFAULT_LAYER);
//        layeredPane.add(label3,JLayeredPane.DRAG_LAYER);

        //--------------OR------------------- YOU CAN USE NUMBER LIKE THIS----------------------------------
        layeredPane.add(label,Integer.valueOf(1));          //position of stack layer
        layeredPane.add(label1,Integer.valueOf(0));
        layeredPane.add(label3,Integer.valueOf(2));


        JFrame frame = new JFrame();
        frame.add(layeredPane);

        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
