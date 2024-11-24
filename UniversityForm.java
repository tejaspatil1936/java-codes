import java.awt.*;

public class UniversityForm extends Frame {
    UniversityForm() {

        Label l1 = new Label("Name");
        add(l1);
        l1.setBounds(50, 100, 90, 30);
        TextField t = new TextField();
        t.setBounds(160, 100, 90, 30);
        add(t);
        Label l2 = new Label("Department");
        add(l2);
        l2.setBounds(50, 150, 90, 30);
        TextField t1 = new TextField();
        t1.setBounds(160, 150, 90, 30);
        add(t1);
        Label l3 = new Label("PRN");
        add(l3);
        l3.setBounds(50, 200, 90, 30);
        TextField t2 = new TextField();
        t2.setBounds(160, 200, 90, 30);
        add(t2);
        // gender radio button
        Label l4 = new Label("Gender : ");
        add(l4);
        l4.setBounds(50, 250, 90, 30);
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Male", cbg, false);
        Checkbox c2 = new Checkbox("Female", cbg, true);
        c1.setBounds(160, 250, 50, 50);
        c2.setBounds(240, 250, 50, 50);
        add(c1);
        add(c2);
        // team
        Label l5 = new Label("Team : ");
        add(l5);
        l5.setBounds(50, 300, 90, 30);
        Checkbox cb = new Checkbox("Tech", null, false);
        Checkbox cb1 = new Checkbox("NonTech", null, false);
        Checkbox cb2 = new Checkbox("None", null, false);
        cb.setBounds(160, 300, 50, 50);
        add(cb);
        cb1.setBounds(230, 300, 70, 50);
        add(cb1);
        cb2.setBounds(300, 300, 150, 50);
        add(cb2);
        // subject
        Label l6 = new Label("Subject : ");
        add(l6);
        l6.setBounds(50, 350, 90, 30);

        Choice c = new Choice();
        c.add("AJP");
        c.add("CNS");
        c.add("JSP");
        c.setBounds(160, 350, 50, 50);
        add(c);
        // scroll
        Label l7 = new Label("About ");
        add(l7);
        l7.setBounds(50, 400, 90, 30);
        Label l8 = new Label("Department ");
        add(l8);
        l8.setBounds(50, 420, 90, 30);
        TextArea ts = new TextArea();
        ts.setBounds(160, 400, 70, 70);
        add(ts);
        // button
        Button b = new Button("Submit");
        b.setBounds(50, 500, 70, 30);
        add(b);
        Button b1 = new Button("Clear");
        b1.setBounds(140, 500, 70, 30);
        add(b1);

        setSize(90, 30);
        setLayout(null);
        setVisible(true);
        setTitle("University form");
    }

    public static void main(String[] args) {
        UniversityForm uf = new UniversityForm();
    }
}
