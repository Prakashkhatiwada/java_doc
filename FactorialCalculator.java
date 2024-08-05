import javax.swing.*;
import java.awt.event.*;

public class FactorialCalculator extends JFrame implements ActionListener {

    private JTextField numberField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public FactorialCalculator() {
        super("Factorial Calculator");

        // Create components
        numberField = new JTextField(10);
        calculateButton = new JButton("Calculate");
        resultLabel = new JLabel("Enter a number:");

        // Layout components
        JPanel panel = new JPanel();
        panel.add(new JLabel("Number:"));
        panel.add(numberField);
        panel.add(calculateButton);
        panel.add(resultLabel);
        add(panel);

        // Add action listener
        calculateButton.addActionListener(this);

        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Pack and set visibility
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                int number = Integer.parseInt(numberField.getText());
                long factorial = calculateFactorial(number);
                resultLabel.setText("Factorial of " + number + " is: " + factorial);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input. Please enter a number.");
            }
        }
    }

    private long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
                // Check for overflow (factorial of large numbers can be very big)
                if (result < 0) {
                    throw new ArithmeticException("Factorial overflow");
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        new FactorialCalculator();
    }
}
