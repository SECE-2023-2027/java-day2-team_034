import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.replace("python", "#");
        str = str.replace("java", "python");
        str = str.replace("#", "java");

        System.out.println("New string:");
        System.out.println(str);
    }
}