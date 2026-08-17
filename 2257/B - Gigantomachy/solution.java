import java.util.Scanner;
 
public class BeaVer {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0){
            int n=in.nextInt();
            int m=in.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            long totalA=a[0]+(n-1);
            int[] b=new int[m];
            for(int i=0;i<m;i++){
                b[i]=in.nextInt();
            }
            long totalB=b[0]+(m-1);
            if(totalB>totalA) System.out.println(2);
            else System.out.println(1);
        }
    }
}