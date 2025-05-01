import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Calculate {
    private JFrame frame;
    private JTextField field;
    private JButton[] numBut = new JButton[0];
    private JButton addBut, subBut, mulBut, divBut, equalBut, clearBut;
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public Calculate() {
        frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 500);
        frame.setLayout(null);

        JTextField textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
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

        numBut[7].setBounds(50, 100, 75, 75);
        numBut[8].setBounds(135, 100, 75, 75);
        numBut[9].setBounds(220, 100, 75, 75);
        divBut.setBounds(305, 100, 75, 75);

        numBut[4].setBounds(50, 185, 75, 75);
        numBut[5].setBounds(135, 185, 75, 75);
        numBut[6].setBounds(220, 185, 75, 75);
        mulBut.setBounds(305, 270, 75, 75);

        numBut[1].setBounds(50, 270, 75, 75);
        numBut[2].setBounds(135, 270, 75, 75);
        numBut[3].setBounds(220, 270, 75, 75);
        subBut.setBounds(305, 270, 75, 75);

        numBut[0].setBounds(50, 355, 75, 75);
        clearBut.setBounds(135, 355, 75, 75);
        equalBut.setBounds(220, 355, 75, 75);
        addBut.setBounds(305, 355, 75, 75);

        frame.setVisible(false);
    }
}
