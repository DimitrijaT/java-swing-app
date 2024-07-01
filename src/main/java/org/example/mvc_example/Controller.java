package org.example.mvc_example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        this.view.addUpdateListener(new UpdateListener());
    }

    class UpdateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.setText(view.getTextFieldText());
            view.setLabelText(model.getText());
        }
    }

}
