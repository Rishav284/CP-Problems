import java.util.Scanner;
 
public class Cp101 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0){
            int n=in.nextInt();
            boolean foundFirst=false;
            int firstInd=-1;
            int lastInd=-1;
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]= in.nextInt();
                if(a[i]!=0){
                    if(!foundFirst) {
                        firstInd=i;
                        foundFirst=true;
                    }
                    lastInd=i;
                }
            }
            if(firstInd==lastInd){
                print(a);
                continue;
            }
            a[firstInd]=1;
            a[lastInd]=1;
            for(int i=firstInd+1;i<lastInd;i++){
                if(a[i]==-1) a[i]=0;
            }
            print(a);
        }
    }
    static void print(int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]==-1) a[i]=1;
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}