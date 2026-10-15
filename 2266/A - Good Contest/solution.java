import java.util.Scanner;
 
public class GoodContest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t-->0){
            int n=in.nextInt();
            int a1=in.nextInt();
            int a2=in.nextInt();
            int a3=in.nextInt();
            int min=Math.min(a1,Math.min(a2,a3));
            sb.append(n-min).append('
');
        }
        System.out.println(sb);
    }
}