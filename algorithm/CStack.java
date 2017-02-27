/*
 * 스택 만들기 연습
 */
package algorithm;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class CStack {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine().trim());
		CustomStack stack = new CustomStack();
		for(int i=0; i<num; i++){
			StringTokenizer cmd = new StringTokenizer(br.readLine());
			switch(cmd.nextToken()){
			case "push" :
				stack.push(Integer.parseInt(cmd.nextToken()));
				break;
			case "empty" :
			//	sb.append(stack.empty()+"\n");
				bw.write(stack.empty()+"\n");
				break;
			case "pop" :
			//	sb.append(stack.pop()+"\n");
				bw.write(stack.pop()+"\n");
				break;
			case "top" :
			//	sb.append(stack.top()+"\n");
				bw.write(stack.top()+"\n");
				break;
			case "size" :
			//	sb.append(stack.size()+"\n");
				bw.write(stack.size()+"\n");
				break;
			}
		}
		bw.close();
	}
	static class CustomStack{
		List<Integer> items;
		public CustomStack(){
			items = new ArrayList<Integer>();
		}
		public int empty(){
			if(items.isEmpty()) return 1;
			return 0;
		}
		public int size(){
			return items.size();
		}
		public void push(int n){
			items.add(n);
		}
		public int pop(){
			if(empty()==1) return -1;
			return items.remove(size()-1);
		}
		public int top(){
			if(empty()==1) return -1;
			return items.get(size()-1);
		}
	}
}
