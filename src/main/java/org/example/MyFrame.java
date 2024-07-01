package org.example;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {

        this.setTitle("JFrame Title Rewritten"); // sets title of frame
        // == Close Operation ==
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes the frame when the close button is clicked
        // == Set Size ==
        this.setResizable(false); // makes the frame non-resizable
        this.setSize(300, 300); // sets the x-dimension and y-dimension of the frame
        // == Set Layout ==
        this.setVisible(true); // makes the frame visible
        // == Change Icon ==
        ImageIcon image = new ImageIcon("src/main/resources/logo.png");
        this.setIconImage(image.getImage()); // change the icon of the frame
        // == Change Background Color ==
//        frame.getContentPane().setBackground(Color.green);
//        frame.getContentPane().setBackground(new Color(0, 0, 0)); // Black
//        frame.getContentPane().setBackground(new Color(255, 255, 255)); // White
//        frame.getContentPane().setBackground(new Color(0xFFFFFF)); // White
        this.getContentPane().setBackground(new Color(123, 50, 250)); // White


    }


}
