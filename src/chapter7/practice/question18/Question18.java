package chapter7.practice.question18;

import java.awt.*;
import java.awt.event.*;

public class Question18 {
    public static void main(String[] args) {
        Button button = new Button("Start");
        button.addActionListener(new EventHandler());
    }
}

class EventHandler implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent occurred.");
    }
}
