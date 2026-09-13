import java.util.Scanner;
 
public class FloorOfMeX {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t-->0) {
            int n=in.nextInt();
            int[] a=new int[n+1];
            for (int k=1;k<=n;k++){
                a[k]=in.nextInt();
            }
            int[] b=new int[n+2];
            for (int i=1;i<=n;i++){
                long l=(long)a[i]*i;
                if (l<=n-1){
                    long p=Math.min((n-1),(l+i-1));
                    b[(int)l]+=1;
                    b[(int)p+1]-=1;
                }
            }
            int[] ans=new int[n];
            int curr=0;
            int m=0;
            for (int i=0;i<n;i++) {
                curr+=b[i];
                if(curr==0) {
                    ans[m++]=i;
                }
            }
            sb.append(m).append('
');
            for (int i=0;i<m;i++) {
                sb.append(ans[i]);
                if (i+1<m) sb.append(' ');
            }
            sb.append('
');
        }
        System.out.print(sb);
    }
}