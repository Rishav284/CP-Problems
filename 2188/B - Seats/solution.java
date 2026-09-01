import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
 
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            s = "1" + s + "1";
 
            int ans = 0;
            int l = 0;
            for (int i = 1; i <= n; ++i) {
                if (s.charAt(i) == '0') {
                    if (s.charAt(i - 1) == '1') {
                        l = i;
                    }
                    if (s.charAt(i + 1) == '1') {
                        int c = ((l == 1) ? 1 : 0) + ((i == n) ? 1 : 0);
                        ans += (i - l + 1 + c) / 3;
                    }
                } else {
                    ++ans;
                }
            }
            out.append(ans).append('
');
        }
 
        System.out.print(out);
    }
}