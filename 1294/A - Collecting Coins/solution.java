import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer in = new StreamTokenizer(br);
        StringBuilder sb = new StringBuilder();
 
        in.nextToken();
        int q = (int) in.nval;
 
        for (int i = 0; i < q; i++) {
            int[] a = new int[3];
            for (int j = 0; j < 3; j++) {
                in.nextToken();
                a[j] = (int) in.nval;
            }
            in.nextToken();
            long n = (long) in.nval;
 
            Arrays.sort(a);
 
            n -= 2L * a[2] - a[1] - a[0];
 
            if (n < 0 || n % 3 != 0) {
                sb.append("NO").append('
');
            } else {
                sb.append("YES").append('
');
            }
        }
 
        System.out.print(sb);
    }
}