import java.awt.*;
import java.awt.event.*;

class Lec6 extends Frame {

    Lec6() {       

        // Setting frames Layout
        setSize(700, 700);
        setLayout(null);
        setVisible(true);

        

        // Creating Label
        Label L1 = new Label("Name");
        L1.setBounds(50, 100, 90, 30);
        L1.setText("Name : ");
        add(L1);

        // Creating text field
        TextField T1 = new TextField();
        T1.setBounds(150, 100, 90, 30);
        add(T1);

        // Creating Label
        Label L2 = new Label("Department");
        L2.setBounds(50, 150, 90, 30);
        L2.setText("Department : ");
        add(L2);

        // Creating text field
        TextField T2 = new TextField();
        T2.setBounds(150, 150, 90, 30);
        add(T2);

        // Creating Label
        Label L3 = new Label("PRN");
        L3.setBounds(50, 200, 90, 30);
        L3.setText("PRN : ");
        add(L3);

        // Creating text field
        TextField T3 = new TextField();
        T3.setBounds(150, 200, 90, 30);
        add(T3);

        // Creating Label
        Label L4 = new Label("Gender");
        L4.setBounds(50, 250, 90, 30);
        L4.setText("Gender : ");
        add(L4);

        // Creating Radio buttons
        CheckboxGroup CBG = new CheckboxGroup();
        Checkbox C4 = new Checkbox("Male", CBG, false);
        Checkbox C5 = new Checkbox("Female", CBG, false);
        C4.setBounds(150, 250, 80, 50);
        C5.setBounds(250, 250, 80, 50);
        add(C4);
        add(C5);

        // Creating Label
        Label L5 = new Label("Team");
        L5.setBounds(50, 300, 90, 30);
        L5.setText("Team : ");
        add(L5);

        // Creating Check box
        Checkbox C1 = new Checkbox("Tech", null, false);
        Checkbox C2 = new Checkbox("Non-Tech", null, false);
        Checkbox C3 = new Checkbox("None", null, false);
        C1.setBounds(150, 300, 100, 50);
        C2.setBounds(250, 300, 150, 50);
        C3.setBounds(400, 300, 150, 50);
        add(C1);
        add(C2);
        add(C3);

        // Creating Label
        Label L6 = new Label("Subject");
        L6.setBounds(50, 350, 90, 30);
        L6.setText("Subject : ");
        add(L6);

        // Creating Choice
        Choice C = new Choice();
        C.add("AJP");
        C.add("JSP");
        C.add("CNS");
        C.setBounds(150, 350, 50, 50);
        add(C);

        // Creating Label
        Label L7 = new Label("About");
        L7.setBounds(50, 430, 150, 30);
        L7.setText("About Department : ");
        add(L7);

        // Creating Text Area
        TextArea TA = new TextArea();
        TA.setBounds(250, 430, 300, 150);
        add(TA);

        Button B1 = new Button("Submit");
        B1.setBounds(50, 650, 90, 30);
        add(B1);

        Button B2 = new Button("Clear");
        B2.setBounds(150, 650, 90, 30);
        add(B2);

    }

    public static void main(String[] args) {
        Lec6 L6 = new Lec6();
    }
}