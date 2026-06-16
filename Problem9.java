import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        System.out.println("Enter 3 numbers:");
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        int first = arr[0];

        arr[0] = arr[1];
        arr[1] = arr[2];
        arr[2] = first;

        System.out.print("Rotated Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}