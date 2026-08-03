import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
 
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Long.parseLong(st.nextToken());
            }
            if (sum % 3 == 0) {
                sb.append("1 2
");
            } else {
                sb.append("0 0
");
            }
        }
 
        System.out.print(sb);
    }
}