//계수정렬
package algorithm;
import java.io.*;
public class CountingSort {
	  public static void main(String args[]) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        int n = Integer.parseInt(br.readLine());
	        int[] arr= new int[n];
	        int max=0;
			boolean[] b;
	        for(int i=0;i<n;i++){
	            arr[i] = Integer.parseInt(br.readLine());
	            if(max<arr[i]) max=arr[i];
	        }
	        b = new boolean[max+1];
	        
	        for(int i=0;i<arr.length;i++)
	            b[arr[i]]=true;
	        for(int j=0;j<b.length;j++)
	            if(b[j]==true)
	                bw.write(j+"\n");
	        bw.close();
	    }
	}