// deign a function which will display all nos from 1st arg to sec arg
public class FnWithArgs {
    static void fn(int first, int last) {
        for (int i = first; i <= last; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        fn(5, 10);
    }
}

