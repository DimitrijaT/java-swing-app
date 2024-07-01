package org.example.mvc_example2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        // Add listeners for view components
        this.view.addUpdateListener(new UpdateListener());
        this.view.addCheckBoxListener(new CheckBoxListener());

        // Add property change listeners to model
        this.model.addPropertyChangeListener(new ModelChangeListener());
    }

    // Listener for update button
    class UpdateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model.setText(view.getTextFieldText());
        }
    }

    // Listener for checkbox
    class CheckBoxListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model.setChecked(view.isCheckBoxChecked());
        }
    }

    // Listener for model changes
    class ModelChangeListener implements PropertyChangeListener {
        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            switch (evt.getPropertyName()) {
                case "text":
                    view.setLabelText((String) evt.getNewValue());
                    view.addListItem((String) evt.getNewValue());
                    break;
                case "checked":
                    view.setCheckBoxChecked((Boolean) evt.getNewValue());
                    break;
            }
        }
    }
}
