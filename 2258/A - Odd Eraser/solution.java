import java.util.Scanner;
 
public class OddEraser {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0){
            int n=in.nextInt();
            int first=1;
            int last=1;
            for(int i=0;i<n;i++){
                int val=in.nextInt();
                if(i==0) first=val;
                if(i==n-1) last=val;
            }
            System.out.println(gcd(first,last));
        }
    }
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}