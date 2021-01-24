package level2.lesson4.panels;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TopPanel {
    private JPanel jPanel;

    public TopPanel() {
        this.jPanel = new JPanel();
        init();
    }


    public JPanel getPanel() {
        return jPanel;
    }

    private void init() {
        jPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));

        jPanel.setLayout(new GridLayout(1, 2));

        jPanel.add(initBarMenu());

    }

    private JMenuBar initBarMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Меню");
        menuBar.add(fileMenu);
        JMenuItem exitItem = new JMenuItem("Выход");
        exitItem.addActionListener(TopPanel::actionPerformed);
        fileMenu.add(exitItem);

        JMenu about = new JMenu("О программе");
        menuBar.add(about);

        return menuBar;
    }

    private static void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
