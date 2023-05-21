package app.gui.buttons;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class NumberButton extends AbstractButton {

    public NumberButton(String text, JTextField textField) {
        super(text, textField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        getTextField().setText(getTextField().getText().concat(String.valueOf(this.getText())));
    }
}
