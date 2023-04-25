package day16;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		
		//PriorityQueue pq=new PriorityQueue();
		
		Queue pq =new PriorityQueue();
		
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.offer(5);
		
		System.out.println(pq.size());
		
		System.out.println(pq.element());
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq);
		
		System.out.println(pq.remove(1));
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
	
		
		
		
		
	}

}
