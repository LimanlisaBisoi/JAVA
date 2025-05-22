
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Inorder_Traversal {
    Node root;
    private Node sortedArrayToBST(int[] arr, int start, int end) {

        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);

        node.left = sortedArrayToBST(arr, start, mid - 1);

        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
    }

    private void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        int n = sortedArray.length;

        Inorder_Traversal tree = new Inorder_Traversal();
        tree.root = tree.sortedArrayToBST(sortedArray, 0, n - 1);

        System.out.println("Inorder traversal of the constructed binary tree:");
        tree.inOrderTraversal(tree.root);
    }
}

