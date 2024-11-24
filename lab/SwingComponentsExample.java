import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingComponentsExample extends JFrame {

    // Constructor to set up the GUI components
    public SwingComponentsExample() {
        // Set up frame
        setTitle("Swing Components Example");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.PINK);

        // Department Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu departmentMenu = new JMenu("Department");
        JMenuItem compItem = new JMenuItem("Computer");
        JMenuItem itItem = new JMenuItem("IT");
        JMenuItem chemItem = new JMenuItem("Chem");
        JMenuItem petroItem = new JMenuItem("Petro");
        departmentMenu.add(compItem);
        departmentMenu.add(itItem);
        departmentMenu.add(chemItem);
        departmentMenu.add(petroItem);
        menuBar.add(departmentMenu);
        setJMenuBar(menuBar);

        // Label and TextField for Name
        JLabel nameLabel = new JLabel("Enter Your Name");
        nameLabel.setBounds(50, 30, 150, 20);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(200, 30, 150, 20);
        add(nameField);

        // Label and TextField for College Name
        JLabel collegeLabel = new JLabel("Enter Your College Name");
        collegeLabel.setBounds(50, 70, 150, 20);
        add(collegeLabel);

        JTextField collegeField = new JTextField();
        collegeField.setBounds(200, 70, 150, 20);
        add(collegeField);

        // Label and TextField for Email
        JLabel emailLabel = new JLabel("Enter Your Email");
        emailLabel.setBounds(50, 110, 150, 20);
        add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(200, 110, 150, 20);
        add(emailField);

        // Label and PasswordField for Email Password
        JLabel passwordLabel = new JLabel("Enter Email Password");
        passwordLabel.setBounds(50, 150, 150, 20);
        add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(200, 150, 150, 20);
        add(passwordField);

        // Label and TextArea for Address
        JLabel addressLabel = new JLabel("Enter Your Address");
        addressLabel.setBounds(50, 190, 150, 20);
        add(addressLabel);

        JTextArea addressField = new JTextArea();
        addressField.setBounds(200, 190, 150, 50);
        add(addressField);

        // Dropdown for Coding Language
        JLabel codingLabel = new JLabel("Select Your Coding Language");
        codingLabel.setBounds(50, 260, 150, 20);
        add(codingLabel);

        String[] codingLanguages = {"Java", "Python", "C++"};
        JComboBox<String> codingBox = new JComboBox<>(codingLanguages);
        codingBox.setBounds(200, 260, 150, 20);
        add(codingBox);

        // Radio buttons for gender selection
        JLabel genderLabel = new JLabel("Select Gender");
        genderLabel.setBounds(50, 300, 150, 20);
        add(genderLabel);

        JRadioButton maleRadio = new JRadioButton("Male");
        maleRadio.setBounds(200, 300, 60, 20);
        add(maleRadio);

        JRadioButton femaleRadio = new JRadioButton("Female");
        femaleRadio.setBounds(270, 300, 80, 20);
        add(femaleRadio);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        // Checkbox for selecting subjects
        JLabel subjectLabel = new JLabel("Select Subjects");
        subjectLabel.setBounds(50, 340, 150, 20);
        add(subjectLabel);

        JCheckBox ajpCheck = new JCheckBox("AJP");
        ajpCheck.setBounds(200, 340, 60, 20);
        add(ajpCheck);

        JCheckBox jspCheck = new JCheckBox("JSP");
        jspCheck.setBounds(260, 340, 60, 20);
        add(jspCheck);

        JCheckBox cnsCheck = new JCheckBox("CNS");
        cnsCheck.setBounds(320, 340, 60, 20);
        add(cnsCheck);

        // List for selecting courses
        JLabel courseLabel = new JLabel("Select Your Course");
        courseLabel.setBounds(50, 380, 150, 20);
        add(courseLabel);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("CS");
        listModel.addElement("IT");
        listModel.addElement("CHEM");

        JList<String> courseList = new JList<>(listModel);
        courseList.setBounds(200, 380, 100, 50);
        add(courseList);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(200, 450, 100, 30);
        add(submitButton);

        // Message Label
        JLabel messageLabel = new JLabel();
        messageLabel.setBounds(50, 500, 500, 20);
        messageLabel.setForeground(Color.RED);
        add(messageLabel);

        // Submit button action
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Data submitted successfully! You Can Go Back");
            }
        });
    }

    // Main method to launch the application
    public static void main(String[] args) {
        SwingComponentsExample example = new SwingComponentsExample();
        example.setVisible(true);
    }
}
