
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


    public static int UpdateIbit(int n, int i, int value) {
       n = ClearIthBit(n, i);
       int BitMask = value<<i;
       return n | BitMask;

    }


    public static int ClearBitInRange(int i , int j , int , n)
    {
        int a = ((~0)<<(j+1));
        int b = ((1)<<i)-1;
        return n& (a|b);
    }


    public static boolean IsPower(int n)
    {
        return (n & (n-1)) == 0;
    }


    public static int CoutSetBit(int n)
    {
        int cout =0;

        while(n>0)
        {
            if((n & 1) != 0)
            {
                cout++;
            }

           n =n>>1;
        }

        return cout;
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
