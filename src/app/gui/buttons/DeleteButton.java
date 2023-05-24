package app.gui.buttons;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DeleteButton extends AbstractButton {
    public DeleteButton(String text, JTextField textField) {
        super(text, textField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String del = getTextField().getText().trim();
        if (del.length() < 1) return;
        getTextField().setText(del.substring(0, del.length() - 1).trim());

    }
}
