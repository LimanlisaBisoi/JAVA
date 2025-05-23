class N {
    int data;
    Node next;

    public N(int data) {
        this.data = data;
        this.next = null;
    }
}
class LL {
    Node head;

    public LL() {
        this.head = null;
    }
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Invalid position. Cannot insert at position " + position);
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void printList() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class InsertAt_Beginning {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtBeginning(3);
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        list.printList();
        list.insertAtPosition(4, 1);
        list.printList();
    }
}

