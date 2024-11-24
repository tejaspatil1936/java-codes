import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;

public class BgChanger extends JFrame implements ActionListener {
    Container c;
    JButton jb, jb1, jb2;
    BgChanger(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,600,500);

        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);

        jb = new JButton("click here");
        jb.setBounds(100, 100, 100, 30);
        jb1 = new JButton("click here");
        jb1.setBounds(200, 100, 100, 30);
        jb2 = new JButton("click here");
        jb2.setBounds(300, 100, 100, 30);

        c.add(jb);
        c.add(jb1);
        c.add(jb2);
    
        jb.addActionListener(this);
        jb1.addActionListener(this);
        jb2.addActionListener(this);

    }
        public void actionPerformed(ActionEvent e){
            if (e.getSource()==jb) {
                c.setBackground(Color.ORANGE);
            }
            if (e.getSource()==jb1) {
                c.setBackground(Color.RED);
            }
            if (e.getSource()==jb2) {
                c.setBackground(Color.PINK);
            }
        } 

        public static void main(String[] args) {
            BgChanger jb = new BgChanger();
            BgChanger jb1 = new BgChanger();
            BgChanger jb2 = new BgChanger();
        }



}

