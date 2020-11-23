package com.satyamgupta;

import  java.awt.*;
import  javax.swing.*;
import javax.swing.event.*;

public class JavaSlider implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    JavaSlider(){
        frame = new JFrame("Slider");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);

        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);

        slider.setOrientation(SwingConstants.VERTICAL);     //CHANGE THE ORIENTATION
        slider.addChangeListener(this);

        label.setText("Degree Celcius = "+ slider.getValue());

        panel.add(slider);
        panel.add(label);

        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public void stateChanged(ChangeEvent e){
        label.setText("Degree Celcius = "+ slider.getValue());
    }

    public static void main(String[] args) {
        JavaSlider slider = new JavaSlider();
    }
}
