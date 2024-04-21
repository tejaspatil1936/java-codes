public class ForLoop {
    public static void main(String[] args) {
        int n = 30;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
    }
}