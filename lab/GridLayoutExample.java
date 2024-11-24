import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {

    public GridLayoutExample() {
        // Set the title of the frame
        setTitle("GridLayout Example");

        // Set the layout of the content pane to GridLayout (2 rows x 3 columns)
        setLayout(new GridLayout(2, 3));  

        // Create and add buttons to the grid
        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
        add(new JButton("Button 3"));
        add(new JButton("Button 4"));
        add(new JButton("Button 5"));
        add(new JButton("Button 6"));

        // Set the frame size and visibility
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create and display the GridLayout example
        new GridLayoutExample();
    }
}
