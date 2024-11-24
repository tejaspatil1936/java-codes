public class OverloadingExample {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        int sum1 = obj.add(5, 3);
        double sum2 = obj.add(2.5, 3.7);
        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);
    }
}
