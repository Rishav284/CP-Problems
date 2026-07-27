import java.util.Scanner;
 
public class HelpFulMaths {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int[] a=new int[3];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='1'){
                a[0]++;
            }else if(c=='2'){
                a[1]++;
            }else if(c=='3'){
                a[2]++;
            }
        }
        StringBuilder sb=new StringBuilder();
        while(a[0]-->0){
            sb.append('1');
            sb.append('+');
        }
        while(a[1]-->0){
            sb.append('2');
            sb.append('+');
        }
        while(a[2]-->0){
            sb.append('3');
            sb.append('+');
        }
        System.out.println(sb.substring(0,sb.length()-1));
    }
}