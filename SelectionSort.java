import java.util.*;
public class SelectionSort {
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
        
        for (int i = 0; i < n-1; i++) {
            int index = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
        }

        for (int i = 0; i < n; i++) {
            
            System.out.print(arr[i] + " ");
        }
        


        sc.close();
    }
}
