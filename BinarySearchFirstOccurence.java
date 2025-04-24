import java.util.*;

public class BinarySearchFirstOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements of sorted array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target Value: ");
        int target = sc.nextInt();
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end) {
            int m = (start + end) / 2;
            if (arr[m] < target) {
                start = m + 1;
            } else if (arr[m] > target) {
                end = m - 1;
            } else {
                ans = m;
                end = m - 1;
            }
        }
        if (ans == -1) {
            System.out.print("Element not found.");
        } else {
            System.out.print("First Element is found at index: " + ans);
        }

        sc.close();
    }

}
