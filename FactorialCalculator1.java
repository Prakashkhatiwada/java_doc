import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialCalculator1 extends JFrame {

    private JTextField inputField;
    private JLabel resultLabel;

    public FactorialCalculator1() {
        setLayout(new FlowLayout());

        // Create input field
        inputField = new JTextField(10);
        add(inputField);

        // Create button
        JButton calculateButton = new JButton("Calculate Factorial");
        add(calculateButton);

        // Create result label
        resultLabel = new JLabel();
        add(resultLabel);

        // Add action listener to button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int input = Integer.parseInt(inputField.getText());
                    int factorial = calculateFactorial(input);
                    resultLabel.setText("Factorial of " + input + " is " + factorial);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input. Please enter a positive integer.");
                }
            }
        });

        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FactorialCalculator());
    }
}