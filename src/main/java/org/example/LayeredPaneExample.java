package org.example;

import javax.swing.*;
import java.awt.*;

public class LayeredPaneExample {

    public static void main(String[] args) {

        // JLayeredPane = Swing container that provides a third dimension for positioning components
        // e.g. depth, Z-index

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(150, 150, 200, 200);


        // Create the layered pane
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);

        // === There are 5 layers in JLayeredPane ===
        // DEFAULT_LAYER == Integer.valueOf(0);
        // PALETTE_LAYER == Integer.valueOf(100);
        // MODAL_LAYER == Integer.valueOf(200);
        // POPUP_LAYER == Integer.valueOf(300);
        // DRAG_LAYER == Integer.valueOf(400);

        // Add components to the layered pane
        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(2));
        layeredPane.add(label3, Integer.valueOf(1));

        // or
        // layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
        // layeredPane.add(label2, JLayeredPane.PALETTE_LAYER);
        // layeredPane.add(label3, JLayeredPane.MODAL_LAYER);


        JFrame frame = new JFrame("JLayeredPane Example");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
