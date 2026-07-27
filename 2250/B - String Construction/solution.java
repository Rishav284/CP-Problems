import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class StringConstructor {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine().trim());
        while (t-->0){
            StringTokenizer in = new StringTokenizer(br.readLine());
            int n=Integer.parseInt(in.nextToken());
            int k=Integer.parseInt(in.nextToken());
            StringBuilder sb=new StringBuilder();
            if(k>n-2){
                System.out.println(-1);
                continue;
            }
            int numOf1=(k+1)/2+1;
            int numOf0=(k/2)+1;
            int i=0;
            if(k<(n-2)){
                i=1;
                sb.append(0);
            }
            while(numOf1-->0 && i<n) {
                i++;
                sb.append(1);
            }
            while(numOf0-->0 && i<n) {
                i++;
                sb.append(0);
            }
            int num=1;
            while (i<n){
                i++;
                if(num==1){
                    sb.append(1);
                    num=0;
                }else{
                    sb.append(0);
                    num=1;
                }
            }
            System.out.println(sb.toString());
        }
    }
}