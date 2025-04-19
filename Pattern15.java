import java.util.Scanner;
public class Pattern15 {
    public static void main(String[] args) {
        //pattern 15
    //       1 
    //     2 3 2
    //   3 4 5 4 3
    // 4 5 6 7 6 5 4
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();
    int num = 1;
    for (int i = 1; i <= n; i++) {
        // Print leading spaces
        for (int j = i; j < n; j++) {
            System.out.print("  ");
        }
        // Print increasing numbers
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num++;
        }
        // Print decreasing numbers
        num--;
        for (int j = 1; j < i; j++) {
            num--;
            System.out.print(num + " ");
        }
        System.out.println();
        // Reset num for the next row   
        num = i + 1;
    }
    sc.close();

    }
}
