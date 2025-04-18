import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args) {
        // 1 2 3 4 5 
        // 2 2 3 4 5 
        // 3 3 3 4 5 
        // 4 4 4 4 5 
        // 5 5 5 5 5

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i >= j) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        sc.close();


    }
}
