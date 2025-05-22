class Nodes {
    int data;
    Nodes next;
    public Nodes(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedLists {
    Nodes head;
    public LinkedLists() {
        this.head = null;
    }
    public void insert(int data) {
        Nodes newNode = new Nodes(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Nodes last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }
    public void printList() {
        Nodes current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class Insert_Nodes {
    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
       
        list.printList();
    }
}

//                  OTHERWISE..................
/*//insertion
public static Node InsBeg(Node start, int regd_no, float mark) {
Node temp = new Node(regd_no, mark);
temp.next = start;
start = temp;
return start;
}

public static Node InsEnd(Node start, int regd_no, float mark) {
Node temp = new Node(regd_no, mark);
if (start == null) {
    start = temp;
    return start;
}
Node p = start;
while (p.next != null)
    p = p.next;
p.next = temp;
return start;
}

public static Node InsAny(Node start) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the position to insert: ");
int pos = sc.nextInt();
if (pos == 1) {
    System.out.println("Enter the regd_no and mark: ");
    int regd_no = sc.nextInt();
    float mark = sc.nextFloat();
    start = InsBeg(start, regd_no, mark);
    return start;
}
Node p = start;
for (int i = 1; i < pos - 1 && p != null; i++)
    p = p.next;
if (p == null)
    System.out.println("There are less than " + pos + " elements");
else {
    System.out.println("Enter the regd_no and mark: ");
    int regd_no = sc.nextInt();
    float mark = sc.nextFloat();
    Node temp = new Node(regd_no, mark);
    temp.next = p.next;
    p.next = temp;
}
return start;
}
*/
