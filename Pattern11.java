import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        // 1 2 3 4 5
        // 1 2 3 4 *
        // 1 2 3 * * *
        // 1 2 * * * * *
        // 1 * * * * * * *

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(j+" ");
            }
            for (int j = 0; j < i*2-1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }

}
