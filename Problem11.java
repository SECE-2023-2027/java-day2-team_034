import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String highestName = "";
        String highestId = "";
        int highestScore = -1;

        String lowestName = "";
        String lowestId = "";
        int lowestScore = 101;

        System.out.println("Enter Name ID Score:");

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String id = sc.next();
            int score = sc.nextInt();

            if (score > highestScore) {
                highestScore = score;
                highestName = name;
                highestId = id;
            }

            if (score < lowestScore) {
                lowestScore = score;
                lowestName = name;
                lowestId = id;
            }
        }

        System.out.println("Highest Score Student:");
        System.out.println(highestName + " " + highestId);

        System.out.println("Lowest Score Student:");
        System.out.println(lowestName + " " + lowestId);
    }
}