package org.example;

import javax.swing.*;
import java.awt.*;

public class PanelExample {
    public static void main(String[] args) {

        // JPanel = a GUI component that functions as a container to hold other components
        ImageIcon icon = new ImageIcon("src/main/resources/javaIcon.jpg");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        // only if we are using border layout
//        label.setVerticalAlignment(JLabel.BOTTOM);
//        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0, 0, 75, 75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);

        // Panels use FlowLayout by default
        redPanel.setLayout(new FlowLayout());

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(new BorderLayout());

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
