import java.util.Scanner;
 
public class MexReordering {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t-->0){
            int n= in.nextInt();
            int count0s=0;
            int count1s=0;
            for(int i=0;i<n;i++){
                int val=in.nextInt();
                if(val==1) count1s++;
                if(val==0) count0s++;
            }
            if((count0s>1 && count1s<1) || count0s==0){
                sb.append("NO");
            }else{
                sb.append("YES");
            }
            sb.append('
');
        }
        System.out.println(sb);
    }
}