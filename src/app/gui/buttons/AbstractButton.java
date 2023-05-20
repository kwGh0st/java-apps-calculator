package app.gui.buttons;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class AbstractButton extends JButton implements ActionListener {
    private final JTextField textField;

    public AbstractButton(String text, JTextField textField) {
        super(text);
        this.textField = textField;
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (textField.getText().isEmpty() || textField.getText().endsWith(" ")) return;

        String field = textField.getText();
        field = field.concat(" ").concat(this.getText()).concat(" ");
        textField.setText(field);
    }

    public JTextField getTextField() {
        return textField;
    }
}
