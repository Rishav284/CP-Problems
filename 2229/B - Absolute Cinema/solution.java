import java.io.*;
import java.util.*;
 
public class Main
{
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=in.nextInt();
		    }
		    long ans=0;
		    int max=0;
		    for(int i=0;i<n;i++){
		        int val=in.nextInt();
		        ans+=Math.max(a[i],val);
		        max=Math.max(max,Math.min(a[i],val));
		    }
		    ans+=max;
		    System.out.println(ans);
		}
	}
}