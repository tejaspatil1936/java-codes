
import java.util.Scanner;

public class Marks {

    public static void sortMarks(int[] marks) {
        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = i + 1; j < marks.length; j++) {
                if (marks[i] > marks[j]) {
                    int temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[10];

        System.out.println("Enter 10 marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        System.out.println("\nOriginal Marks:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        sortMarks(marks);

        System.out.println("\n\nSorted Marks:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        scanner.close();
    }
}
