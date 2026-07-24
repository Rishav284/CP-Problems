import java.util.Scanner;
 
public class agfs {
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int t=in.nextInt();
            while (t-->0){
                long a=in.nextLong();
                long b=in.nextLong();
                long n=in.nextLong();
                long b1=Math.max(a,b);
                long a1=Math.min(a,b);
                int oprn=0;
                while(a1<=n && b1<=n){
                    oprn++;
                    if(a1<b1) a1+=b1;
                    else b1+=a1;
                }
                System.out.println(oprn);
            }
        }
}