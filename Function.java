//design a function volume which will calculate and return volume of sphere from specified rdius which passed a argument
public class Function {
    public static void main(String[] args) {
        double z = volume(5.6);
        System.out.println("Volume of sphere is " + z);
    }

    static double volume(double R) {
        double v = 4 / 3.0 * 3.14 * R * R * R;
        return v;
    }
}
