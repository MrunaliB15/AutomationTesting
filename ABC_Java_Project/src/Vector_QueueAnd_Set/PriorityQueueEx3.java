package Vector_QueueAnd_Set;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx3 {

	public static void main(String[] args) {
		Queue queue = new PriorityQueue();
        queue.add(123);
        queue.add(10);
        queue.add(245);
        queue.add(105);
        queue.add(50);
        System.out.println("size: "+queue.size());
        System.out.println("Elements of queue: "+queue);
        System.out.println("head element of the queue using element(): "+queue.element());
        System.out.println("head element of the queue using peek(): "+queue.peek());
        System.out.println("iterating the queue element using for each loop");
        for(Object obj: queue) {
        	System.out.println(obj);
        }
        System.out.println("iterating the queue element using iterator");
        Iterator itr=queue. iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        System.out.println("Element of queue: "+queue);
        System.out.println("removing element of queue using remove(): "+queue.remove());
        System.out.println("Element of queue: "+queue);
        System.out.println("removing element of queue using poll(): "+queue.poll());
        System.out.println("Element of queue: "+queue);
        System.out.println("after removing two elements...");
        Iterator itr2=queue.iterator();
        	while(itr2.hasNext()) {
        		System.out.println(itr2.next());
        }
        	//using lambda expression
        	queue.forEach(obj -> { 
        		System.out.println(obj);
        	});
	}
}
