package app.gui.buttons;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DecimalButton extends AbstractButton {

    public DecimalButton(String text, JTextField textField) {
        super(text, textField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        getTextField().setText(getTextField().getText().concat(String.valueOf(getText())));
    }
}
