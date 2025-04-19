import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {

            // pattern
            // 1
            // 2 3
            // 4 5 6
            // 7 8 9 10
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            int n = sc.nextInt();
            int counter = 1; 
            for (int i = 1; i <= n; i++) { 
                for (int j = 1; j <= i; j++) { 
                    System.out.print(counter + " ");
                    counter++; 
                }
                System.out.println(" "); 
            }
            sc.close();
    }
}
