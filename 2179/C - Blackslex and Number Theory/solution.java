import java.io.*;
import java.util.*;
 
public class BlackslexAndNT {
    public static void main(String[] args) throws IOException {
        DataInputStream br = new DataInputStream(new BufferedInputStream(System.in, 1 << 16));
        int t = nextInt(br);
        StringBuilder sb = new StringBuilder();
 
        while (t-- > 0) {
            int n = nextInt(br);
            long a = Long.MAX_VALUE, b = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                long val = nextInt(br);
                if (val < a) {
                    b = a;
                    a = val;
                } else if (val < b) {
                    b = val;
                }
            }
 
            long ans;
            long d = b - a;
            if (a > 0 && d > a) {
                ans = d;                       // O(1): d itself is the answer
            } else if (a == 0 && d > 1) {
                ans = largestProperDivisor(d);  // rare fallback, O(sqrt(d))
            } else {
                ans = a;                        // no valid x exists
            }
            sb.append(ans).append('
');
        }
        System.out.print(sb);
    }
 
    // largest divisor of d that is strictly less than d
    private static long largestProperDivisor(long d) {
        for (long i = 2; i * i <= d; i++) {
            if (d % i == 0) return d / i;   // d/i is the largest proper divisor once i is smallest factor
        }
        return 1; // d is prime
    }
 
    private static int nextInt(DataInputStream br) throws IOException {
        int ret = 0, b;
        boolean neg = false;
        do { b = br.read(); } while (b < '0' && b != '-');
        if (b == '-') { neg = true; b = br.read(); }
        while (b >= '0') { ret = ret * 10 + b - '0'; b = br.read(); }
        return neg ? -ret : ret;
    }
}