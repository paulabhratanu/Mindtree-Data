import java.io.*;
import java.util.*;

public class JavaSparseArrays {

    public static void main(String[] args)
             {
                 Scanner in = new Scanner(System.in);
 

               int n = in.nextInt();
               in.nextLine();
 
     String[] str= new String [n+3];
 
        int j;
        int count=0;
 
    for( j = 0; j <n;j++) 
    {
        
        str[j] = in.nextLine();
        
    }
    //in.nextInt();
    int q = in.nextInt();
    in.nextLine();
    

    
    	while(q-->0)
    	{
    		
    			String str_1=in.next();
    		
    		
    		//in.nextInt();
    		for(j=0;j<n;j++)
    		{
    			if(str[j].equals(str_1))
    			{
    				//System.out.print(str[j] + " ");
    				count++;
    			}
    		}
    		System.out.println(count);
        	count=0;
		}
    }
}