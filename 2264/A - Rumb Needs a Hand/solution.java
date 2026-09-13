import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class RumbNeedsAHand {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t-->0){
            int n= in.nextInt();
            ArrayList<Integer> a=new ArrayList<>();
            for(int i=1;i<=n;i++){
                int val=in.nextInt();
                if(val!=i) a.add(val);
            }
            Collections.reverse(a);
            boolean isSorted=true;
            for(int i=0;i<a.size()-1;i++){
                if(a.get(i)>a.get(i+1)){
                    isSorted=false;
                    break;
                }
            }
            if(isSorted) sb.append("YES");
            else sb.append("NO");
            sb.append('
');
        }
        System.out.println(sb);
    }
}