import java.util.Scanner;
 
public class ThresholdMovement {
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int t=in.nextInt();
            while (t-->0){
               int n=in.nextInt();
               int[] a=new int[n];
               int greater=Integer.MAX_VALUE;
               int smaller=0;
               for(int i=0;i<n;i++){
                   a[i]=in.nextInt();
                   if((i&1)==0) greater=Math.min(greater,a[i]);
                   else smaller=Math.max(smaller,a[i]);
               }
               if((n&1)==1 || (greater-smaller)<=1){
                   System.out.println("NO");
               }
               else System.out.println("YES");
            }
        }
}