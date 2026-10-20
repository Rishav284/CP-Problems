import java.util.Scanner;
 
public class ImpostOrSus {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder sb=new StringBuilder();
        while (t-->0){
            StringBuilder s=new StringBuilder(in.next());
            int ans=0;
            if(s.charAt(0)=='u') {
                ans++;
                s.setCharAt(0,'s');
            }
            if(s.charAt(s.length()-1)=='u'){
                ans++;
                s.setCharAt(s.length()-1,'s');
            }
            int countUs=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='u') countUs++;
                else{
                    ans+=(countUs/2);
                    countUs=0;
                }
            }
            sb.append(ans).append('
');
        }
        System.out.println(sb);
    }
}