import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] days = {
            "Thursday", "Friday", "Saturday", "Sunday",
            "Monday", "Tuesday", "Wednesday"
        };

        int[] monthDays = {
            31, 29, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        System.out.print("Input month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Input date (1-31): ");
        int date = sc.nextInt();

        int totalDays = 0;

        for (int i = 0; i < month - 1; i++) {
            totalDays += monthDays[i];
        }

        totalDays += (date - 1);

        System.out.println("Name of the date:");
        System.out.println(days[totalDays % 7]);
    }
}