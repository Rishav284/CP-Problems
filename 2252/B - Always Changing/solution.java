import java.util.Scanner;
 
public class AlwaysChanging {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t-->0){
            int n= in.nextInt();
            String s=in.next();
            int ones=0;
            int zeroes=0;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c=='0') zeroes++;
                else ones++;
            }
            int c0=0,c1=0;
            char prev='_';
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c!=prev){
                    if(c=='0') c0++;
                    else c1++;
                    prev=c;
                }
            }
            int diff=zeroes-ones;
            int len=-1;
            for(int i=-1;i<=1;i++){
                if(Math.abs(diff-i)<=1){
                    int a1=Math.min(c1,c0-i);
                    int a2=a1+i;
                    if(a1>=0 && a2>=0){
                        len=Math.max(len,a1+a2);
                    }
                }
            }
            if(len==-1) sb.append(-1);
            else sb.append(n-len);
            sb.append('
');
        }
        System.out.println(sb);
    }
}