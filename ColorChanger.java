import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger extends JFrame {

    private JPanel panel;
    private Color initialColor;
    private Color hoverColor;

    public ColorChanger() {
        panel = new JPanel();
        initialColor = Color.WHITE;
        hoverColor = Color.BLUE;

        panel.setBackground(initialColor);
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                panel.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel.setBackground(initialColor);
            }
        });

        add(panel, BorderLayout.CENTER);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ColorChanger();
            }
        });
    }
}