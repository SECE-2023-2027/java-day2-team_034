import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value to remove: ");
        int value = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != value) {
                count++;
            }
        }

        System.out.println("The length of the new array is: " + count);
    }
}