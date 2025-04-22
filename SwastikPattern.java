public class SwastikPattern{
    public static void main(String[] args) {
        // *     * * * *
        // *     *      
        // * * * * * * *
        //       *     *
        // * * * *     *
        
        int n = 7;
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=n; j++) {
                if ((i==1||i==2) && (j==2||j==3)) {
                    System.out.print("  ");
                }
                else if (i==2 && j>4) {
                    System.out.print("  ");
                }
                else if (i==4 && (j==1 || j==2 || j==3)) {
                    System.out.print("  ");
                }
                else if (i>3 && (j==5 || j==6)) {
                    System.out.print("  ");
                }
                else{

                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}