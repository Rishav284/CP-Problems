import java.util.*;
 
public class BossFight {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t-->0){
            int n=in.nextInt();
            long sum=0;
            HashMap<Integer, Integer> freq=new HashMap<>();
            for (int i=0;i<n;i++) {
                int val=in.nextInt();
                sum+=val;
                freq.merge(val, 1, Integer::sum);
            }
            int maxVal=-1,maxCount=0;
            for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
                if (e.getValue()>maxCount) {
                    maxCount=e.getValue();
                    maxVal=e.getKey();
                }
            }
            int rest=n-maxCount;
            long ans=sum;
            if (maxCount>rest+1) {
                int wasted=maxCount-rest-2;
                ans-=(long)maxVal*wasted;
            }
            sb.append(ans).append('
');
        }
        System.out.print(sb);
    }
}