import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class layout2 extends JFrame implements ActionListener {
    layout2() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setBounds(100, 100, 600, 500);
        setTitle("Introduction to JFrame");

        FlowLayout f = new FlowLayout();
        setLayout(f);

        JButton jb = new JButton("OK");
        add(jb);
        
        jb.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e) {
        String str = JOptionPane.showInputDialog("Enter your name: ");
        if(str.length() > 0) {
            System.out.println("GOOD");
        }
    }

    public static void main(String[] args) {
        new layout2();
    }
}
