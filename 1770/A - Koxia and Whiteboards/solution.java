import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
public class KoxiaAndWhiteboards {
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int t=in.nextInt();
            while (t-->0){
                int n=in.nextInt();
                int m=in.nextInt();
                ArrayList<Integer> a=new ArrayList<>();
                for(int i=0;i<n+m-1;i++) a.add(in.nextInt());
                long ans=in.nextInt();
                Collections.sort(a);
                int i=0;
                while(i<n-1){
                    ans+=a.get(a.size()-1-i);
                    i++;
                }
                System.out.println(ans);
            }
        }
}