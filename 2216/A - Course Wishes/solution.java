import java.util.Arrays;
import java.util.Scanner;
 
public class CourseWishes {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0){
            int n=in.nextInt();
            int k=in.nextInt();
            int[] a=new int[k];
            for(int i=0;i<k;i++){
                a[i]=in.nextInt();
            }
            int[][] b=new int[n][2];
            int lastLevel=k+1;
            int m=0;
            for(int i=0;i<n;i++){
                b[i][0]=in.nextInt();
                m+=(lastLevel-b[i][0]);
                b[i][1]=i+1;
            }
            System.out.println(m);
            if(m!=0){
                Arrays.sort(b,(x,y)->Integer.compare(x[0],y[0]));
                for(int i=b.length-1;i>=0;i--){
                    int counter=(lastLevel-b[i][0]);
                    while(counter>0){
                        System.out.print(b[i][1]+" ");
                        counter--;
                    }
                }
            }
            System.out.println();
        }
    }
}