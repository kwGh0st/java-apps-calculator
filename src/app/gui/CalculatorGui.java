package app.gui;

import app.gui.buttons.NumberButton;

import javax.swing.*;
import java.awt.*;

public class CalculatorGui {
    public CalculatorGui() {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(420, 550);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);

        Font font = new Font("Cambria Math", Font.BOLD, 25);

        JTextField textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(font);
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);

        JButton[] numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new NumberButton(String.valueOf(i), textField);
            numberButtons[i].setFont(font);
            numberButtons[i].setFocusable(false);
        }

        JPanel panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(5, 4, 5, 5));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(numberButtons[0]);

        frame.add(panel);
        frame.add(textField);
        frame.setVisible(true);
    }
}
