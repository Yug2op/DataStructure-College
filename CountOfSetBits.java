public class CountOfSetBits {

    public static void main(String[] args) {
        int number = 29; 
        int count = 0;
        int temp = number;

        while (temp > 0) {
            count += temp & 1; 
            temp >>= 1;       
        }

        // OR
        // while (number!=0) {
        //     number = number & (number-1);
        //     count++;
        // }

        System.out.println("Number of set bits in " + number + " is: " + count);
        System.out.println("Number in binary: " + Integer.toBinaryString(number));
    }
}
