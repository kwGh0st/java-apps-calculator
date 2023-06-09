package app.gui;

import app.gui.buttons.*;

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

        JButton addButton = new AddButton("+", textField);
        JButton subtractButton = new SubtractButton("-", textField);
        JButton multiplyButton = new MultiplyButton("*", textField);
        JButton divideButton = new DivideButton("/", textField);
        JButton decimalButton = new DecimalButton(".", textField);
        JButton equalButton = new EqualButton("=", textField);
        JButton clearButton = new ClearButton("Clear", textField);
        JButton deleteButton = new DeleteButton("Delete", textField);
        JButton negativeButton = new NegativeButton("(-)", textField);

        deleteButton.setBounds(50, 450, 145, 50);
        clearButton.setBounds(205, 450, 145, 50);


        JButton[] functionButtons = new JButton[9];
        functionButtons[0] = addButton;
        functionButtons[1] = subtractButton;
        functionButtons[2] = multiplyButton;
        functionButtons[3] = divideButton;
        functionButtons[4] = decimalButton;
        functionButtons[5] = equalButton;
        functionButtons[6] = clearButton;
        functionButtons[7] = deleteButton;
        functionButtons[8] = negativeButton;

        for (JButton button : functionButtons) {
            button.setFont(font);
            button.setFocusable(false);
        }

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subtractButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(multiplyButton);
        panel.add(decimalButton);
        panel.add(numberButtons[0]);
        panel.add(equalButton);
        panel.add(divideButton);
        panel.add(negativeButton);

        frame.add(deleteButton);
        frame.add(clearButton);
        frame.add(panel);
        frame.add(textField);
        frame.setVisible(true);
    }
}
