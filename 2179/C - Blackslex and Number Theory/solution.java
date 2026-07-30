import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class BlackslexAndNT {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer a1=new StringTokenizer(br.readLine());
        int t=Integer.parseInt(a1.nextToken());
        while (t-->0){
            StringTokenizer in1=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(in1.nextToken());
            StringTokenizer in=new StringTokenizer(br.readLine());
            long a=Integer.MAX_VALUE,b=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                long val=Integer.parseInt(in.nextToken());
                if(val<a){
                    b=a;
                    a=val;
                }else if(val<b) b=val;
            }
            long ans =Math.max(a,b-a);
            System.out.println(ans);
        }
    }
}