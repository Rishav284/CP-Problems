import java.util.Scanner;
 
public class AND_OR_Sort{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t-->0){
            int n=in.nextInt();
            String s=in.next();
            int total0=0;
            int total1=0;
            int[] freq0=new int[n];
            int[] freq1=new int[n];
            boolean isSorted=true;
            int preVal=-1;
            for(int i=0;i<n;i++){
                char c=s.charAt(i);
                if(i==0){
                    preVal=c-'0';
                }
                else{
                    freq0[i]=freq0[i-1];
                    freq1[i]=freq1[i-1];
                }
                int val=c-'0';
                if(val<preVal) isSorted=false;
                preVal=val;
                if(c=='0'){
                    total0++;
                    freq0[i]++;
                }
                else{
                    total1++;
                    freq1[i]++;
                }
            }
            if(isSorted){
                sb.append(0).append('
');
                continue;
            }
            if(s.charAt(0)=='1'){
                sb.append(total0).append('
');
                continue;
            }
            int ans=Integer.MAX_VALUE;
            for(int i=n-1;i>=0;i--){
                if(s.charAt(i)=='0'){
                    int oprn=total0-freq0[i]+freq1[i];
                    ans=Math.min(ans,oprn);
                }
                else if(s.charAt(i)=='1'){
                    int oprn=total0-freq0[i]+freq1[i]-1;
                    ans=Math.min(ans,oprn);
                }
            }
            sb.append(ans).append('
');
        }
        System.out.println(sb);
    }
}