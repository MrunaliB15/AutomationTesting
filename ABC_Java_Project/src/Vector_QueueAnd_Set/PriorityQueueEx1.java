package Vector_QueueAnd_Set;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx1 {

	public static void main(String[] args) {
		Queue queue=new PriorityQueue();
		System.out.println("size: "+queue.size());
		System.out.println("Elements of queue: "+queue);
		// it will remove top most element of queue, if queue is empty dn it gives null value
		System.out.println("Removing element of queue by using poll(): "+queue.poll());
		// it will remove top most element of queue
		//if queue is empty it throw an exception by name "NoSuchElement Exception"
		System.out.println("Removing element of queue using remove(): "+queue.remove());

	}

}
