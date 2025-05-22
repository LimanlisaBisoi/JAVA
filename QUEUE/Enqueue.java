
	import java.util.*;
	public class Enqueue {
        public static void main(String[] args) {
	        Queue<Integer> queue = new LinkedList<>();
	      
	        queue.add(10);
	        queue.add(12);
	        queue.add(15);
	        queue.add(20);
	        System.out.println("Queue: " + queue);

	        int front = queue.remove();
	        System.out.println("Removed element: " + front);
	        System.out.println("Queue after removal: " + queue);

	        queue.add(25);
	        
	        System.out.println("Queue after adding new element: " + queue);
	    }
}