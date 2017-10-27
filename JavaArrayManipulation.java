import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaArrayManipulation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        int i;
        int n = in.nextInt();
        int m = in.nextInt();
        int max=0;
       for(i=0;i<n;i++)
            a1.add(0);
        /*a1.add(1,100);
        for(Integer elements:a1)
            System.out.println(elements);*/
        while(m-->0)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            for(i=a-1;i<=b-1;i++)
               a1.set(i, a1.get(i) + k);
            //System.out.println(a1);
           if(max<Collections.max(a1))
                max=Collections.max(a1);
        }
        System.out.println(max);
        in.close();
    }
}