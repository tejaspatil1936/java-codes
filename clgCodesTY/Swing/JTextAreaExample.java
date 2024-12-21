import javax.swing.*;
import java.awt.*;
public class JTextAreaExample extends JFrame {
    JTextAreaExample(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,600,500);
        Container c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);

        JTextArea jt=new JTextArea();
        jt.setBounds(100,100,400,200);
        c.add(jt);

        jt.setText("Hello, good morning");
        //Change Font
        jt.setFont(new Font("Times New Roman",Font.BOLD,20));

        //restricted to edit text
//        jt.setEditable(false);

        //Line wrapping(next Line)
        jt.setLineWrap(true);
    }

    public static void main(String[] args) {
        JTextAreaExample jta=new JTextAreaExample();
    }
}
