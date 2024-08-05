import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Ocean extends JFrame implements MouseListener {
    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton b1;

    Ocean() {
        l1 = new JLabel("Enter a number: ");
        l2 = new JLabel("Enter a number: ");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        b1 = new JButton("Add");
        l3 = new JLabel("");
        b1.addMouseListener(this);

        add(l1);add(t1);add(l2);
        add(t2);add(b1); add(l3);
        setLayout(new FlowLayout(FlowLayout.CENTER, 150, 10));
        setSize(300, 400);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
     
    }
    public void mousePressed(MouseEvent e) {
   int a, b, sum;
        a = Integer.parseInt(t1.getText());
        b = Integer.parseInt(t2.getText());
        sum = a + b;
        l3.setText("Sum of two numbers = " + sum);
    }
    public void mouseReleased(MouseEvent e) {
   int a, b, sum;
        a = Integer.parseInt(t1.getText());
        b = Integer.parseInt(t2.getText());
        sum = a - b;
        l3.setText("diff of two numbers = " + sum);
    }
    public void mouseEntered(MouseEvent e) {
 int a, b, sum;
        a = Integer.parseInt(t1.getText());
        b = Integer.parseInt(t2.getText());
        sum = a * b;
        l3.setText("mul of two numbers = " + sum);    
    }
    public void mouseExited(MouseEvent e) {    
    }
    public static void main(String args[]) {
        Ocean D1 = new Ocean();
    }
}
