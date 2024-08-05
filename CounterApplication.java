import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApplication {
    private JFrame frame;
    private JLabel countLabel;
    private int count = 0;

    public CounterApplication() {
        frame = new JFrame("Counter Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        countLabel = new JLabel("Count: 0");
        countLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JButton incrementButton = new JButton("Increment");
        incrementButton.addActionListener(new IncrementListener());

        JButton decrementButton = new JButton("Decrement");
        decrementButton.addActionListener(new DecrementListener());

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(countLabel);
        panel.add(incrementButton);
        panel.add(decrementButton);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private class IncrementListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            countLabel.setText("Count: " + count);
        }
    }

    private class DecrementListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            count--;
            countLabel.setText("Count: " + count);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CounterApplication());
    }
}