import java.util.*;
import java.io.*;
 
public class MaximizeXORMinimizeOprn {
    static final int bits=30;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine().trim());
        StringBuilder sb=new StringBuilder();
        while (t-->0){
            StringTokenizer st=new StringTokenizer(br.readLine());
            long x1=Long.parseLong(st.nextToken());
            long x2=Long.parseLong(st.nextToken());
            long s=x1+x2;
            long a=0;
            boolean bool=false;
            for (int i=bits;i>=0;i--) {
                long bit=1L<<i;
                boolean bit1=(s & bit)!=0;
                boolean bit2=(x1 & bit)!=0;
                if (bool){
                    if(bit1) a|=bit;
                }
                else{
                    if(bit1 && bit2){
                        a|=bit;
                    }
                    else if(!bit1 && bit2) {
                        bool=true;
                    }
                }
            }
            long ans=x1-a;
            sb.append(s).append(' ').append(ans).append('
');
        }
        System.out.print(sb);
    }
}