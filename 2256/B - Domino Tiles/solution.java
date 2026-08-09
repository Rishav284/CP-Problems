import java.util.Scanner;
 
public class DominoTiles {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0){
            int n=in.nextInt();
            String s=in.next();
            boolean a0=true;
            boolean a1=true;
            boolean b0=true;
            boolean b1=true;
            for(int i=0;i<n;++i){
                char c=s.charAt(i);
                if(c=='?') continue;
                int possibleSeq=i/2;
                char nxt0=(possibleSeq%2==0)? '0':'1';
                char nxt1=(possibleSeq%2==0)? '1':'0';
                if((i&1)==0){
                    if(c!=nxt0){
                        a0=false;
                    }
                    if(c!=nxt1){
                        a1=false;
                    }
                }
                else{
                    if(c!=nxt0) {
                        b0=false;
                    }
                    if(c!=nxt1){
                        b1=false;
                    }
                }
            }
            int validEPatterns=((a0)?1:0)+((a1)?1:0);
            int validOPatterns=((b0)?1:0)+((b1)?1:0);
            int totalValidWays=validEPatterns*validOPatterns;
            System.out.println(totalValidWays);
        }
    }
}