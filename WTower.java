import java.util.Scanner;

public class WTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of elements in the array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Input the array elements
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Array to store the maximum element to the left of each element
        int[] maxInLeft = new int[n];
        maxInLeft[0] = -1; // No elements to the left of the first element
        for (int i = 1; i < n; i++) {
            // The maximum element to the left of arr[i] is the maximum of the previous max
            // and arr[i-1]
            maxInLeft[i] = Math.max(maxInLeft[i - 1], arr[i - 1]);
        }

        // Array to store the maximum element to the right of each element
        int[] maxInRight = new int[n];
        maxInRight[n - 1] = -1; // No elements to the right of the last element
        for (int i = n - 2; i >= 0; i--) {
            // The maximum element to the right of arr[i] is the maximum of the next max and
            // arr[i+1]
            maxInRight[i] = Math.max(maxInRight[i + 1], arr[i + 1]);
        }

        // Calculate the water trapped at each index
        int waterTrapped = 0;
        for (int i = 0; i < n; i++) {
            // The water trapped at index i is the minimum of the maximum heights to the left and right minus the height at index i
            int waterAtIndex = Math.min(maxInLeft[i], maxInRight[i]) - arr[i];
            if (waterAtIndex > 0) {
                waterTrapped += waterAtIndex;
            }
        }
        System.out.print("Water trapped: " + waterTrapped + "\n");

        // Close the scanner
        sc.close();
    }
}
