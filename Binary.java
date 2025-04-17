import java.util.Scanner;

public class Binary {
    public static boolean isKthBitSet(int n, int k) {
        return (n & (1 << (k - 1))) != 0;
    }

    public static int setKthBit(int n, int k) {
        return n | (1 << (k - 1));
    }

    public static int unsetKthBit(int n, int k) {
        return n & ~(1 << k);
    }

    public static int flipKthBit(int n, int k) {
        return n ^ (1 << (k - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = sc.nextInt();
        System.out.println("Enter Position:");
        int k = sc.nextInt();

        System.out.println("Number in binary: " + Integer.toBinaryString(number));
        System.out.println("Is " + k + "th bit set? " + isKthBitSet(number, k));

        int setBitResult = setKthBit(number, k);
        System.out.println("After setting " + k + "th bit: " + Integer.toBinaryString(setBitResult));
        System.out.println("After setting " + k + "th bit: " + setBitResult);

        int unsetBitResult = unsetKthBit(number, k);
        System.out.println("After unsetting " + k + "th bit: " + Integer.toBinaryString(unsetBitResult));
        System.out.println("After unsetting " + k + "th bit: " + (unsetBitResult));

        int flipBitResult = flipKthBit(number, k);
        System.out.println("After flipping " + k + "th bit: " + Integer.toBinaryString(flipBitResult));
        System.out.println("After flipping " + k + "th bit: " + (flipBitResult));
        sc.close();
    }
}
