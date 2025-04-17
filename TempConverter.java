import java.util.Scanner;
public class TempConverter{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter temperature initial: ");
    int ini = sc.nextInt();
    System.out.print("Enter temperature final: ");
    int fin = sc.nextInt();
    System.out.print("Enter temperature step: ");
    int step = sc.nextInt();
        for (int i = ini; i <= fin; i=i+step) {
            
            System.out.print("cel:" + i + " ");
            System.out.println("far:" + (((i*9)/5)+32));
        }
    sc.close();

    }
}

// C = (C × 9/5) + 32 = 41°F
