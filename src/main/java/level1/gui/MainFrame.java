package level1.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class MainFrame extends JFrame {
    private BigDecimal result;
    private String lastCommand;
    private String pastArgument;

    public MainFrame() {
        setTitle("Calculator");
        setBounds(100, 100, 300, 500);
        setLayout(new BorderLayout());

        result = BigDecimal.ZERO;
        lastCommand = "=";

        JPanel top = new JPanel();
        add(top, BorderLayout.CENTER);
        top.setLayout(new GridLayout(4, 3));
        JPanel bottom = new JPanel();
        add(bottom, BorderLayout.SOUTH);
        bottom.setLayout(new BorderLayout());

        JTextField inputField = new JTextField();
        DigitButtonListener digitButtonListener = new DigitButtonListener(inputField);
        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(digitButtonListener);
            top.add(btn);
        }

        JButton add = new JButton("+");
        add.addActionListener(new CommandAction(inputField));
        top.add(add);
        JButton minus = new JButton("-");
        minus.addActionListener(new CommandAction(inputField));
        top.add(minus);
        JButton multiple = new JButton("*");
        multiple.addActionListener(new CommandAction(inputField));
        top.add(multiple);
        JButton divide = new JButton("/");
        divide.addActionListener(new CommandAction(inputField));
        top.add(divide);
        JButton pow = new JButton("^");
        pow.addActionListener(new CommandAction(inputField));
        top.add(pow);
        JButton submit = new JButton("=");
        submit.addActionListener(new CommandAction(inputField));
        top.add(submit);

        bottom.add(inputField, BorderLayout.CENTER);
        JButton clear = new JButton("C");
        clear.addActionListener(new ClearButtonListener(inputField));
        bottom.add(clear, BorderLayout.EAST);

        new ClearButtonListener(inputField);
    }

    private class DigitButtonListener implements ActionListener {
        private JTextField inputField;

        public DigitButtonListener(JTextField inputField) {
            this.inputField = inputField;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            StringBuilder sb = new StringBuilder(inputField.getText());
            JButton btn = (JButton) e.getSource();
            sb.append(btn.getText());
            pastArgument = btn.getText();
            inputField.setText(sb.toString());
        }
    }

    private class CommandAction implements ActionListener {
        private JTextField inputField;

        public CommandAction(JTextField inputField) {
            this.inputField = inputField;
        }

        @Override
        public void actionPerformed(ActionEvent event) {
            String command = event.getActionCommand();
            if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/") || command.equals("^")) {
                lastCommand = command;
                result = new BigDecimal(inputField.getText());
                inputField.setText(inputField.getText() + command);
            } else {
                calculate();
                inputField.setText(result.toString());
            }
        }
    }

    private class ClearButtonListener implements ActionListener {
        private JTextField inputField;

        public ClearButtonListener(JTextField inputField) {
            this.inputField = inputField;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            inputField.setText("");
            result = BigDecimal.ZERO;
        }
    }

    private void calculate() {
        BigDecimal x = new BigDecimal(pastArgument);
        if (lastCommand.equals("+")) result = result.add(x);
        else if (lastCommand.equals("-")) result = result.subtract(x);
        else if (lastCommand.equals("*")) result = result.multiply(x);
        else if (lastCommand.equals("/")) result = result.divide(x);
        else if (lastCommand.equals("^")) result = result.pow(x.intValue());
    }

}