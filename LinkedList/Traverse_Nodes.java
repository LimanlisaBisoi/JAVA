class no {
    int data;
    no next;
    public no(int data) {
        this.data = data;
        this.next = null;
    }
}
class Linked {
    Node head;
    public Linked() {
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
    public void traverse() {
        Node current = head;
        System.out.print("After traverse,\n The Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class Traverse_Nodes {
    public static void main(String[] args) {
        Linked list = new Linked();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.traverse();
    }
}