import javax.swing.*;
import java.awt.*;

public class JPasswordExample extends JFrame {
    JPasswordExample() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 500);
        Container c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(100, 50, 120, 30);
        c.add(pass);

        // change the size of font
        Font f = new Font("Arial", Font.PLAIN, 20);
        pass.setFont(f);

        // set Foreground and background

        // replace dot with *
        pass.setEchoChar('*');

        // To show password
        pass.setEchoChar((char) 0);
    }

    public static void main(String[] args) {
        JPasswordExample jp = new JPasswordExample();
    }
}
