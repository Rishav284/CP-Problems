//import java.util.Scanner;
//
//public class WeBeFlipping {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        int t=in.nextInt();
//        StringBuilder sb=new StringBuilder();
//        while (t-->0){
//            int n=in.nextInt();
//            int[] a=new int[n];
//            boolean allSame=true;
//            for(int i=0;i<n;i++){
//                a[i]=in.nextInt();
//                if(i>0 && ((a[i]>0 && a[i-1]<0) || (a[i]<0 && a[i-1]>0))) allSame=false;
//            }
//            if(allSame){
//                if(a[0]<=0){
//                    sb.append(0).append('
');
//                }else{
//                    sb.append(1).append('
').append(n);
//                }
//                sb.append('
');
//                continue;
//            }
//            int countPos=0;
//            StringBuilder s=new StringBuilder();
//            int lastNeg=0;
//            for(int i=1;i<=n;i++){
//                if(a[i-1]<0)
//            }
//        }
//    }
//}
import java.io.*;
import java.util.*;
 
public class WeBeFlipping{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int t = (int) st.nval;
        StringBuilder sb = new StringBuilder();
 
        while (t-- > 0) {
            st.nextToken();
            int n = (int) st.nval;
 
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                st.nextToken();
                a[i] = (int) st.nval;
            }
 
            int par = 0;
            List<Integer> ans = new ArrayList<>();
            for (int i = n - 1; i >= 0; i--) {
                if (par == 1) a[i] = -a[i];
                if (a[i] > 0) {
                    ans.add(i);
                    par ^= 1;
                }
            }
 
            sb.append(ans.size()).append("
");
            for (int i = 0; i < ans.size(); i++) {
                sb.append(ans.get(i) + 1);
                sb.append(i == ans.size() - 1 ? "
" : " ");
            }
        }
 
        System.out.print(sb);
    }
}