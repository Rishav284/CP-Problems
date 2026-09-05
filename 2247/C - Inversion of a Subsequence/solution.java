import java.util.Scanner;
 
public class InversionOfSubseq_fixed {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder result=new StringBuilder();
        while (t-->0){
            int n=in.nextInt();
            StringBuilder sb1=new StringBuilder();
            StringBuilder sb2=new StringBuilder();
            for(int i=0;i<n;i++){
                int v=in.nextInt();
                sb1.append(v);
            }
            boolean allMatch=true;
            for(int i=0;i<n;i++){
                int v=in.nextInt();
                sb2.append(v);
                if(sb1.charAt(i)!=sb2.charAt(i)) allMatch=false;
            }
            if(allMatch) {
                result.append(0).append('
');
                continue;
            }
 
            // d = number of mismatched positions, s = sum of a[i] over mismatches
            // freeZero = exists position outside the mismatches with a=b=0
            // freeOne  = exists position outside the mismatches with a=b=1
            int d=0;
            int s=0;
            boolean freeZero=false;
            boolean freeOne=false;
            for(int i=0;i<n;i++){
                int av=sb1.charAt(i)-'0';
                int bv=sb2.charAt(i)-'0';
                if(av!=bv){
                    d++;
                    s+=av;
                } else {
                    if(av==0) freeZero=true;
                    else freeOne=true;
                }
            }
 
            int totalOperation;
            if(d==0){
                totalOperation=0; // unreachable here since allMatch already handled, kept for clarity
            } else if((s&1)==1){
                totalOperation=1;
            } else if(s>=2){
                totalOperation=2;
            } else { // s==0: every mismatch needs a 0 -> 1 flip
                totalOperation = (freeZero && freeOne) ? 2 : -1;
            }
 
            result.append(totalOperation).append('
');
        }
        System.out.print(result);
    }
}