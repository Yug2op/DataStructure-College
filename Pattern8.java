public class Pattern8 {
    public static void main(String[] args) {
        for (int i = 0; i <=5; i++) {
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <= 2*(5-i); j++) {
                System.out.print(" ");

            }

            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 4; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=2*(5-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
