import java.util.Arrays;
import java.util.Scanner;
 
public class MergeToMatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder sb= new StringBuilder();
        while (t-->0) {
            int n= in.nextInt();
            int m= in.nextInt();
            long[] a= new long[n];
            for (int i=0;i<n;i++) a[i]=in.nextLong();
            long[] b = new long[m];
            for (int i=0;i<m;i++) b[i]=in.nextLong();
            Arrays.sort(a);
            Arrays.sort(b);
            boolean possible=(n>=2*m);
            if (possible) {
                for (int i=0;i<m;i++) {
                    if (a[i]>=b[i]){
                        possible = false;
                        break;
                    }
                }
            }
            if(possible) {
                for(int i=0;i<m;i++){
                    if (a[n-m+i]<=b[i]){
                        possible = false;
                        break;
                    }
                }
            }
            if(possible) sb.append("YES");
            else sb.append("NO");
            sb.append('
');
        }
        System.out.print(sb);
    }
}