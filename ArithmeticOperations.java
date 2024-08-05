import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArithmeticOperations extends JFrame implements KeyListener {
    private JTextField num1Field, num2Field;
    private JLabel resultLabel;
    private double num1, num2;

    public ArithmeticOperations() {
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultLabel = new JLabel("Result: ");
        num1Field.addKeyListener(this);
        num2Field.addKeyListener(this);

        add(num1Field, BorderLayout.NORTH);
        add(num2Field, BorderLayout.CENTER);
        add(resultLabel, BorderLayout.SOUTH);

        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // No operation on key typed
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 'a' || e.getKeyChar() == 'A') {
            try {
                num1 = Double.parseDouble(num1Field.getText());
                num2 = Double.parseDouble(num2Field.getText());
                resultLabel.setText("Result: " + (num1 + num2));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input. Please enter numbers.");
            }
        } else if (e.getKeyChar() == 's' || e.getKeyChar() == 'S') {
            try {
                num1 = Double.parseDouble(num1Field.getText());
                num2 = Double.parseDouble(num2Field.getText());
                resultLabel.setText("Result: " + (num1 - num2));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input. Please enter numbers.");
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // No operation on key released
    }

    public static void main(String[] args) {
        new ArithmeticOperations();
    }
}