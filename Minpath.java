import java.util.Scanner;

public class Minpath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the direction:");
        String str = sc.nextLine();
        String dir = str.toUpperCase();
        int verticalCount = 0; // N and S
        int horizontalCount = 0; // E and W

        for (int i = 0; i < dir.length(); i++) {
            if (dir.charAt(i) == 'N') {
                verticalCount++;
            } else if (dir.charAt(i) == 'S') {
                verticalCount--;
            } else if (dir.charAt(i) == 'E') {
                horizontalCount++;
            } else if (dir.charAt(i) == 'W') {
                horizontalCount--;
            } else {
                System.out.println("Invalid direction: " + dir.charAt(i));
            }
        }
        if (horizontalCount < 0) {
            for (int i = 0; i < horizontalCount; i++) {
                System.out.print("E");
            }
        }
        if (verticalCount < 0) {
            for (int i = 0; i < verticalCount; i++) {
                System.out.print("N");
            }

        }
        if (verticalCount > 0) {
            for (int i = 0; i < verticalCount; i++) {
                System.out.print("S");
            }
        }

        if (horizontalCount > 0) {
            for (int i = 0; i < horizontalCount; i++) {
                System.out.print("W");
            }
        }

        if (verticalCount == 0 && horizontalCount == 0) {
            System.out.print("No movement required.");
        }
        System.out.println();
        sc.close();
    }

}
