package level2.lesson4;

import level2.lesson4.panels.BottomPanel;
import level2.lesson4.panels.CenterPanel;
import level2.lesson4.panels.TopPanel;

import javax.swing.*;
import java.awt.*;

public class MyChat extends JFrame {
    public MyChat() throws HeadlessException {
        setTitle("MyChat");
        setBounds(new Rectangle(50, 50, 1000, 600));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JTextArea lines = new JTextArea();
        lines.setEditable(false);

        JPanel top = new TopPanel().getPanel();
        JPanel bottom = new BottomPanel(lines).getPanel();
        JPanel center = new CenterPanel(lines).getPanel();

        add(center, BorderLayout.CENTER);
        add(top, BorderLayout.NORTH);
        add(bottom, BorderLayout.SOUTH);

        setVisible(true);
    }
}
