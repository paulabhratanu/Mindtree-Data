import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int start=0;
        int end=A.length()-1;
        while(start<(A.length()/2))
        {
          if(A.charAt(start)!=A.charAt(end))
          {
          	System.out.println("No");
          	System.exit(0);
          }
          start++;
          end--;
        }
        System.out.println("Yes");
        
    }
}
