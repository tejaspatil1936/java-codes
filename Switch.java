// if no matching case is found then code is the default block is the executed 
// default block is optional
// break statement can be used through program control out of the switch statement otherwise we executed without checking there values  
// parseInt is used to get primitive data type of a certain string
// pareInt is method of integer class under java.lang package  
// switch staement is used to check a variable for differnet values and different value of variable diff cases are executed 

import javax.swing.JOptionPane;
public class Switch {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null, "enter the single digit no");
        int n = Integer.parseInt(s);
        switch (n) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                break;
        }
    }
}
