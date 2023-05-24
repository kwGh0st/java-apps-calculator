package app.gui.buttons;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class NegativeButton extends AbstractButton {
    public NegativeButton(String text, JTextField textField) {
        super(text, textField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = getTextField().getText().replaceAll(",", ".");
        double temp = Double.parseDouble(input);
        temp *= -1;

        if (String.valueOf(temp).endsWith(".0")) {
            getTextField().setText(String.valueOf(temp).substring(0, String.valueOf(temp).lastIndexOf(".")));
            return;
        }

        getTextField().setText(String.valueOf(temp));
    }
}
