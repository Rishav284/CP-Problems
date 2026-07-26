import java.util.Scanner;
 
public class StringConstruction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            while (t-- > 0) {
                int n = in.nextInt();
                int k=in.nextInt();
                if(k==n-1) {
                    System.out.println(-1);
                }
                else {
                    int num0=n/2;
                    int num1=n-num0;
                    int tblock=n-1-k;
                    int block1=(tblock+2)/2;
                    int block0=(tblock+1)/2;
                    boolean startWithOne = true;
                    if (num1 < block1 || num0 < block0) {
                        startWithOne = false;
                        block1 = (tblock + 1) / 2;
                        block0 = (tblock + 2) / 2;
                    }
                    StringBuilder sb = new StringBuilder();
                    boolean curr = startWithOne;
                    for (int i = 0; i <= tblock; i++) {
                        if (curr) {
                            int count = num1 / block1;
                            num1 -= count;
                            block1--;
                            for (int j = 0; j < count; j++) {
                                sb.append('1');
                            }
                        } else {
                            int count = num0 / block0;
                            num0 -= count;
                            block0--;
                            for (int l = 0; l < count; l++) {
                                sb.append('0');
                            }
                        }
                        curr = !curr;
                    }
                    System.out.println(sb.toString());
            }
        }
    }
}