public class nestedIf {
    public static void main(String[] args) {
        double percentage = 90;
        if (percentage >= 75) {
            System.out.println("distintion");
        } else if (percentage >= 60) {
            System.out.println("1st class");
        } else if (percentage >= 50) {
            System.out.println("2nd class");
        } else if (percentage >= 40) {
            System.out.println("3rd class");
        } else {
            System.out.println("failed");
        }

    }
}
