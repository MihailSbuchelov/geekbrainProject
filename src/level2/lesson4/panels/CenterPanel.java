package level2.lesson4.panels;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class CenterPanel {

    private JPanel panel;
    private JTextArea lines;

    public CenterPanel(JTextArea lines) {
        panel = new JPanel();
        this.lines = lines;
        init();
    }

    public JPanel getPanel() {
        return panel;
    }

    private void init() {
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.setLayout(new BorderLayout());
        panel.add(lines);
    }
}
