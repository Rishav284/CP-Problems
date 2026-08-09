import java.util.Arrays;
import java.util.Scanner;
 
public class ThreeNumOnBlackBoard {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0){
            long[] a=new long[3];
            a[0]=in.nextLong();
            a[1]=in.nextLong();
            a[2]=in.nextLong();
            Arrays.sort(a);
            long ans=Math.min((a[2]-a[0]),Math.min(a[1],a[2]));
            System.out.println(ans);
        }
    }
}