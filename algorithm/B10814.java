package algorithm;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class B10814 {
	public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> arr = new ArrayList<String>();
        for(int i=0; i<n; i++)
        	arr.add(br.readLine());
        Collections.sort(arr, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				String[] tmp = o1.split(" ");
				int n1 = Integer.parseInt(tmp[0]);
				tmp = o2.split(" ");
				int n2 = Integer.parseInt(tmp[0]);
				if(n1>n2) return 1;
				else if(n1<n2) return -1;
				return 0;
			}
        });
        for(String s:arr)
        	sb.append(s+"\n");
        System.out.println(sb);
    }
}
