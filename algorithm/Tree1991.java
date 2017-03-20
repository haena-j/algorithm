package algorithm;
import java.util.Scanner;
public class Tree1991 {
	static TreeNode tree = null;
public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	int n = sc.nextInt();
	for(int i=0; i<n; i++){
		findData(tree, sc.next(), sc.next(), sc.next()); 
	}
	preorder(tree);
	System.out.println();
	inorder(tree);
	System.out.println();
	posorder(tree);
	System.out.println();
}
static void preorder(TreeNode tree){
	if(tree!=null){
		System.out.print(tree.data);
		preorder(tree.left);
		preorder(tree.right);
	}
}
static void inorder(TreeNode tree){
	if(tree!=null){
		inorder(tree.left);
		System.out.print(tree.data);
		inorder(tree.right);
	}
}
static void posorder(TreeNode tree){
	if(tree!=null){
		posorder(tree.left);
		posorder(tree.right);
		System.out.print(tree.data);
	}
}
static void findData(TreeNode t, String a, String left, String right){
	if(tree==null){ 
		tree = new TreeNode(a);
		if(!left.equals("."))
			tree.left = new TreeNode(left);
		if(!right.equals("."))
			tree.right = new TreeNode(right);
	}
	if(t!=null){
		if(t.data.equals(a)){
			if(!left.equals("."))
				t.left = new TreeNode(left);
			if(!right.equals("."))
				t.right = new TreeNode(right);
		}else{
			findData(t.left, a, left, right);
			findData(t.right,a, left, right);
		}
	}
}
static class TreeNode{
	String data;
	TreeNode left;
	TreeNode right;
	public TreeNode(String data){
		this.data = data;
		left =null;
		right=null;
	}
}
}
