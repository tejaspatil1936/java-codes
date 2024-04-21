// if a program reqired a user input then such a input can be provided in a different ways
// 1. by using ShowInputDialog -> this function shows a small window where we can enter the data
// 2. by using command line interface -> whenever a program is run are executed from command prompt we can pass some data in a string array where this data can be used to perform some task
// 3. by using scanner class ->

import javax.swing.JOptionPane;

public class readingData {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null , "Enter a number : ");
        int n = Integer.parseInt(s);
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

    }
}
