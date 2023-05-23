package app.gui.buttons;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class EqualButton extends AbstractButton {
    public EqualButton(String text, JTextField textField) {
        super(text, textField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (getTextField().getText().isEmpty()) return;

        String result = String.valueOf(split(getTextField().getText()));
        if (result.endsWith(".0")) {
            getTextField().setText(result.substring(0, result.lastIndexOf(".")));
            return;
        }

        getTextField().setText(String.format("%.2f", Double.parseDouble(result)));

    }

    private double split(String str) {
        str = str.replaceAll("," ,".");

        String[] strings = str.split(" ");

        return equAction(Double.parseDouble(strings[0]), Double.parseDouble(strings[2]), strings[1]);
    }


    private double equAction(double num1, double num2, String op) {
        double result = 0;

        switch (op) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
        }

        return result;
    }
}
