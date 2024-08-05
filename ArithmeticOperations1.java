import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArithmeticOperations1 extends JFrame implements KeyListener {

    private JTextField num1Field;
    private JTextField num2Field;
    private JLabel resultLabel;

    public ArithmeticOperations1() {
        setLayout(new FlowLayout());

        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultLabel = new JLabel("Result: ");

        add(num1Field);
        add(num2Field);
        add(resultLabel);

        num1Field.addKeyListener(this);
        num2Field.addKeyListener(this);

        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // No action needed
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 'a' || e.getKeyChar() == 'A') {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 + num2;
                resultLabel.setText("Result: " + String.valueOf(result));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input. Please enter numbers.");
            }
        } else if (e.getKeyChar() == 's' || e.getKeyChar() == 'S') {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 - num2;
                resultLabel.setText("Result: " + String.valueOf(result));
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input. Please enter numbers.");
            }
        }
    }
    

    @Override
    public void keyReleased(KeyEvent e) {
        // No action needed
    }

    public static void main(String[] args) {
        new ArithmeticOperations1();
    }
}