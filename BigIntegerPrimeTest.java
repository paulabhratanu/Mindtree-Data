import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigIntegerPrimeTest {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str=sc.nextLine();
      sc.close();
       BigInteger b1;
       Boolean b;
       b1=new BigInteger(str);
       b = b1.isProbablePrime(1);
       if(b)
           System.out.println("prime");
       else
           System.out.println("not prime");
      // Write your code here.
   }
}