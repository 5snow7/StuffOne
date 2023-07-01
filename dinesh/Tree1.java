package dinesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Tree1 {
        
	Node root;
	
	Tree1(){}
	
	public void createTree() {
	//treeEx1();	
	}
	
	public void treeEx2() {
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		Node seventh = new Node(7);
		Node eigth = new Node(8);
		Node ninth = new Node(9);
		Node tenth = new Node(10);
		Node eleventh = new Node(11);
		Node twelve = new Node(12);
		Node thirteenth = new Node(13);
		Node fourteenth = new Node(14);
		Node fifteenth = new Node(15);
		root = first ;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		third.left = sixth;
		third.right = seventh;
		fourth.left = eigth;
		fourth.right = ninth;
		fifth.left = tenth;
		fifth.right = eleventh;
		sixth.left = twelve;
		sixth.right = thirteenth;
		seventh.left = fourteenth;
		seventh.right = fifteenth;
		}
	
	public void treeEx1() {
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		Node seventh = new Node(7);
		root=first;  
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		third.left = sixth;
		third.right = seventh;
	}
		 
	
	public void preOrder(Node node) {
		if(node == null) {return;}
		System.out.print(" "+node.data);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public void iterPreOrder(Node node) {
		
		Stack<Node> stack = new Stack<>();
		if(node == null) {return;}
		stack.push(root);
		while(!stack.isEmpty()) {
			Node nod = stack.pop();
			System.out.print(" "+ nod.data );
			if(nod.right != null) {stack.push(nod.right);}
			if(nod.left != null) {stack.push(nod.left);}
			
		}}
		
		public void inOrder(Node node) {
			if(node == null) {return;}
			inOrder(node.left);
			System.out.print(" "+node.data);
			inOrder(node.right);
		}
		
		public void iterInOrder(Node node) {
			if(node == null) {return;}
			Stack<Node> stack = new Stack<>();
			Node temp = node;
			
			while(!stack.isEmpty()||temp != null) {
				if(temp!=null) {
					stack.push(temp);
					temp=temp.left;
					}else {
				temp = stack.pop();
				System.out.print(" "+temp.data);
				temp = temp.right;
				}}}
		
		public void postOrder(Node node) {
			if(node == null) {return;}
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(" "+node.data);
		}
		
		public void levelOrder(Node node) {//really = to BFS
			Queue<Node> q = new LinkedList<Node>();
			Node temp;
			q.offer(node);
			while(!q.isEmpty()) {
				temp = q.poll();
				System.out.print(temp.data+" ");
				if(temp.left != null) {q.offer(temp.left);}
				if(temp.right != null) {q.offer(temp.right);}
			}
			}
		
	public boolean findNode(Node node, int find) {
		
		//System.out.print(" "+node.data);
		if(find == node.data) {System.out.print(" yes "+node.data);return true;}
		else {
			if( node.left ==null && node.right == null) {return false;}
			else {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
				   if(findNode(node.left,find)) {return true;}
			
		         //if(temp == true) {return true;}
		         //else {
		        	// return
		        	if(findNode(node.right,find)){return true;}                                                                                                                                                                                                  
		              }return false;
		          }
		//return true;
		       }
	
	public static void main(String[] args) {
		Tree1 tree = new Tree1();
		tree.treeEx1();
		System.out.println(" tree.root is "+tree.root.data+"\n and pre-order is:");//////
		tree.preOrder(tree.root);
		System.out.println("\nIn order is: ");
		tree.inOrder(tree.root);
		System.out.println("\n Post order is: ");
		tree.postOrder(tree.root);
		System.out.println("\n Level order is: ");
		tree.levelOrder(tree.root); 
		System.out.println("\ntest for search");
		System.out.println("\nand result is "+tree.findNode(tree.root,6));
		
		tree.treeEx2();
		System.out.println(" tree.root is "+tree.root.data+"\n and pre-order is:");//////
		tree.preOrder(tree.root);
		System.out.println("\nIn order is: ");
		tree.inOrder(tree.root);
		System.out.println("\n Post order is: ");
		tree.postOrder(tree.root);
		System.out.println("\n Level order is: ");
		tree.levelOrder(tree.root);
		System.out.println("\ntest for search");
		
		System.out.println("\nand result is "+tree.findNode(tree.root,12));
	
	}
	
}

class Node{
	int data;
	Node left;
	Node right;
	Node(int dat){
		this.data = dat;
		//this.left = null;
		//this.right = null;
	}
	
}
