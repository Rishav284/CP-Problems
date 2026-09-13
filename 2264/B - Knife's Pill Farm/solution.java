import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;
 
public class KnifesPillFarm {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t-->0){
            int n=in.nextInt();
            int m=in.nextInt();
            long[] a=new long[n];
            for (int i=0;i<n;i++) a[i]=in.nextLong();
            long max;
            if (m==1) {
                long maxVal=Long.MIN_VALUE;
                for (int i=0;i<n;i++) maxVal=Math.max(maxVal,a[i]);
                max=maxVal;
            }
            else{
                PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
                long currSum=0;
                for(int i=0;i<m-1;i++){
                    pq.add(a[i]);
                    currSum+=a[i];
                }
                max=Long.MIN_VALUE;
                for (int i=m-1;i<n;i++) {
                    long scr=(long)m*a[i]-currSum;
                    max=Math.max(max,scr);
                    if (i<n-1){
                        long maxInHeap=pq.peek();
                        if (a[i]<maxInHeap){
                            currSum-=maxInHeap;
                            currSum+=a[i];
                            pq.poll();
                            pq.add(a[i]);
                        }
                    }
                }
            }
            sb.append(max).append('
');
        }
        System.out.print(sb);
    }
}