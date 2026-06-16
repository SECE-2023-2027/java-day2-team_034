import java.util.ArrayList;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        System.out.print("Enter n (nth element from end): ");
        int n = sc.nextInt();
        int index = list.size() - n;
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        }
        System.out.println("List after removal:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}