// total of 5 subjects also print the % if student is passed 

public class totalMarks {
    public static void main(String[] args) {
        int a = 98, b = 85, c = 65, d = 78, e = 75, total;
        total = a + b + c + d + e;
        double percentage;
        System.out.println("total marks : " + total);
        if (a > 40 && b > 0 && c > 40 && d > 40 && e > 40) {
            percentage = total / 5.0;
            System.out.println("student has passed");
            System.out.println("percentage : " + percentage);
        } else {
            System.out.println("failed");
        }
    }
}
