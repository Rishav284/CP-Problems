import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
 
public class RightMaximum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0){
            int n=in.nextInt();
            int[] freq=new int[n+1];
            int[] a=new int[n];
            PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
                freq[a[i]]++;
                if(freq[a[i]]==1) pq.add(a[i]);
            }
            int ans=0;
            int currMax=0;
            if(!pq.isEmpty()) currMax=pq.poll();
            int r=n-1;
            while(r>=0){
                if(a[r]==currMax && freq[currMax]==1){
                    if(!pq.isEmpty()){
                        currMax=pq.poll();
                        while(freq[currMax]==0 && !pq.isEmpty()) currMax=pq.poll();
                    }
                    ans++;
                }else if(a[r]==currMax && freq[currMax]>1){
                    freq[currMax]--;
                    ans++;
                }
                else{
                    freq[a[r]]--;
                }
                r--;
            }
            System.out.println(ans);
        }
    }
}