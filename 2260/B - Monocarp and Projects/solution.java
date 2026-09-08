import java.util.Scanner;
 
public class MonocarpAndProject {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t-->0) {
            long x=in.nextLong();
            long y=in.nextLong();
            long k=in.nextLong();
            long diff=y-x;
            long max=x+k-1;
            long impPoint=Math.min(max,diff);
            long ans=0;
            if (x<=impPoint) {
                for(long i=x;i<=impPoint;i++) {
                    ans+=diff%i;
                }
            }
            long rest=Math.max(x,diff+1);
            if (rest<=max) {
                long count=max-rest+1;
                ans+=diff*count;
            }
            sb.append(ans).append('
');
        }
        System.out.print(sb);
    }
}