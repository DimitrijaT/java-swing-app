package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JFrame = a GUI window to add components to

        /*
        In the example below we created a JFrame and gave it changes using .set...
        The other alternative is to create a class that extends JFrame and then create an object of that class
         */

        JFrame frame = new JFrame("Hello world!");
        frame.setTitle("JFrame Title Rewritten"); // changes the frame title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false); // makes the frame non-resizable
        frame.setSize(1000, 1000);

        ImageIcon image = new ImageIcon("src/main/resources/logo.png");
        frame.setIconImage(image.getImage()); // change the icon of the frame
        frame.getContentPane().setBackground(new Color(123, 50, 250));
        // == Set layout manager ==
//        frame.setLayout(null); // this means we can use absolute positioning

        // == Using a class that extends JFrame ==
//        MyFrame myFrame = new MyFrame();
//        new MyFrame();

        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);

        // JLabel = a GUI display area for a string of text, an image, or both
        // == Create a Label ==
        JLabel label = getLabel(border);
        frame.add(label);

        frame.setVisible(true); // makes the frame visible
        frame.pack(); // resizes the frame so all components are at their preferred sizes
    }

    private static JLabel getLabel(Border border) {
        JLabel label = new JLabel();
        label.setText("Java Swing GUI Application");

        ImageIcon labelImage = new ImageIcon("src/main/resources/kiimo.png");
        label.setIcon(labelImage);
        label.setHorizontalTextPosition(JLabel.CENTER); // sets text LEFT, CENTER, RIGHT
        label.setVerticalTextPosition(JLabel.TOP); // sets text TOP, CENTER, BOTTOM
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(100);

        // These 2 go together
        label.setBackground(Color.BLACK);
        label.setOpaque(true);

        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // sets vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // sets horizontal position of icon+text within label

        // == Set Bounds, works only if layout is set to null ==
//        label.setBounds(100, 100, 500, 500); // sets x, y, width, height of label
        return label;
    }
}

