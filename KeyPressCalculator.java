import javax.swing.*;
import java.awt.event.*;

public class KeyPressCalculator extends JFrame implements KeyListener {

    private JTextField num1Field;
    private JTextField num2Field;
    private JLabel resultLabel;

    public KeyPressCalculator() {
        super("Key Press Calculator");

        // Create components
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultLabel = new JLabel("Result:");

        // Layout components
        JPanel panel = new JPanel();
        panel.add(new JLabel("Number 1:"));
        panel.add(num1Field);
        panel.add(new JLabel("Number 2:"));
        panel.add(num2Field);
        panel.add(resultLabel);
        add(panel);

        // Focus on the first text field for easier user interaction
        num1Field.requestFocus();

        // Add key listener
        addKeyListener(this);

        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Pack and set visibility
        pack();
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char key = e.getKeyChar();

        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());

            switch (key) {
                case 'A':
                    resultLabel.setText("Result: " + (num1 + num2));
                    break;
                case 'S':
                    resultLabel.setText("Result: " + (num1 - num2));
                    break;
                default:
                    resultLabel.setText("Invalid key press. Use 'A' for addition and 'S' for subtraction.");
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Please enter numbers.");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not used in this implementation, but included for completeness
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used in this implementation, but included for completeness
    }

    public static void main(String[] args) {
        new KeyPressCalculator();
    }
}
