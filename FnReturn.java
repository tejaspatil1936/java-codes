// if uh want to use function in an expression then succh function must return a value by ////using return statement 
// syntax : return value;
// write a program with function returning area of rectangle
// hw : design a fuction volume returning a volume of box when l, b, h are passed as arguement 

public class FnReturn {
    public static void main(String[] args) {
        int area = area(5, 10);
        System.out.println(area);
    }

    static int area(int l, int b) {
        return l * b;
    }
}
