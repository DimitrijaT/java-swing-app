package org.example.open_new_window_example;

import javax.swing.*;

public class NewWindow {

    JFrame myFrame = new JFrame();

    public NewWindow() {
        myFrame.setSize(500, 500);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }

}
