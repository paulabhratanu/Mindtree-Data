import java.util.*;

public class DynamicArray {

   public static void main(String[] args) {
   
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int q=sc.nextInt();
   int lastanswer=0;
   ArrayList<Integer>[] seqlist=new ArrayList[n];
   while(q-->0){
   	int type=sc.nextInt();
   	int x=sc.nextInt();
   	int y=sc.nextInt();

   	int index=(x^lastanswer)%n;

   switch(type){
   	case 1:
   	       if(seqlist[index]==null)
   	       {
   	       	ArrayList<Integer> mylist=new ArrayList<>();
   	       	mylist.add(y);
   	       	seqlist[index]=mylist;
   	       }else{
   	       	seqlist[index].add(y);
   	       }
   	       break;
   	case 2:
   		   int temp=(x^lastanswer)%n;
   		   lastanswer=seqlist[index].get(y%(seqlist[index].size()));
   		   System.out.println(lastanswer);
   		   break;

   }

   }


	}
}