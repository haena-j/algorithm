package algorithm;
import java.io.*;
public class Tree2957 {
	static int count = 0;
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Node node = null;
		for(int i=0; i<n; i++){
			int tmp = Integer.parseInt(br.readLine());
			if(node==null)
				node = new Node(tmp);
			else insert(node, tmp);
			sb.append(count+"\n");
		}
		System.out.println(sb);
	}
	public static void insert(Node n, int data){
		count++;
		if(n.data>data){
			if(n.left==null) n.left=new Node(data);
			else insert(n.left,data);
		}
		else if(n.data<data){
			if(n.right==null) n.right=new Node(data);
			else insert(n.right,data);
		}
	}
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int d){
			data=d;
			left=null;
			right=null;
		}
	}
}
