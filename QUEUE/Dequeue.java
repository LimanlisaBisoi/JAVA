public class Dequeue {
    private int maxSize;
   private int front;
    private int rear;
    private int[] queueArray;

    Dequeue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        if (rear < maxSize - 1) {
            queueArray[++rear] = value;
            System.out.println("Enqueued: " + value);
        } else {
            System.out.println("Queue is full. Cannot enqueue " + value);
        }
    }

    public int dequeue() {
        if (front <= rear) {
            int dequeuedValue = queueArray[front++];
            System.out.println("Dequeued: " + dequeuedValue);
            return dequeuedValue;
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
    }

    public static void main(String[] args) {
        Dequeue queue = new Dequeue(3);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.dequeue();
    }
}

/*import java.util.LinkedList;
import java.util.Queue;
public class q2 {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        myQueue.offer("1");
        myQueue.offer("2");
        myQueue.offer("3");
        System.out.println("Queue: " + myQueue);
        String dequeuedElement = myQueue.poll();
        System.out.println("Dequeued element: " + dequeuedElement);
        System.out.println("Queue after dequeue: " + myQueue);
    }
}*/


