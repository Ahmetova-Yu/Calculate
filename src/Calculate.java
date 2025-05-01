import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculate implements ActionListener {
    private JFrame frame;
    private JTextField field;
    private JTextField textField;
    private JButton[] numBut = new JButton[10];
    private JButton addBut, subBut, mulBut, divBut, equalBut, clearBut;
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public Calculate() {
        frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(345, 535);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 30);
        textField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        textField.setFont(new Font("Arial", Font.PLAIN, 30));
        textField.setEditable(false);
        frame.add(textField);

        for (int i = 0; i < 10; i++) {
            numBut[i] = new JButton(String.valueOf(i));
            numBut[i].setFont(new Font("Arial", Font.PLAIN, 25));
            numBut[i].addActionListener((ActionListener) this);
            frame.add(numBut[i]);
        }

        addBut = new JButton("+");
        subBut = new JButton("-");
        mulBut = new JButton("*");
        divBut = new JButton("/");
        equalBut = new JButton("=");
        clearBut = new JButton("C");

        addBut.setFont(new Font("Arial", Font.PLAIN, 25));
        subBut.setFont(new Font("Arial", Font.PLAIN, 25));
        mulBut.setFont(new Font("Arial", Font.PLAIN, 25));
        divBut.setFont(new Font("Arial", Font.PLAIN, 25));
        equalBut.setFont(new Font("Arial", Font.PLAIN, 25));
        clearBut.setFont(new Font("Arial", Font.PLAIN, 25));

        addBut.addActionListener((ActionListener) this);
        subBut.addActionListener((ActionListener) this);
        mulBut.addActionListener((ActionListener) this);
        divBut.addActionListener((ActionListener) this);
        equalBut.addActionListener((ActionListener) this);
        clearBut.addActionListener((ActionListener) this);

        frame.add(addBut);
        frame.add(subBut);
        frame.add(mulBut);
        frame.add(divBut);
        frame.add(equalBut);
        frame.add(clearBut);

        numBut[7].setBounds(30, 100, 55, 55);
        numBut[8].setBounds(100, 100, 55, 55);
        numBut[9].setBounds(170, 100, 55, 55);
        divBut.setBounds(245, 100, 55, 55);

        numBut[4].setBounds(30, 185, 55, 55);
        numBut[5].setBounds(100, 185, 55, 55);
        numBut[6].setBounds(170, 185, 55, 55);
        mulBut.setBounds(245, 185, 55, 55);

        numBut[1].setBounds(30, 270, 55, 55);
        numBut[2].setBounds(100, 270, 55, 55);
        numBut[3].setBounds(170, 270, 55, 55);
        subBut.setBounds(245, 270, 55, 55);

        numBut[0].setBounds(30, 355, 55, 55);
        clearBut.setBounds(100, 355, 55, 55);
        equalBut.setBounds(170, 355, 55, 55);
        addBut.setBounds(245, 355, 55, 55);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numBut[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));

            }
        }

        if (e.getSource() == addBut) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }

        if (e.getSource() == subBut) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }

        if (e.getSource() == divBut) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }

        if (e.getSource() == mulBut) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }

        if (e.getSource() == equalBut) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) result = num1 / num2;
                    else System.out.println("Нельзя делить на 0!");
                    break;
            }
            textField.setText(String.valueOf(result));
        }

        if (e.getSource() == clearBut) {
            textField.setText("");
            num1 = 0;
            num2 = 0;
            result = 0;
        }
    }
}