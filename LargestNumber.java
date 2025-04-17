import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive number of elements.");
            sc.close();
            return;
        }

        int largest = Integer.MIN_VALUE; 
        System.out.println("Enter " + num + " numbers:");

        for (int i = 0; i < num; i++) {
            int current = sc.nextInt();
            if (current > largest) {
                largest = current;
            }
        }

        System.out.println("The largest number is: " + largest);
        sc.close();
    }
}
