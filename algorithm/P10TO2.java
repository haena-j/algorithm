/*
 * 10������ �Է¹޾� 2���� ���ڿ��� ����
 */
package algorithm;
import java.io.*;
public class P10TO2 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); //n �� �Է¹���
		StringBuffer sb = new StringBuffer();
		while(n>0){
			sb.append(n%2);
			n = n/2;
		}
		sb.reverse();
		String s = "";
		for(int i=0; i<sb.length(); i++)
			if(sb.charAt(i)==49) s+="0";
			else s+="1";
		System.out.println(Integer.parseInt(s.toString(), 2));
	}
}
