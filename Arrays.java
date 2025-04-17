import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter target:");
        int target = sc.nextInt();
        int[] arr = new int[10];
        boolean found = true;

        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]==target){
                System.out.print("Found the element at index:" + i);
                found = false;
                break;
            }

            if (found==false) {
                System.out.print("-1");
            }
            
        }


        sc.close();
    }
}
