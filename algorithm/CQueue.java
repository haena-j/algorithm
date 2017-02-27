/*
 * 큐 만들기 연습
 */
package algorithm;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class CQueue {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		CustomQueue queue = new CustomQueue();
		int num = Integer.parseInt(br.readLine().trim());
		for(int i=0; i<num; i++){
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			switch(st.nextToken()){
			case "push" :
				queue.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop" :
				sb.append(queue.pop()+"\n");
				break;
			case "size" :
				sb.append(queue.size()+"\n");
				break;
			case "empty" :
				sb.append(queue.empty()+"\n");
				break;
			case "front" :
				sb.append(queue.front()+"\n");
				break;
			case "back" :
				sb.append(queue.back()+"\n");
			}
		}
		System.out.println(sb);
	}
	static class CustomQueue{
		List<Integer> items;		
		public CustomQueue(){
			items = new ArrayList<>();
		}
		public void push(int n){
			items.add(n);
		}
		public int pop(){
			if(empty()==1) return -1;
			return items.remove(0);
		}
		public int front(){
			if(empty()==1) return -1;
			return items.get(0);
		}
		public int back(){
			if(empty()==1) return -1;
			return items.get(size()-1);
		}
		public int size(){
			return items.size();
		}
		public int empty(){
			if(items.isEmpty()) return 1;
			return 0;
		}
	}
}
