import java.util.*;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Elements:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
            
        }
        int largest = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                
            }
        }

        System.out.println("Largest element is:"+largest);
        sc.close();
    }
}
