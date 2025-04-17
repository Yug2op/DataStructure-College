import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Element:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <n-1; i++) {
            for (int j =0 ; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[temp];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
