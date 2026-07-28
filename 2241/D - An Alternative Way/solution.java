import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class AnAlternativeWay {
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t=in.nextInt();
        while (t-->0){
            int n=in.nextInt();
            long[] a=new long[n];
            for(int i=0;i<n ;i++){
                a[i]=in.nextLong();
            }
            long[] b=new long[n];
            for(int i=0;i<n;i++){
                b[i]=in.nextLong();
            }
            for(int i = 1; i < n; i++) a[i] += a[i - 1];
            for(int i = 1; i < n; i++) b[i] += b[i - 1];
            boolean possible=true;
            for(int i=0;i<n;i++){
                if(a[i]>b[i]){
                    possible=false;
                    break;
                }
            }
            if(possible) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}