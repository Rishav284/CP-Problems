import java.util.ArrayList;
import java.util.Scanner;
 
public class ezraftAndArray {
    static ArrayList<Long> ans=new ArrayList<>();
    public static void main(String[] args) {
        ans.add(1L);
        ans.add(2L);
        ans.add(3L);
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t-->0){
            int n=in.nextInt();
            if(n==2) {
                sb.append(-1).append('
');
                continue;
            }
            while(ans.size()<n){
                ans.add(ans.getLast()*2);
            }
            for(int i=0;i<n;i++){
                sb.append(ans.get(i)).append(" ");
            }
            sb.append('
');
        }
        System.out.println(sb);
    }
}