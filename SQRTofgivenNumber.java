import java.util.Scanner;
public class SQRTofgivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its square root: ");
        int num = sc.nextInt();
        
        System.out.println("Number\tSquare Root");
        //  int sqrt = ;
            System.out.println(num + "\t" + Math.sqrt(num));
            sc.close();
        
    }
}
