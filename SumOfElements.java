import java.util.*;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count of Elements: ");
        int n = sc.nextInt();
        System.out.print("Enter " + n + " of Elements: ");
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int input = sc.nextInt();

            count = count + input;
        }

        System.out.print("Sum of all elements = " + count);
        sc.close();
    }
}