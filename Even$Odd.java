
import java.util.Scanner;

public class Even$Odd {

    public static void OddOrEven(int n) {
        int BitMask = 1;

        if ((n & BitMask) == 0) {
            System.out.println("GIVEN NUMBER IS EVEN ");

        } else {
            System.out.println("given number is odd");
        }
    }

    public static int GetIthBit(int n, int i) {
        int BitMask = 1 << i;

        if ((n & BitMask) == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    public static int SetIthBit(int n, int i) {
        int BitMask = 1 << i;
        return n | BitMask;
    }

    public static int ClearIthBit(int n, int i) {

      int BitMask = ~(1 << i);
      return n & BitMask;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        OddOrEven(n);
        int i = 2;
        int bit = GetIthBit(n, i);
        System.out.println("bit at position " + i + " is " + bit);

        int IthBit = SetIthBit(n, i);
        System.out.println("the ith bit :" + IthBit);

        int clearIthBit = ClearIthBit(n, i);
        System.out.println("the ith bit after clearing is " + clearIthBit);
        sc.close();

    }

}
