import java.util.Scanner;
 
public class CakeLevelling {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t-->0){
            int n=in.nextInt();
            long min= (long) 1e9;
            long sum=0;
            StringBuilder s=new StringBuilder();
            for(int i=1;i<=n;i++){
                int val=in.nextInt();
                sum+=val;
                min=Math.min(min,sum/i);
                s.append(min).append(" ");
            }
            sb.append(s).append('
');
        }
        System.out.println(sb);
    }
}