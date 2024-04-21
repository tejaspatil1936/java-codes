import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Show an input dialog and get the user's input as a string
        String s = JOptionPane.showInputDialog(null, "Enter the single digit no:");
        
        // Convert the string to an integer
        int n = Integer.parseInt(s);
        
        // Display the result
        JOptionPane.showMessageDialog(null, "You entered: " + n);
    }
}
