import javax.swing.*;
import java.awt.*;

public class layout1 extends JFrame {
    Button b, b1, b2, b3;

    layout1() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setBounds(100, 100, 600, 500);
        setTitle("Introduction to JFrame");

        Container c = getContentPane();
        BoxLayout bl = new BoxLayout(c, BoxLayout.Y_AXIS);

        c.setLayout(bl);

        b = new Button("Page");
        b1 = new Button("Page");
        b2 = new Button("Page");
        b3 = new Button("Page");

        c.add(b, RIGHT_ALIGNMENT);
        c.add(b1, RIGHT_ALIGNMENT);
        c.add(b2, RIGHT_ALIGNMENT);
        c.add(b3, RIGHT_ALIGNMENT);
    }
    public static void main(String[] args) {
        new layout1();
    }
}
