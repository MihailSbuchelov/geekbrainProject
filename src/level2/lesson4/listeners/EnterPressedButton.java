package level2.lesson4.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnterPressedButton implements ActionListener {
    private JTextArea massages;
    private JTextField textMassage;

    public EnterPressedButton(JTextArea massages, JTextField textMassage) {
        this.massages = massages;
        this.textMassage = textMassage;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        StringBuilder sb = new StringBuilder(massages.getText());
        sb.append(textMassage.getText()).append("\n");
        massages.setText(sb.toString());
        textMassage.setText("");
    }
}
