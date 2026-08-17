import java.util.HashSet;
import java.util.Scanner;
 
public class CreatingAbbreviations {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0){
            int n=in.nextInt();
            int m=in.nextInt();
            HashSet<Character> set=new HashSet<>();
            for(int i=0;i<n;i++){
                String s=in.next();
                s=s.toUpperCase();
                set.add(s.charAt(0));
            }
            boolean possible=true;
            for(int i=0;i<m;i++){
                String s=in.next();
                for(int j=0;j<s.length();j++){
                    if(!set.contains(s.charAt(j))) {
                        possible=false;
                        break;
                    }
                }
            }
            if(possible) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}