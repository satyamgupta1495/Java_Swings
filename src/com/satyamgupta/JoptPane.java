package com.satyamgupta;

import javax.swing.*;

public class JoptPane {
    public static void main(String[] args) {
      //  JOptionPane.showMessageDialog(null,"THIS IS TEXT","TITLE",JOptionPane.PLAIN_MESSAGE);
      //  JOptionPane.showMessageDialog(null,"THIS IS TEXT","TITLE",JOptionPane.INFORMATION_MESSAGE);
      //  JOptionPane.showMessageDialog(null,"THIS IS TEXT","TITLE",JOptionPane.QUESTION_MESSAGE);
      //  JOptionPane.showMessageDialog(null,"THIS IS TEXT","TITLE",JOptionPane.WARNING_MESSAGE);
      //  JOptionPane.showMessageDialog(null,"THIS IS TEXT","TITLE",JOptionPane.ERROR_MESSAGE);
      // System.out.println(JOptionPane.showConfirmDialog(null,"BRO do u even code?","This is a title",JOptionPane.YES_NO_CANCEL_OPTION));
      //  int answer = JOptionPane.showConfirmDialog(null,"BRO do u even code?","This is a title",JOptionPane.YES_NO_CANCEL_OPTION);

      // String name =  JOptionPane.showInputDialog("What is your name?");
      // System.out.println("Hello " + name);

        String[] response = {"No you are awesome","Thank you","Blush"};

         ImageIcon image = new ImageIcon("snorlax.png");
         JOptionPane.showOptionDialog(null,
                 "I AM AWESOME","SECRET MESSAGE",
                 JOptionPane.YES_NO_CANCEL_OPTION,
                 JOptionPane.INFORMATION_MESSAGE,image,response,0);

    }
}
