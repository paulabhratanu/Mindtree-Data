import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaLeftRotations {

    static int[] leftRotation(int[] arr, int d, int n) {
        
         int i,j, temp;
        for(i=0;i<d;i++)
           {
            temp = arr[0];
            for (j = 0; j < n-1; j++)
            {
                arr[j] = arr[j+1];
            }
            arr[j] = temp;

           }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d, n);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
