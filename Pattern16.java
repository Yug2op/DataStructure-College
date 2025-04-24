public class Pattern16 {
    public static void main(String[] args) {
//               1                       
//           2 1  1 2                        
//       3 2 1      3 2 1                          
//   4 3 2 1          4 3 2 1                    
//       3 2 1      3 2 1                          
//           2 1  1 2                         
//               1                              


        int n =7;

       for (int i = 0; i <4; i++) {
        // leading spaces
        for (int j = (2*n)-2*i; j >0 ; j--) {
            if (i==0&&j==1) {
                System.out.print("  ");
            }
            else{
                System.out.print(" ");
            }
        }
        // decreasing numbers
        for (int j = i; j >=0; j--) {
            // print decreasing numbers for the first half
            if (i<4) {
                System.out.print((j+1) +" ");
            }
        }
        // spaces in the middle
        for (int j = 0; j <2*i; j++) {
            System.out.print("  ");
        }
        // increasing numbers
        for (int k = 0; k <=i; k++) {
            
            if (k==0&&i==0) {
                System.out.print(" ");
            }
            else{
                if (i<4) {
                    System.out.print((k+1) +" ");
                }
            }
            
        }
        if (i<4) {
            
            System.out.println();
        }
        n=n-1;
       }
    // printing 2nd half
    for (int i = 0; i < 3; i++) {
        //leading spaces
        if (i==2) {
            System.out.print(" ");
        }
        for (int j = 0; j <= 2*n+2*(i-2); j++) {
            System.out.print("  ");

        }
        // decresing number
        for (int j = 3; j>i; j--) {
            System.out.print((j)+ " ");
        }
        //space in the middle
        for (int j = 0; j < (2*n)-(2*i)-2; j++) {
            System.out.print("  ");
        }
        // increasing number
        for (int j = i; j < 3; j++) {
            if (i!=2) {
                
                System.out.print((j+1) +" ");
            }
            else{
                System.out.print(" ");
                
            }    

        }
        
        System.out.println();
    }
    }
}