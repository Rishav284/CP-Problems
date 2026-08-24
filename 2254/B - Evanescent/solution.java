import java.io.*;
import java.util.*;
 
public class EvaneScent {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
 
            // total number of blocks in f(s)
            int blocks = 1;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(i - 1)) blocks++;
            }
 
            // best (most negative) change achievable by deleting ONE interior character
            int bestDelta = 0; // 0 is always achievable (delete an end-of-block char)
            for (int i = 1; i < n - 1; i++) { // 0-indexed interior positions == 1-indexed i in [2, n-1]
                char cur = s.charAt(i);
                char left = s.charAt(i - 1);
                char right = s.charAt(i + 1);
 
                int delta;
                if (cur == left || cur == right) {
                    delta = 0;                 // just shrinks its block, no block count change
                } else if (left == right) {
                    delta = -2;                // isolated char whose removal merges two matching blocks
                } else {
                    delta = -1;                // isolated char whose removal just deletes its own block
                }
 
                if (delta < bestDelta) bestDelta = delta;
            }
 
            out.append(blocks + bestDelta).append('
');
        }
 
        System.out.print(out);
    }
}