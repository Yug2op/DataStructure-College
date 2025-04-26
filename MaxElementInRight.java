import java.util.Scanner;

public class MaxElementInRight {
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
        // 4 5 8 7 2

        int maxSoFar = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            arrNew[i] = maxSoFar;
            if (maxSoFar < arr[i]) {
                maxSoFar = arr[i];
            }

        }
        arrNew[n - 1] = -1;
        for (int j = 0; j < n; j++) {

            System.out.print(arrNew[j] + " ");
        }
        sc.close();
    }
}
