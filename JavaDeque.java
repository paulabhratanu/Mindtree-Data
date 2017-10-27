    import java.util.*;
    public class JavaDeque {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int maxunique=0;
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
               deque.add(num);
            }
            for(int i=0;i<n;i++)
            {
                int num=in.nextInt();
                if(i==0)
                {
                    deque.add(num);
                    maxunique++;
                }else{
                    if(deque.size()==m)
                    {
                        deque.removeFirst();
                    }
                    if(!deque.contains(num)&&maxunique<m)
                    {
                        maxunique++;
                    }
                    deque.addLast(num);
                }
            }
            System.out.println(maxunique);



        }
    }
