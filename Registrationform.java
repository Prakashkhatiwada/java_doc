import javax.swing.*;
import javax.swing.text.JTextComponent;

class RegistrationForm {
    public static void main(String[] args) {
        JFrame F1 = new JFrame("Registration Form");
        JLabel L1 = new JLabel("Name");
        JLabel L2 = new JLabel("Username");
        JLabel L3 = new JLabel("Password");
        JLabel L4 = new JLabel("Gender");
        JLabel L5 = new JLabel("DOB");
        JTextField T1 = new JTextField();
        JTextField T2 = new JTextField();
        JPasswordField P1 = new JPasswordField();
        JRadioButton R1 = new JRadioButton("Male");
        JRadioButton R2 = new JRadioButton("Female");
        JRadioButton R3 = new JRadioButton("Other");
        ButtonGroup GB = new ButtonGroup();
        GB.add(R1);
        GB.add(R2);
        GB.add(R3);
        String[] years = {"1997", "1998", "1999"};
        JComboBox<String> cb = new JComboBox<>(years);
        int n = 12;
        JComboBox<Integer> monthComboBox = new JComboBox<>();
        for (int i = 1; i <= n; i++) {
            monthComboBox.addItem(i);
        }
        JCheckBox CB = new JCheckBox("Terms & Conditions");
        JButton B = new JButton("Submit");
        F1.setLayout(null);
        L1.setBounds(20, 20, 80, 20);
        F1.add(L1);
        T1.setBounds(100, 20, 80, 20);
        F1.add(T1);
        L2.setBounds(20, 60, 80, 20);
        F1.add(L2);
        T2.setBounds(100, 60, 80, 20);
        F1.add(T2);
        L3.setBounds(20, 100, 80, 20);
        F1.add(L3);
        P1.setBounds(100, 100, 80, 20);
        F1.add(P1);
        L4.setBounds(20, 140, 80, 20);
        F1.add(L4);
        R1.setBounds(100, 140, 60, 20);
        F1.add(R1);
        R2.setBounds(160, 140, 80, 20);
        F1.add(R2);
        R3.setBounds(240, 140, 80, 20);
        F1.add(R3);
        L5.setBounds(20, 180, 80, 20);
        F1.add(L5);
        cb.setBounds(100, 180, 80, 20);
        F1.add(cb);
        monthComboBox.setBounds(180, 180, 80, 20);
        F1.add(monthComboBox);
        CB.setBounds(20, 220, 200, 20);
        F1.add(CB);
        B.setBounds(20, 260, 80, 20);
        F1.add(B);
        F1.setSize(500, 500);
        F1.setVisible(true);
    }
}