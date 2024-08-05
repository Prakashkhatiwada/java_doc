import javax.swing.*;
import javax.swing.text.JTextComponent;

public class Demoform {
    public static void main(String[] args) {
        JFrame F1 = new JFrame("Registration Form");
        F1.setLayout(null);

        JLabel L1 = new JLabel("Name");
        L1.setBounds(20, 20, 80, 20);
        F1.add(L1);

        JTextField T1 = new JTextField();
        T1.setBounds(100, 20, 80, 20);
        F1.add(T1);

        JLabel L2 = new JLabel("Username");
        L2.setBounds(20, 60, 80, 20);
        F1.add(L2);

        JTextField T2 = new JTextField();
        T2.setBounds(100, 60, 80, 20);
        F1.add(T2);

        JLabel L3 = new JLabel("Password");
        L3.setBounds(20, 100, 80, 20);
        F1.add(L3);

        JPasswordField P1 = new JPasswordField();
        P1.setBounds(100, 100, 80, 20);
        F1.add(P1);

        JButton B = new JButton("Submit");
        B.setBounds(20, 260, 80, 20);
        F1.add(B);

        F1.setSize(500, 500);
        F1.setVisible(true);
    }
}