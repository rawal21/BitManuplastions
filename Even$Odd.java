
import java.util.Scanner;

public class  Even$Odd{

  public static void OddOrEven(int n)
  {
    int BitMask =1;

    if((n & BitMask)==0)
    {
      System.out.println("GIVEN NUMBER IS EVEN ");

    

    }

    else{
      System.out.println("given number is odd");
    }
  }
  public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n = sc.nextInt();
    OddOrEven(n);

}

}