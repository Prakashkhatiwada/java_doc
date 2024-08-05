import javax.swing.*;
import javax.swing.text.JTextComponent;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(20, 20, 80, 20);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(100, 20, 80, 20);
        frame.add(nameField);

        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(20, 60, 80, 20);
        frame.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(100, 60, 80, 20);
        frame.add(usernameField);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(20, 100, 80, 20);
        frame.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(100, 100, 80, 20);
        frame.add(passwordField);

        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setBounds(20, 140, 80, 20);
        frame.add(genderLabel);

        JRadioButton maleRadio = new JRadioButton("Male");
        maleRadio.setBounds(100, 140, 60, 20);
        frame.add(maleRadio);

        JRadioButton femaleRadio = new JRadioButton("Female");
        femaleRadio.setBounds(160, 140, 80, 20);
        frame.add(femaleRadio);

        JRadioButton otherRadio = new JRadioButton("Other");
        otherRadio.setBounds(240, 140, 80, 20);
        frame.add(otherRadio);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        genderGroup.add(otherRadio);

        JLabel dobLabel = new JLabel("DOB");
        dobLabel.setBounds(20, 180, 80, 20);
        frame.add(dobLabel);

        String[] years = {"1997", "1998", "1999"};
        JComboBox<String> yearComboBox = new JComboBox<>(years);
        yearComboBox.setBounds(100, 180, 80, 20);
        frame.add(yearComboBox);

        JComboBox<Integer> monthComboBox = new JComboBox<>();
        for (int i = 1; i <= 12; i++) {
            monthComboBox.addItem(i);
        }
        monthComboBox.setBounds(180, 180, 80, 20);
        frame.add(monthComboBox);

        JCheckBox termsCheckBox = new JCheckBox("Terms & Conditions");
        termsCheckBox.setBounds(20, 220, 200, 20);
        frame.add(termsCheckBox);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(20, 260, 80, 20);
        frame.add(submitButton);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}