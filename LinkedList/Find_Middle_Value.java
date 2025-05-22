import java.util.ArrayList;

class Noe {
	public int data;
	public Noe next;
}

class LinkList {

	public void pushNode(Noe[] headRef, int dataVal) {
		Noe newNode = new Noe();
	// Put in the data
		newNode.data = dataVal;
	// Link the old list of the new node
		newNode.next = headRef[0];
	// move the head to point to the new node
		headRef[0] = newNode;
	}
}

public class Find_Middle_Value {
	public static void main(String[] args) {
		Noe[] head = new Noe[1];
		LinkList list = new LinkList();
		for (int i = 5; i > 0; i--) {
			list.pushNode(head, i);
		}
		ArrayList<Integer> v = new ArrayList<Integer>();
		Noe curr = head[0];
		while (curr != null) {
			v.add(curr.data);
			curr = curr.next;
		}
		System.out.print("Middle Value Of Linked List is : ");
		System.out.println(v.get(v.size() / 2));
	}
}


