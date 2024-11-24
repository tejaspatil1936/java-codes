import javax.swing.*;

public class msgdialogue  {
    JFrame f;
    msgdialogue() {
        f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 500);
        f.setBounds(100, 100, 600, 500);
        f.setTitle("Introduction to JFrame");

        JOptionPane.showMessageDialog(f, "Do your want ", "OK" , JOptionPane.QUESTION_MESSAGE);

    }
    public static void main(String[] args) {
        new msgdialogue();
    }
}
