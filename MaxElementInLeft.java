import java.util.Scanner;

public class MaxElementInLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arrNew = new int[n];
        arrNew[0] = -1; // No elements to the left of the first element
        int maxElementInLeft = arr[0];
        // 4 5 8 7 2
        for (int i = 1; i <n-1 ; i++) {
            arrNew[i] = maxElementInLeft;
            maxElementInLeft = Math.max(maxElementInLeft, arr[i]);
        }
        for (int j = 0; j < n; j++) {
            System.out.print(arrNew[j] + " ");
        }
        sc.close();
    }
}
