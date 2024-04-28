package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueTest {

	public static void main(String[] args) {
		
		
		PriorityQueue q =new PriorityQueue();
		
		//adding elements addO()  or offer()
		
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");
		

		System.out.println(q);
		
		
		// get head element  // element()  or  peek()
		
		System.out.println(q.element());
		System.out.println(q.peek());
		
		
		//Remove and return element   remove ()  and poll()
		
		//System.out.println(q.remove());
		//System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q);
		
		
		Iterator it = q.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
