import java.io.*;
import java.util.*;

public class NegativeSubArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int i;
        int cnt=0;
        int temp=0;
        int temp_1;
        int x=1;
        int n=scan.nextInt();
        temp_1=0;
        int []a=new int[n];
        for(i=0;i<n;i++)
        {
        	a[i]=scan.nextInt();
        }
         for(i=0;i<n;i++)
        {
        	if(a[i]<0)
        		cnt++;
        }
        temp=a[0];
        while(temp_1!=(n-1))
        {
        	for(i=x;i<n;i++)
        	{
        		temp+=a[i];
        		if(temp<0)
        			cnt++;
        	}
        	temp_1++;
        	temp=a[x];
        	x++;
        }
        System.out.println(cnt);
        

    }
}