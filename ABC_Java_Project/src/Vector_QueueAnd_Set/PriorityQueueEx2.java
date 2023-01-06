package Vector_QueueAnd_Set;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx2 {

	public static void main(String[] args) {
	   Queue queue= new PriorityQueue();
	   //Queue always keep smallest element on the top
	   System.out.println("size: "+queue.size());
	   System.out.println("Element of queue: "+queue);
	   //peek() return top most element of the queue
	   //if queue is empty then it will gives null value instead of throwing exception
	   System.out.println("head element of queue using peek(): "+queue.peek());
	   // it will return top most element of queue
	   //if queue is empty it will throw an exception with name "NoSuchElementException"
	   System.out.println("head element of queue using element(): "+queue.element());
	}

}
