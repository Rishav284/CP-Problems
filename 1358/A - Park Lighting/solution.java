import java.util.Scanner;
 
public class ParkLighting {
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int t=in.nextInt();
            while (t-->0){
                int n=in.nextInt();
                int m=in.nextInt();
                int ans= (int) Math.ceil((double) (n * m) / 2);
                System.out.println(ans);
            }
        }
}