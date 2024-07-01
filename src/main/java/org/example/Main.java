package org.example;

public class Main {
    public static void main(String[] args) {
        // JFrame = a GUI window to add components to

        /*
        In the example below we created a JFrame and gave it changes using .set...
        The other alternative is to create a class that extends JFrame and then create an object of that class
         */

        /*
        JFrame frame = new JFrame("Hello world!");
        frame.setTitle("JFrame Title Rewritten"); // sets the frame title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes the frame when the close button is clicked

        frame.setResizable(false); // makes the frame non-resizable
        frame.setSize(300, 300); // sets the x-dimension and y-dimension of the frame

        frame.setVisible(true); // makes the frame visible

        ImageIcon image = new ImageIcon("src/main/resources/logo.png");
        frame.setIconImage(image.getImage()); // change the icon of the frame
        frame.getContentPane().setBackground(new Color(123, 50, 250)); // White
        */

        // == Using a class that extends JFrame ==
//        MyFrame myFrame = new MyFrame();
        new MyFrame();


    }
}

