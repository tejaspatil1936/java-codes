import java.awt.*;

public class label {
    class demo extends Frame {
        public demo() {
            Label abj1 = new Label("AJP");
            add(abj1);

            TextField t = new TextField();
            t.setBounds(160, 100, 90, 30);
            t.setText("hello");
            add(t);

            setSize(400, 500);
        }
    }
}
