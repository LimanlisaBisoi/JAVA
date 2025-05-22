class Nod {
    int data;
    Node next;
    public Nod(int data) {
        this.data = data;
        this.next = null;
    }
}
class list {
    Node head; 
    public list() {
        this.head = null;
    }
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public void traverse() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class Reverse_LinkedList {
    public static void main(String[] args) {
        list list = new list();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        System.out.println("Original Linked List:");
        list.traverse();
        list.reverse();
        System.out.println("\nReversed Linked List:");
        list.traverse();
    }
}

