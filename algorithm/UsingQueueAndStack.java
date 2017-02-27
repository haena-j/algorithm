package algorithm;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
public class UsingQueueAndStack {
	public static void main(String args[]){
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		Queue<Integer> queue = new ArrayDeque<Integer>();
		sb.append("---Stack Practice---\n");
		sb.append("push: " + stack.push(14)+"\n");
		sb.append("push: " + stack.push(10)+"\n");
		sb.append("pop: " + stack.pop()+"\n");
		sb.append("isEmpty: " + stack.isEmpty()+"\n");
		sb.append("peek: " + stack.peek()+"\n");
		sb.append("--------------------\n");
		
		sb.append("---Queue Practice---\n");
		sb.append("add1: " + queue.add(1)+"\n");
		sb.append("add2: " + queue.add(2)+"\n");
		sb.append("poll: " + queue.poll()+"\n");
		sb.append("peek: " + queue.peek()+"\n");
		sb.append("poll: " + queue.poll()+"\n");
		sb.append("isEmpty: "+queue.isEmpty()+"\n");
		sb.append("--------------------\n");
		System.out.println(sb);
	}
}
