import java.util.ArrayList;
import java.util.Scanner;
 
public class KisImportant {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t-->0){
            int n=in.nextInt();
            int k=in.nextInt();
            ArrayList<Integer> a=new ArrayList<>();
            for(int i=0;i<n;i++){
                a.add(in.nextInt());
            }
            long sum=0;
            while(a.size()>=k){
                int n1=k-1;
                int n2=a.size()-k;
                int val=Math.max(a.get(n1),a.get(n2));
                sum+=val;
                if(a.get(n1)>a.get(n2)) a.remove(n1);
                else a.remove(n2);
            }
            sb.append(sum).append('
');
        }
        System.out.println(sb);
    }
}