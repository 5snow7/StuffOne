package dinesh;
import java.util.*;

public class QueuePrac {

	
	 
	    public static void main(String args[])
	    {
	        Queue<String> pq = new LinkedList<>();
	 
	        pq.offer("1st, Geek");//See the FIFO 
	        pq.offer("2cd, For");
	        pq.offer("3rd, Geekss");
	        pq.offer("4th, Fred");
	        pq.offer("5th, Alex");
	        System.out.println("Initial Queue " + pq);
	 
	        pq.poll();
	        pq.remove("5th, Alex");
	        System.out.println("After poll and remove " + pq);
	 
	        System.out.println("Poll Method " + pq.poll());
	 
	        System.out.println("Final Queue " + pq);
	    }
	}
	

