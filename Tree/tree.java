package tree;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class Tree {
	public static void main(String args[]) {
		//1 level
		Node root=new Node(25);
		root.left=new Node(10);
		root.right=new Node(35);
		//2 level
		root.left.left=new Node(5);
		root.left.right=new Node(15);
		root.right.left=new Node(30);
		root.right.right=new Node(40);
		//3 level
		root.left.right.left=new Node(13);
		root.left.right.right=new Node(20);
	}
}
