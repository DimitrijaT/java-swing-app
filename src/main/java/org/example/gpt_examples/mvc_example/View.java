package org.example.gpt_examples.mvc_example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View {
    private final JFrame frame;
    private final JTextField textField;
    private final JButton button;
    private final JLabel label;

    public View() {
        frame = new JFrame("MVC Example");
        textField = new JTextField(20);
        button = new JButton("Update!");
        label = new JLabel("Text:");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(textField);
        panel.add(button);
        panel.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.add(panel);
        frame.setVisible(true);
    }

    public String getTextFieldText() {
        return textField.getText();
    }

    public void setLabelText(String text) {
        label.setText("Text: " + text);
    }

    public void addUpdateListener(ActionListener listener) {
        button.addActionListener(listener);
    }


}
