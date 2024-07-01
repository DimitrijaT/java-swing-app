package org.example.mvc_example2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Model {
    private String text;
    private boolean checked;
    private PropertyChangeSupport support;

    public Model() {
        support = new PropertyChangeSupport(this);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        String oldText = this.text;
        this.text = text;
        support.firePropertyChange("text", oldText, text);
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        boolean oldChecked = this.checked;
        this.checked = checked;
        support.firePropertyChange("checked", oldChecked, checked);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }
}
