import java.awt.*;

public class Lec4 extends Frame {
    Lec4() {

        Label l = new Label("AJP");
        l.setBounds(50, 100, 90, 30);
        l.setText("AJP Lecture");
        add(l);

        TextField T = new TextField();
        T.setBounds(160, 100, 90, 30);
        T.setText("Hello");
        add(T);

        Checkbox c1 = new Checkbox("AJP", null, true);
        Checkbox c2 = new Checkbox("JSP", null, false);
        Checkbox c3 = new Checkbox("CNS", null, false);

        c1.setBounds(50, 160, 50, 50);
        c2.setBounds(150, 160, 50, 50);
        c3.setBounds(250, 160, 50, 50);

        add(c1);
        add(c2);
        add(c3);

        CheckboxGroup cbg = new CheckboxGroup();

        Checkbox c4 = new Checkbox("male", cbg, false);
        Checkbox c5 = new Checkbox("female", cbg, true);

        c4.setBounds(50, 250, 50, 50);
        c5.setBounds(150, 250, 60, 50);

        add(c4);
        add(c5);

        List l1 = new List(3, true);
        l1.add("cs");
        l1.add("it");
        l1.add("chem");

        l1.setBounds(50, 350, 100, 100);
        add(l1);

        Choice c = new Choice();
        c.add("cs");
        c.add("it");
        c.add("chem");
        c.setBounds(50, 500, 50, 50);

        add(c);

        TextArea t = new TextArea();
        t.setBounds(200, 350, 100, 100);
        add(t);

        MenuBar mbar = new MenuBar();
        setMenuBar(mbar);
        Menu file = new Menu("File");
        MenuItem i1, i2;
        file.add(new MenuItem("new"));
        file.add(new MenuItem("open"));
        mbar.add(file);

        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        setTitle("UI element program");

    }

    public static void main(String[] args) {
        Lec4 L4 = new Lec4();

    }
}
