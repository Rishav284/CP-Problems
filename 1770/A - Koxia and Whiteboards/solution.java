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
                ArrayList<Integer> b=new ArrayList<>();
                long total=0;
                for(int i=0;i<n;i++){
                    a.add(in.nextInt());
                }
                for(int i=0;i<m;i++){
                    b.add(in.nextInt());
                }
                Collections.sort(a);
                long ans=0;
                int i=0;
                while(i<m){
                    a.set(0,b.get(i));
                    Collections.sort(a);
                    i++;
                }
                for(int j=0;j<n;j++) total+=a.get(j);
                System.out.println(total);
            }
        }
}