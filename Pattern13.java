import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        // 1 1
        // 1 2 2 1
        // 1 2 3 3 2 1
        // 1 2 3 4 3 2 1

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // num
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            // spaces
            for (int j = 1; j < 2 * (n - i); j++) {
                System.out.print("\t");

            }

            // num

            for (int j = i; j >= 1; j--) {
                if (j==n) {
                    continue;
                }
                System.out.print(j + "\t");

            }

            System.out.println();
        }
        sc.close();

    }
}
