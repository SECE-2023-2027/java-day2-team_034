public class Problem2 {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        int sum = 0;
        while (count < 100) {
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                sum += num;
                count++;
            }
            num++;
        }
        System.out.println("Sum of first 100 prime numbers: " + sum);
    }
}