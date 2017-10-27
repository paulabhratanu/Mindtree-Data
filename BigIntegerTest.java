import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigIntegerTest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        BigInteger b1,b2;
        b1=new BigInteger(A);
        b2=new BigInteger(B);
        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
    }
}