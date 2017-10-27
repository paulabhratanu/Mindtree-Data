import java.util.*;
import java.io.*;
import java.lang.Math;

class Series{
    public static void main(String []argh){
        double temp=0;
        double ans;
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            double a = in.nextDouble();
            double b = in.nextDouble();
            double n = in.nextDouble();
            ans=java.lang.Math.pow(2,0);
            temp=a+(ans*b);
            int temp_1 = (int)temp;
            System.out.print(temp_1 + " ");
            for(int j=1;j<n;j++)
            {
                ans=java.lang.Math.pow(2,j);

                temp =temp+(ans*b);
                temp_1 = (int)temp;
                System.out.print(temp_1 + " ");
            }
            temp=0;
            System.out.printf("\n");
        }
        in.close();
    }
}