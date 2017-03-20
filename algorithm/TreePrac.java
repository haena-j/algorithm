package algorithm;
import java.util.Scanner;
public class TreePrac {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		CustomTree tree = new CustomTree(5);
		for(int i =0; i<5;i++)
			insertData(tree,sc.nextInt());
		inorder(tree);
		System.out.println(searchData(tree, 2));
		
	}
	public static CustomTree insertData(CustomTree tree, int data){
		if(tree == null){
			tree = new CustomTree(data);
		}
		else if(tree.data>data){
			tree.left = insertData(tree.left, data);
		}else if(tree.data<data){
			tree.right = insertData(tree.right, data);
		}else
			System.out.println("이미 존재함");
		return tree;
	}
	public static boolean searchData(CustomTree tree, int data){
		if (tree.data == data) return true;
		else if(tree.data > data && tree.left != null) 
			return searchData(tree.left, data);
		return tree.right != null && searchData(tree.right, data);
	}
	public static void inorder(CustomTree tree){
		if(tree != null) {
			inorder(tree.left);
			System.out.println(tree.data);
			inorder(tree.right);
		}
	}
	static class CustomTree{
		int data;
		CustomTree left;
		CustomTree right;
		
		public CustomTree(int data){
			this.data = data;
			left = null;
			right = null;
		}
		
	}
}
