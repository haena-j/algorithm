/*
 * 계수정렬 범위 음수포함 (정수)
 * 백준알고리즘 2751
 */
package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CountingSort2 {
	public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr= new int[n];
        int max=0;
        int min=0;
		boolean[] b;
        boolean[] m_b;
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(max<arr[i]) max=arr[i];
            if(min>arr[i]) min=arr[i];
        }
        b = new boolean[max+1];
        m_b = new boolean[-min+1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0)
                b[arr[i]]=true;
            else
                m_b[-arr[i]]=true;
        }
        for(int j=m_b.length-1; j>=0; j--)
            if(m_b[j]==true)
                bw.write(-j+"\n");
        for(int j=0;j<b.length;j++)
            if(b[j]==true)
                bw.write(j+"\n");
        bw.close();
    }
}