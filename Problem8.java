import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        sc.nextLine();

        String[] words = new String[n];

        System.out.println("Enter words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        System.out.println("Longest word(s):");
        for (String word : words) {
            if (word.length() == maxLength) {
                System.out.println(word);
            }
        }
    }
}