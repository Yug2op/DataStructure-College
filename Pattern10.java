public class Pattern10 {
public static void main(String[] args) {
    int n = 6; 
    // 1
    // 11
    // 111
    // 1001
    // 11111
    // 100001

    for (int i = 0; i < n; i++) {
        if (i<=2) {
            for(int j = 0; j <= i; j++) {
                System.out.print("1");
            }
        }
        else if (i%3 == 0 || i%3 == 2) {
            System.out.print("1");
            for (int j = 0; j <=i-2; j++) {
                System.out.print("0");
            }
            System.out.print("1");
        }
        else{
            for(int j = 0; j <= i; j++) {
                System.out.print("1");
            }
            
        }
        System.out.println();
    }
    
}
}
