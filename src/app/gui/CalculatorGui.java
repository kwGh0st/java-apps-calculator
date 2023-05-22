package app.gui;

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


        frame.add(textField);
        frame.setVisible(true);
    }
}
