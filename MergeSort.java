import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in 1st array: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of elements in 2st array: ");
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        System.out.println("Enter " + n + " elements of the first array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter " + m + " elements of the first array: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int indx1 = 0;
        int indx2 = 0;
        while (indx1 < n && indx2 < m) {
            if (arr1[indx1] < arr2[indx2]) {
                System.out.print(arr1[indx1] + " ");
                indx1++;
            } else {
                System.out.print(arr2[indx2] + " ");
                indx2++;
            }
            
        }
        

        sc.close();

    }
}
