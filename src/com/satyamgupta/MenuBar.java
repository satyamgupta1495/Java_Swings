package com.satyamgupta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuBar extends JFrame implements ActionListener {

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;


    MenuBar(){
//-------------------THIS WILL MAKE A BOJECT OF  A MENUBAR ON THE TOP--------------------------------------------------
        JMenu fileMenu = new JMenu("FILE");
        JMenu editMenu = new JMenu("EDIT");
        JMenu helpMenu = new JMenu("HELP");

//-------------------THIS WILL SET A KEYBOARD SHORTCUT FOR THE ITEMS-------------------------------------
        fileMenu.setMnemonic(KeyEvent.VK_F);
        editMenu.setMnemonic(KeyEvent.VK_E);
        helpMenu.setMnemonic(KeyEvent.VK_H);

//-------------------THIS WILL SET A KEYBOARD SHORTCUT FOR THE ITEMS-------------------------------------
        JMenuBar menuBar = new JMenuBar();

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        loadItem = new JMenuItem("LOAD");
        saveItem = new JMenuItem("SAVE");
        exitItem = new JMenuItem("EXIT");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

//        SET KEYBOARD SHORTCUTS-------------------------------------------------
        loadItem.setMnemonic(KeyEvent.VK_L);        //l FOR LOAD
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);



        this.setJMenuBar(menuBar);
        this.setLayout(null);          //we have to use bounds because we are using flowlayout
        this.setSize(550, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent e){
        if(e.getSource() == loadItem){
            System.out.println("LOADING FILE...");
        }
        else  if(e.getSource() == saveItem){
            System.out.println("SAVING FILE...");
        }
        else  if(e.getSource() == exitItem){
            System.out.println("EXITING");
            System.exit(0);
        }
    }


    public static void main(String[] args) {
        MenuBar menu = new MenuBar();
    }
}
