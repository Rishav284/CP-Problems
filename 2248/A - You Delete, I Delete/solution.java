import java.util.Scanner;
 
public class YouDeleteIDelete {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0){
            StringBuilder s=new StringBuilder(in.next());
            int i=0;
            while(i<s.length() && s.charAt(i)!='0') i++;
            s.delete(i,i+1);
            i=0;
            while(i<s.length() && s.charAt(i)!='1') i++;
            s.delete(i,i+1);
            System.out.println(s);
        }
    }
}