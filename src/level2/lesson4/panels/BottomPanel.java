package level2.lesson4.panels;

import level2.lesson4.listeners.EnterPressedButton;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class BottomPanel {
    private JPanel panel;
    private JTextArea massages;
    private JTextField textMassage;

    public BottomPanel(JTextArea lines) {
        textMassage = new JTextField();
        panel = new JPanel();
        initPanel(lines);
    }

    private void initPanel(JTextArea jTextArea) {
        this.massages = jTextArea;
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.setLayout(new GridLayout());
        JButton enterButton = new JButton("Отправить");
        enterButton.addActionListener(new EnterPressedButton(massages, textMassage));
        textMassage.addActionListener(new EnterPressedButton(massages, textMassage));
        panel.add(textMassage);
        panel.add(enterButton);
    }

    public JPanel getPanel() {
        return this.panel;
    }
}