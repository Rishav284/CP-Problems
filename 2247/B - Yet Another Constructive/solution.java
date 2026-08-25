import java.util.Scanner;
 
public class YetAnotherConstructive {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0){
            int n=in.nextInt();
            int k=in.nextInt();
            int m=in.nextInt();
            if(k>m) System.out.println("NO");
            else {
                System.out.println("YES");
                int[] ans=new int[k];
                StringBuilder sb=new StringBuilder();
                for(int i=0;i<k-1;i++) ans[i]=1;
                ans[k-1]=m-k+1;
                int j=0;
                for(int i=0;i<n;i++,j++){
                    System.out.print(ans[j%ans.length]+" ");
                }
                System.out.println();
            }
        }
    }
}