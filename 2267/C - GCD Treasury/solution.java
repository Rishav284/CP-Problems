import java.util.*;
import java.io.*;
 
public class GCDTreasury {
    public static void main(String[] args) throws IOException {
        Scanner in= new Scanner(System.in);
        int t=in.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            int n=in.nextInt();
            int x0=in.nextInt();
            int[] a=new int[n];
            for (int i=0;i<n;i++) a[i]=in.nextInt();
            int[] primeNo=new int[7];
            int[] expo=new int[7];
            int k=0;
            int temp=x0;
            for (int i=2;(long)i*i<=temp;i++) {
                if (temp%i==0) {
                    int e=0;
                    while(temp%i==0) {
                        temp/=i;
                        e++;
                    }
                    primeNo[k]=i;
                    expo[k]=e;
                    k++;
                }
            }
            if (temp>1){
                primeNo[k]=temp;
                expo[k]=1;
                k++;
            }
            int[] sizeArr=new int[k];
            int[] stride=new int[k];
            int d0=1;
            for(int i=0;i<k;i++) {
                sizeArr[i]=expo[i]+1;
                stride[i]=d0;
                d0*=sizeArr[i];
            }
            int[][] vec=new int[d0][k];
            for (int i=0;i<d0;i++){
                int l=i;
                for (int j=0;j<k;j++){
                    vec[i][j] = l % sizeArr[j];
                    l/=sizeArr[j];
                }
            }
            long[] cnt=new long[d0];
            boolean[] usedMark=new boolean[d0];
            int[] usedList=new int[d0];
            int usedCnt=0;
            for (int i=0;i<n;i++) {
                int ai=a[i];
                int ind=0;
                for (int j=0;j<k;j++) {
                    int p=primeNo[j];
                    int maxE=expo[j];
                    int val0=0;
                    int val1=ai;
                    while(val0<maxE && val1%p==0){
                        val1/=p;
                        val0++;
                    }
                    ind+=val0*stride[j];
                }
                if (ind==0) continue;
                if (!usedMark[ind]){
                    usedMark[ind]=true;
                    usedList[usedCnt++]=ind;
                }
                cnt[ind] += ai;
            }
            boolean[] visited=new boolean[d0];
            int[] queue=new int[d0];
            int qHead=0;
            int qTail = 0;
            int startIdx=d0-1;
            visited[startIdx]=true;
            queue[qTail++]=startIdx;
            int[] rList=new int[d0];
            int rCnt=0;
            rList[rCnt++]=startIdx;
            while (qHead<qTail) {
                int y=queue[qHead++];
                int[] vy=vec[y];
                for (int u=0;u<usedCnt;u++) {
                    int[] vd=vec[usedList[u]];
                    int zIdx=0;
                    for (int j=0;j<k;j++){
                        zIdx+=Math.min(vy[j],vd[j])*stride[j];
                    }
                    if(zIdx==0 || visited[zIdx]) continue;
                    visited[zIdx]=true;
                    queue[qTail++]=zIdx;
                    rList[rCnt++]=zIdx;
                }
            }
            long ans=0;
            for (int r=0;r<rCnt;r++) {
                int[] vy=vec[rList[r]];
                long total=0;
                for (int u=0;u<usedCnt;u++) {
                    int d=usedList[u];
                    int[] vd=vec[d];
                    boolean pos=true;
                    for (int j=0;j<k;j++){
                        if(vy[j]>vd[j]){
                            pos=false;
                            break;
                        }
                    }
                    if(pos) total+=cnt[d];
                }
                if (total>ans) ans=total;
            }
            sb.append(ans).append('
');
        }
        System.out.print(sb);
    }
}