import java.util.Scanner;
 
public class RedBlackPairs {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0){
            int n= in.nextInt();
            String s1=in.next();
            String s2=in.next();
            int ans=0;
            for(int i=0;i<n;i++){
                char centre=s1.charAt(i);
                if(centre==s2.charAt(i)){
                    continue;
                }
                else if(i<n-1 && centre==s1.charAt(i+1)){
                    if(s2.charAt(i)!=s2.charAt(i+1)) ans++;
                    i++;
                }else{
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}