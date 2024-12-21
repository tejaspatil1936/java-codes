import javax.swing.*;
import java.awt.*;

public class JTextFieldExample extends JFrame {
    JTextFieldExample() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 500);
        Container c = getContentPane();
        c.setLayout(null);

        JTextField tf = new JTextField();
        tf.setBounds(100, 50, 120, 30);
        c.add(tf);
        tf.setText("Enter your name");

        // change Font
        Font f = new Font("Times New Roman", Font.BOLD, 25);
        tf.setFont(f);

        // change colour
        tf.setBackground(Color.cyan);
        tf.setForeground(Color.BLUE);

        // unable to edit text
        tf.setEditable(false);

    }

    public static void main(String[] args) {
        JTextFieldExample jtf = new JTextFieldExample();
    }
}
