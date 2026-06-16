import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows/columns: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int[] colSum = new int[n];
        int total = 0;

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            int rowSum = 0;

            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();

                rowSum += arr[i][j];
                colSum[j] += arr[i][j];
                total += arr[i][j];
            }

            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(rowSum);
        }

        for (int j = 0; j < n; j++) {
            System.out.print(colSum[j] + "\t");
        }
        System.out.println(total);
    }
}