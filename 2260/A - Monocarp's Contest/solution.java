import java.util.Scanner;
 
public class MonoCarpContest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t-->0){
           int n=in.nextInt();
           int a1=-1;
           int a2=-1;
           boolean z1=false;
           for(int i=0;i<n;i++){
               int v= in.nextInt();
               if(v==0 && !z1){
                   a1=i;
                   z1=true;
               }
               if(v==0) a2=i;
           }
           if(a1==a2){
               sb.append(-1).append('
');
           }
           else if(a1==0 && a2==n-1) sb.append(0).append('
');
           else if(a1==0 || a2==n-1) sb.append(1).append('
');
           else sb.append(2).append('
');
        }
        System.out.println(sb);
    }
}