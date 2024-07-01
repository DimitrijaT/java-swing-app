package org.example.mvc_example2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View {
    private JFrame frame;
    private JTextField textField;
    private JButton updateButton;
    private JLabel label;
    private JCheckBox checkBox;
    private JList<String> list;
    private DefaultListModel<String> listModel;

    public View() {
        frame = new JFrame("Swing MVC Example");
        textField = new JTextField(20);
        updateButton = new JButton("Update");
        label = new JLabel("Current Text:");
        checkBox = new JCheckBox("Check me");
        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(textField);
        panel.add(updateButton);
        panel.add(label);
        panel.add(checkBox);
        panel.add(new JScrollPane(list));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.add(panel);
        frame.setVisible(true);
    }

    public String getTextFieldText() {
        return textField.getText();
    }

    public void setLabelText(String text) {
        label.setText("Current Text: " + text);
    }

    public boolean isCheckBoxChecked() {
        return checkBox.isSelected();
    }

    public void setCheckBoxChecked(boolean checked) {
        checkBox.setSelected(checked);
    }

    public void addListItem(String item) {
        listModel.addElement(item);
    }

    public void addUpdateListener(ActionListener listener) {
        updateButton.addActionListener(listener);
    }

    public void addCheckBoxListener(ActionListener listener) {
        checkBox.addActionListener(listener);
    }
}
