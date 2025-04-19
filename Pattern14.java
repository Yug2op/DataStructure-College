import java.util.Scanner;
public class Pattern14 {
    public static void main(String[] args) {
        //pattern 
        // 1
        // 2 2
        // 3 0 3
        // 4 0 0 4
        // 5 0 0 0 5

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                if (j == 1 || j == i) {
                    System.out.print(i + "\t");
                } else {
                    System.out.print("0" + "\t");
                    
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
