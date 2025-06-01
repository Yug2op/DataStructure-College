import java.util.*;
public class HollowSquare {
    public static void main(String[] args) {
        // * * * * * * *
        // * * *   * * *
        // * *       * *
        // *           *
        // * *       * *
        // * * *   * * *
        // * * * * * * *

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        // for (int i = 0; i < (n/2)+1; i++) {
        //     for (int j = i; j < (n/2)+1; j++) {
        //         System.out.print("* ");
        //     }
        //     for (int j = 0; j < (2*i)-1; j++) {
        //         System.out.print("  ");
        //     }

        //     for (int j = i; j < (n/2)+1; j++) {
        //         if (i==0 && j==n/2) {
        //             continue;
        //         }else{

        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println("");
        // }

        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < n/2; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();

    }
    
}
