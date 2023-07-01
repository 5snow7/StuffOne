package dinesh;

import java.util.*;

public class ListPrac {
	
	Queue<Base> queue =new LinkedList<>();
	Stack<Base> stack = new Stack<>();
	ArrayList<Base> array = new ArrayList<>();
	Stack<Stack<Base>> stbase = new Stack<>();
	int total;
	
	ListPrac(int total){
		this.total = total;
		for(int j=0;j<total;j++) {
			Base b = new Base(2*j);
			queue.offer(b);
			stack.push(b);
			array.add(b);
		}
		for(int j=0;j<6;j++) {
			Stack<Base> stack2 = new Stack<Base>();
			for(int k=0;k<10;k++) {
				Base b =new Base(k*2+j);
				stack2.push(b);
			}
		    stbase.push(stack2);
		}
		}
		
	public void print() {//note pop and poll actually remove the element from the list.
		System.out.println(" the queue is: "); 
		for(int j=0;j<total;j++) { 
		 System.out.print(" "+queue.poll().data);
		 }
		System.out.println("\n the stack is: "); 
		 for(int j=0;j<total;j++) { 
			 System.out.print(" "+stack.peek().data);
			 }
		 System.out.println("\n the array is: ");
		 for(int j=0;j<total;j++) { 
			 System.out.print(" "+array.get(j).data);
			 }
		 System.out.println("\n the stbase is: ");
		 for(int j=0;j<6;j++) {
			 System.out.println("\nstbase "+j+" is");
			 for(int k=0;k<stbase.get(j).size();k++) {
				 System.out.print(stbase.get(j).get(k).data+" ");
			 }
			 
			 }
		 System.out.println("\nPrint Method is over");
			   }
   
	 public static void main(String[] args) {
		 ListPrac lp = new ListPrac(15);
		 lp.print();
		 System.out.println(" \npop one from stack, print size and then print");
		 System.out.println("\n "+lp.stack.pop().data+" "+lp.stack.size()+" "+lp.stack);
		 
		 Stack<Base> stb1 = new Stack<>();
		 stb1 = lp.stbase.pop();
		 stb1 = lp.stbase.pop();
		 
		 for(int j=0;j<10;j++) {
		 System.out.print(" "+ stb1.pop().data);
		 }
	 }}

class Base{
	
	int data;
	Base pointer1;
	Base pointer2;
	Base(int data) {
		this.data=data;
	}
}
