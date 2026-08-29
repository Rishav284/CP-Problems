import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class CarrotChopDown {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0){
            int n=in.nextInt();
            int m=in.nextInt();
            int[] freq = new int[m+2];
            for(int i=0;i<n;i++){
                int val=in.nextInt();
                freq[val]++;
            }
            int[] suffix=new int[m + 2];
            for (int l=m;l>=1;l--) {
                suffix[l]=suffix[l+1]+freq[l];
            }
            int ans=0;
            for (int x=1;x<=m;x++) {
                int cnt=freq[x]+suffix[x+1];
                if (2*x<=m) {
                    cnt+=freq[2*x];
                }
                if (cnt>ans) ans=cnt;
            }
            System.out.println(ans);
        }
    }
}