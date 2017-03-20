package algorithm;
import java.io.*;
import java.util.Stack;
public class Stack9012 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack;
		String[] list;
		String result="";
		for(int i=0; i<n; i++){
			list = br.readLine().trim().split("");
			stack = new Stack<Integer>();
			for(String a :list){
				if(a.equals("("))
					stack.push(1);
				else if(a.equals(")")){
					if(stack.isEmpty()){
						stack.push(1);
						break;
					}
					else
						stack.pop();
				}
			}
			if(stack.isEmpty())
				result += "YES\n";
			else
				result += "NO\n";
		}
		System.out.print(result);
	}
}
