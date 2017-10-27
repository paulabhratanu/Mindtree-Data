import java.io.*;
import java.util.*;
import java.lang.*;
public class Lexographical {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int i;
        int cnt=0;
        int length=A.length()+B.length();
        System.out.println(length);
        for(i=0;i<Math.min(A.length(),B.length());i++)
        {
        	char ch1=A.charAt(i);
        	char ch2=B.charAt(i);
        	if(ch1<=ch2)
        	{
        		cnt++;
        		System.out.println("No");
        		break;
        	}else{
        		cnt=0;
        		break;
        	}
        }
       if(cnt==0)
       	System.out.println("Yes");
       A = A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase();
       B = B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase();
       System.out.printf("%s\t%s",A,B);
        
    }
}
