import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
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
 
            // Compress into blocks of equal colors
            int[] color = new int[n];
            int[] cnt = new int[n];
            int m = 0;
            for (int i = 0; i < n; i++) {
                if (m > 0 && color[m - 1] == a[i]) {
                    cnt[m - 1]++;
                } else {
                    color[m] = a[i];
                    cnt[m] = 1;
                    m++;
                }
            }
 
            int ans = m;
 
            // Case m+2: two adjacent blocks, both of length >= 2
            boolean plus2 = false;
            for (int i = 0; i + 1 < m; i++) {
                if (cnt[i] >= 2 && cnt[i + 1] >= 2) {
                    plus2 = true;
                    break;
                }
            }
 
            if (plus2) {
                ans = m + 2;
            } else {
                // Case m+1: a long block can borrow a neighbor via the swap
                boolean plus1 = false;
                for (int i = 0; i < m && !plus1; i++) {
                    if (cnt[i] < 2) continue;
 
                    boolean rightOk = (i + 1 < m) && (i + 2 >= m || color[i] != color[i + 2]);
                    boolean leftOk  = (i - 1 >= 0) && (i - 2 < 0 || color[i] != color[i - 2]);
 
                    if (rightOk || leftOk) plus1 = true;
                }
                if (plus1) ans = m + 1;
            }
 
            sb.append(ans).append('
');
        }
        System.out.print(sb);
    }
}