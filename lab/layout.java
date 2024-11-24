import javax.swing.*;
import java.awt.*;

public class layout extends JFrame {
    Button b, b1, b2, b3;
    layout() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setBounds(100, 100, 600, 500);
        setTitle("Introduction to JFrame");

        Container c = getContentPane();
        CardLayout card = new CardLayout();
        c.setLayout(card);

        b = new Button("Page");
        b1 = new Button();
        b2 = new Button();
        b3 = new Button();

        c.add(b, "1");
        c.add(b1, "2");
        c.add(b2, "3");
        c.add(b3, "4");

        card.first(c);
        

    }
    public static void main(String[] args) {
        new layout();
    }
}
