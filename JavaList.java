import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int i,q;
        int n=sc.nextInt();
        ArrayList<Integer> arrlist = new ArrayList<Integer>(n);
        for(i=0;i<n;i++)
        	arrlist.add(sc.nextInt());
        //sc.nextLine();
        q=sc.nextInt();
        //sc.nextLine();

        while(q--!=0)
        {
            if (sc.hasNextLine) {
                sc.nextLine();
            }
        	String str=sc.nextLine();

        	if(str.equals("Insert"))
        	{
        		//System.out.println("Insert");
        		int x=sc.nextInt();
        		int y=sc.nextInt();
               // sc.nextLine();
        		arrlist.add(x,y);
        	}else if(str.equals("Delete"))
        	{
        		System.out.println("Delete");
        		int z=sc.nextInt();
                //sc.nextLine();
        		arrlist.remove(z);
        	}
        	
        }

        for (Integer number : arrlist) {
   			System.out.println(number);
   		}

    }
}