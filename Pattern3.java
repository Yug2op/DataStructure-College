public class Pattern3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 5 || i == 3) {
                    System.out.print("*   ");
                } else {
                    System.out.print("    ");
                }
            }
            for (int k = i; k <= 4; k++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++) {
                if (i == 3 && j == 2) {
                    System.out.print("    ");
                } else if (i == 5 && j == 2) {
                    System.out.print("    ");
                } else if (i == 5 && j == 3) {
                    System.out.print("    ");
                } else if (i == 5 && j == 4) {
                    System.out.print("    ");
                } else {
                    System.out.print("*   ");
                }
            }
            for (int k = i; k <= 4; k++)
                System.out.print("  ");
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 3 || (j == 5 && i <= 3)) {
                    System.out.print("*   ");
                } else {
                    System.out.print("    ");
                }
            }
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 3 || (j == 5 && i <= 3)) {
                    System.out.print("*   ");
                } else {
                    System.out.print("    ");
                }
            }
            for (int j = 1; j <= 5; j++) {
                if (i == 1 && (j == 1 || j == 5) || (i == 2 && (j == 2 || j == 4)) || (i == 3 && j == 3 || (i == 4 && j == 3) || (i == 5 && j == 3))) {
                    System.out.print("   *");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();

        }
        System.out.print("\n \n");
        for (int i = 1; i <= 5; i++) {
            for (int k=0; k<=5; k++)
                System.out.print("   ");
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 5 || (i == j)) {
                    System.out.print("*   ");
                } else {
                    System.out.print("    ");
                }
            }
            for (int k=0; k<=5; k++)
                System.out.print(" ");
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || (i == 1 || i == 3 || i == 5)) {
                    System.out.print("*   ");
                } else {
                    System.out.print("    ");
                }
            }
            for (int k=0; k<=5; k++)
                System.out.print(" ");
            for (int j = 1; j <= 5; j++) {
                if ((j == 1) || (j == 5) || (i == 3 && (j == 3)) || (i == 4 && (j == 2 || j == 4))) {
                    System.out.print("*   ");
                } else {
                    System.out.print("    ");
                }
            }

            System.out.println();
        }
        System.out.print("\n \n");
        for (int i = 1; i <= 5; i++) {
            for (int k=0; k<=5; k++)
                System.out.print("");
            for (int j = 1; j <= 5; j++) {
                if (i == 1 && (j == 1 || j == 5) || (i == 2 && (j == 2 || j == 4)) || (i == 3 && j == 3 || (i == 4 && j == 3) || (i == 5 && j == 3))) {
                    System.out.print("*   ");
                } else {
                    System.out.print("    ");
                }
            }
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || (i == 1 || i == 3 || i == 5)) {
                    System.out.print("*   ");
                } else {
                    System.out.print("    ");
                }
            }
            for (int k = i; k <= 4; k++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++) {
                if (i == 3 && j == 2) {
                    System.out.print("    ");
                } else if (i == 5 && j == 2) {
                    System.out.print("    ");
                } else if (i == 5 && j == 3) {
                    System.out.print("    ");
                } else if (i == 5 && j == 4) {
                    System.out.print("    ");
                } else {
                    System.out.print("*   ");
                }
            }
            for (int k = i; k <= 4; k++)
                System.out.print("  ");
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 3 || (j == 5 && i <= 3)) {
                    System.out.print("*   ");
                } else if ((i==4 && j==4) || (i==5 && j==5)) {
                    System.out.print("*   ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}