import java.awt.*;
import java.awt.event.*;

class Lec5 extends Frame implements ActionListener {
    TextField T;
    Lec5() {
        
        // Creating text field
        T = new TextField();
        T.setBounds(50, 100, 100, 50);
        add(T);

        // Creating button
        Button B1 = new Button("Click");
        B1.setBounds(50, 200, 100, 50);
        add(B1);

        B1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        T.setText("Hello, Good morning!!");
    }

    public static void main(String[] args) {
        Lec5 L5 = new Lec5();
    }
}