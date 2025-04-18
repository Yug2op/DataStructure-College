import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {  
                    System.out.print(a + "\t");
                        int fib = a + b;
                        a = b;
                        b = fib;
                    
            }
            System.out.println();
        }



        sc.close();
    }
}
